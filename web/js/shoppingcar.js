$(document).ready(function () {
  function sumf() {
    let it = document.getElementsByClassName("itemprice");
    let p = 0;
    if (it != null) {
      for (let i = 0; i < it.length; i++) {
        p += Number(it[i].childNodes[0].nodeValue);
      }
      document.getElementsByClassName("sumprice")[0].firstChild.nodeValue =
        String(p);
    }
  }
  sumf();
  $(".btn-del").click(function () {
    $(this).parent().remove();
    sumf();
  });
});
