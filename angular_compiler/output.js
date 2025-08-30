let productsCount = 4;
let counter = 0;
document.addEventListener('DOMContentLoaded', function(){
  var el = document.getElementById('bind-productsCount');
  if (el) el.textContent = typeof productsCount !== 'undefined' ? productsCount : '';
});
