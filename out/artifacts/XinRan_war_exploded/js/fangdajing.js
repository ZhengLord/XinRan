$(document).ready(function () {
  //1.出现
  let smallImg = document.getElementById("smallImg");
  let smallDiv = document.getElementById("smallDiv");
  let bigDiv = document.getElementById("bigDiv");
  smallImg.onmouseover = function () {
    smallDiv.style.display = "block";
    bigDiv.style.display = "block";
  };
  smallImg.onmouseout = function () {
    smallDiv.style.display = "none";
    bigDiv.style.display = "none";
  };
  //2.小div移动方向和大图相反
  //2.1鼠标绑定遮挡层
  //核心是鼠标移动距离大于遮挡层移动距离的一半
  //2.2吧小div和大图移动
  //3.核心：整个放大镜存在一个比例
  //小div/小图=大div/大图
  //100/300=300/900满足
  //分析四个元素的尺寸大小  放大了三倍
  smallImg.onmousemove = function (e) {
    var e = e || window.Element;
    var x = e.clientX - 50 - smallImg.getBoundingClientRect().left;
    var y = e.clientY - 50 - smallImg.getBoundingClientRect().top;
    //对移动范围判断
    if (x >= 200) {
      x = 200;
    }
    if (x <= 0) {
      x = 0;
    }
    if (y >= 200) {
      y = 200;
    }
    if (y <= 0) {
      y = 0;
    }
    //小div移动
    smallDiv.style.left = x + "px";
    smallDiv.style.top = y + "px";
    //大图移动
    bigImg.style.left = -3 * x + "px";
    bigImg.style.top = -3 * y + "px";
  };
});
