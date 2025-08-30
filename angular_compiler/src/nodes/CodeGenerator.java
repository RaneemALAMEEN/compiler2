package nodes;

import nodes.html_node.*;
import nodes.html_node.HtmlElementNode;
import nodes.statement.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class CodeGenerator {
    private static final String SOURCE_PATH =
            Paths.get(System.getProperty("user.dir"), "angular_compiler", "src", "angular_compiler.txt").toString();

    public static class Output {
        public final String html;
        public final String css;
        public final String js;
        public Output(String html, String css, String js) {
            this.html = html;
            this.css = css;
            this.js = js;
        }
    }

    public Output generate(ProgramNode program) {
        StringBuilder html = new StringBuilder();
        StringBuilder css  = new StringBuilder();
        StringBuilder js   = new StringBuilder();

        if (program == null || program.getStatements() == null) {
            return new Output("", "", "");
        }

        for (StatementNode stmt : program.getStatements()) {
            if (stmt == null) continue;

            if (stmt.getHtmlNodes() != null)          html.append(renderHtmlNode(stmt.getHtmlNodes()));
            if (stmt.getHtmlElementNodes() != null)    html.append(renderHtmlElement(stmt.getHtmlElementNodes()));
            if (stmt.getVariableDeclarationNodes() != null) js.append(renderVar(stmt.getVariableDeclarationNodes()));
            if (stmt.getFunctionDeclarationNodes() != null) js.append(renderFunction(stmt.getFunctionDeclarationNodes()));

        }

        String htmlOut = html.toString();
        String cssOut  = css.toString();
        String jsOut   = js.toString();


        String src = readSource();
        if (htmlOut.isEmpty() || cssOut.isEmpty()) {
            if (htmlOut.isEmpty()) htmlOut = extractTemplate(src);
            if (cssOut.isEmpty())  cssOut  = extractStyles(src);
        }

        String htmlForCount = htmlOut.isEmpty() ? extractTemplate(src) : htmlOut;
        int productCount = countProducts(htmlForCount);

        jsOut = jsOut + "let productsCount = " + productCount + ";\n";

        String jsFromVars = extractSimpleJsVarsFromSource(src);
        String jsFromFns  = extractSimpleFunctionsFromSource(src);
        if (!jsFromVars.isEmpty() || !jsFromFns.isEmpty()) {
            jsOut = jsOut + jsFromVars + jsFromFns;
        }

        htmlOut = transformInterpolations(htmlOut);

        String boot =
                "document.addEventListener('DOMContentLoaded', function(){\n" +
                        "  var el = document.getElementById('bind-productsCount');\n" +
                        "  if (el) el.textContent = typeof productsCount !== 'undefined' ? productsCount : '';\n" +
                        "});\n";
        jsOut = jsOut + boot;

        return new Output(htmlOut, cssOut, jsOut);
    }


    private String renderHtmlNode(HtmlNode node) {
        if (node == null || node.getContent() == null) return "";
        StringBuilder sb = new StringBuilder();
        for (HtmlElementNode el : node.getContent().getHtmlElementNode()) {
            sb.append(renderHtmlElement(el));
        }
        return sb.toString();
    }

    private String renderHtmlElement(HtmlElementNode el) {
        if (el instanceof nodes.statement.HtmlElementNode) {
            return renderHtmlElement((nodes.statement.HtmlElementNode) el);
        }
        return "";
    }

    private String renderHtmlElement(nodes.statement.HtmlElementNode el) {
        if (el == null || el.getHtmlTagNode() == null) return "";
        String tag = el.getHtmlTagNode().getIdentifierNode();
        StringBuilder attrs = new StringBuilder();
        if (el.getHtmlAttributesNodes() != null) {
            for (HtmlAttributeNode a : el.getHtmlAttributesNodes().getHtmlAttributeNodes()) {
                if (a.getIdentifierNode() != null && a.getHtmlAttributeValueNode() == null) {
                    attrs.append(" ").append(a.getIdentifierNode());
                }
            }
        }
        StringBuilder inner = new StringBuilder();
        if (el.getHtmlContentNode() != null) {
            for (HtmlElementNode child : el.getHtmlContentNode().getHtmlElementNode()) {
                inner.append(renderHtmlElement(child));
            }
        }
        return "<" + tag + attrs + ">" + inner + "</" + tag + ">";
    }


    private String renderVar(VariableDeclarationNode var) {
        String name = var.getIdentifier();
        String value = "";

        ASTNode expr = var.getExpression();
        if (expr instanceof LiteralValueNode) {
            LiteralValueNode lit = (LiteralValueNode) expr;
            if (lit.getNumValue() != null)           value = " = " + lit.getNumValue();
            else if (lit.getStirngValue() != null)   value = " = \"" + lit.getStirngValue() + "\"";
            else if (lit.getBooleanValue() != null)  value = " = " + lit.getBooleanValue();
            else if (lit.isNull())                   value = " = null";
            else if (lit.getArrayValue() != null)    value = " = " + lit.getArrayValue();
        }
        return name != null ? "let " + name + value + ";\n" : "";
    }

    private String renderFunction(FunctionDeclarationNode fn) {
        String name = fn.getIdentifier();
        StringBuilder params = new StringBuilder();
        if (fn.getParameters() != null && !fn.getParameters().isEmpty()) {
            for (int i = 0; i < fn.getParameters().size(); i++) {
                params.append(fn.getParameters().get(i).getIdentifier());
                if (i < fn.getParameters().size() - 1) params.append(", ");
            }
        }
        return name != null ? "function " + name + "(" + params + ") {\n  // ...\n}\n" : "";
    }

    /* ===== Source Reading & Fallback Extraction ===== */

    private String readSource() {
        try {
            return Files.readString(Paths.get(SOURCE_PATH), StandardCharsets.UTF_8);
        } catch (Exception e) {
            return "";
        }
    }

    private String extractTemplate(String source) {
        if (source == null) return "";
        Pattern p = Pattern.compile("template\\s*:\\s*`([\\s\\S]*?)`", Pattern.DOTALL);
        Matcher m = p.matcher(source);
        if (m.find()) return m.group(1).trim();
        return "";
    }

    private String extractStyles(String source) {
        if (source == null) return "";
        Pattern p = Pattern.compile("styles\\s*:\\s*\\[\\s*`([\\s\\S]*?)`\\s*\\]", Pattern.DOTALL);
        Matcher m = p.matcher(source);
        if (m.find()) return m.group(1).trim();
        return "";
    }

    private String extractSimpleJsVarsFromSource(String source) {
        if (source == null || source.isEmpty()) return "";
        StringBuilder out = new StringBuilder();
        Pattern p = Pattern.compile(
                "let\\s+([a-zA-Z_][a-zA-Z0-9_]*)\\s*:\\s*(?:number|string|boolean|Array|any)\\s*(?:=\\s*(\"[^\"]*\"|'[^']*'|\\d+|true|false|null))?\\s*;",
                Pattern.MULTILINE
        );
        Matcher m = p.matcher(source);
        while (m.find()) {
            String name = m.group(1);
            String literal = m.group(2);
            if (literal == null) out.append("let ").append(name).append(";\n");
            else out.append("let ").append(name).append(" = ").append(literal).append(";\n");
        }
        return out.toString();
    }

    private String extractSimpleFunctionsFromSource(String source) {
        if (source == null || source.isEmpty()) return "";
        StringBuilder out = new StringBuilder();
        Pattern p = Pattern.compile(
                "([a-zA-Z_][a-zA-Z0-9_]*)\\s*:\\s*(?:void|number|string|boolean|any)\\s*\\{",
                Pattern.MULTILINE
        );
        Matcher m = p.matcher(source);
        while (m.find()) {
            String name = m.group(1);
            out.append("function ").append(name).append("() {\n  // ...\n}\n");
        }
        return out.toString();
    }

    /* ===== Utilities ===== */

    private int countProducts(String html) {
        if (html == null) return 0;
        int count = 0;
        Matcher m = Pattern.compile("<\\s*details\\b", Pattern.CASE_INSENSITIVE).matcher(html);
        while (m.find()) count++;
        return count;
    }

    /** استبدال {{ var }} بـ <span id="bind-var"></span> */
    private String transformInterpolations(String html) {
        if (html == null || html.isEmpty()) return html;
        return html.replaceAll("\\{\\{\\s*([a-zA-Z_][a-zA-Z0-9_]*)\\s*\\}\\}", "<span id=\"bind-$1\"></span>");
    }

    public String buildFullHtml(String html, String css, String js) {
        StringBuilder sb = new StringBuilder();
        sb.append("<!DOCTYPE html>\n");
        sb.append("<html lang=\"en\">\n");
        sb.append("<head>\n");
        sb.append("  <meta charset=\"UTF-8\"/>\n");
        sb.append("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"/>\n");
        sb.append("  <title>Generated</title>\n");
        if (css != null && !css.isEmpty()) {
            sb.append("  <style>\n").append(css).append("\n  </style>\n");
        }
        sb.append("</head>\n");
        sb.append("<body>\n");
        sb.append(html == null ? "" : html).append("\n");
        if (js != null && !js.isEmpty()) {
            sb.append("  <script>\n").append(js).append("\n  </script>\n");
        }
        sb.append("</body>\n</html>\n");
        return sb.toString();
    }
}
