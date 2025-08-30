import nodes.BaseVisitor;
import nodes.CodeGenerator;
import nodes.CodeGenerator.Output;
import nodes.exception.TypeMismatchException;
import nodes.exception.VariableRedefinitionException;
import nodes.statement.ProgramNode;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.charset.StandardCharsets;


public class Main {
    public static void main(String[] args) throws VariableRedefinitionException, TypeMismatchException {
    BaseVisitor baseVisitor = new BaseVisitor();
    baseVisitor.printAst();

    try {
        ProgramNode program = baseVisitor.parseProgram();
        CodeGenerator generator = new CodeGenerator();
        Output out = generator.generate(program);
        String full = generator.buildFullHtml(out.html, out.css, out.js);
        System.out.println("=== HTML ===\n" + full);
        try {
            Files.write(Paths.get("angular_compiler/output.html"), full.getBytes(StandardCharsets.UTF_8));
            Files.write(Paths.get("angular_compiler/output.css"), out.css.getBytes(StandardCharsets.UTF_8));
            Files.write(Paths.get("angular_compiler/output.js"), out.js.getBytes(StandardCharsets.UTF_8));
            System.out.println("Written to angular_compiler/output.html, output.css, output.js");
        } catch (Exception ioe) {
            ioe.printStackTrace();
        }
    } catch (Exception e) {
        e.printStackTrace();
    }

    }
}