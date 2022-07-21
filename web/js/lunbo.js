$(document).ready(function () {
  let num = 1;
  let i = 0;
  let timer = null;
  swiper();
  function swiper() {
    timer = setInterval(() => {
      //图片
      num++;
      if (num > 5) {
        $(".warp-navs").css("left", -1409);
        num = 2;
      }
      // $(".warp-navs").css("left", -num * 1400);
      $(".warp-navs").animate({ left: -num * 1409 }, 500);
      //小圆点
      i++;
      if (i > 3) {
        i = 0;
      }
      $(".warp-bots li").eq(i).addClass("active");
      $(".warp-bots li").eq(i).siblings().removeClass("active");
    }, 2000);
  }

  //鼠标移入清除定时器
  $(".warp-box").mouseover(() => {
    clearInterval(timer);
  });
  //鼠标移出开始定时器
  $(".warp-box").mouseout(() => {
    swiper();
  });
});
