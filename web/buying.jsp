<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>购买</title>
    <link rel="stylesheet" href="css/buying.css" />
    <link rel="stylesheet" href="bootstrap-3.3.7-dist/css/bootstrap.css" />
    <link rel="stylesheet" href="css/header.css" />
    <script src="jquery-3.4.1/jquery-3.4.1.min.js"></script>
  </head>
  <body>
   <jsp:include page="header.jsp"></jsp:include>
    <mainbody>
      <div class="mainbody-temp"></div>

      <div class="product">
        <div class="product-b">新款小米手机</div>
        <div class="product-jiage">价格￥399.00</div>
        <div class="fangdajing">
          <div class="fang-temp"></div>
          <div id="fang">
            <div id="smallImg">
              <div id="smallDiv"></div>
            </div>
            <!-- 放大镜的小窗是在smallimg的background-image里 -->
            <!--  -->
            <!--  -->
            <!--  -->
            <div id="bigDiv">
              <img src="image/phone1.jpg" alt="" id="bigImg" />
            </div>
          </div>
          <div class="fang-temp"></div>
        </div>
        <div class="product-buy">
          <div class="product-size-wrap">
            <hr />
            <p class="product-size-wrap-1">产品介绍</p>
            <p class="product-size-wrap-2">
              120X 超远变焦 / 120W 秒充科技 / 120Hz刷新率 + 240Hz采样率 /
              骁龙865旗舰处理器 / 双模5G / 10倍混合光学变焦 /
              OIS光学防抖+EIS数字防抖 / 2000万超清前置相机 /
              双串蝶式石墨烯基锂离子电池 / 等效4500mAh大电量 / 120W
              有线秒充+50W无线秒充+10W无线反充 / WiFi 6 / 多功能NFC / 红外遥控
            </p>
          </div>

          <!--  -->
          <div class="product-select-num">
            <div class="select-line lineheight14">
              <div class="text-left">数量</div>
              <div class="numbox text-right">
                <select id="num-box">
                  <option value="1">1</option>
                  <option value="2">2</option>
                  <option value="3">3</option>
                  <option value="4">4</option>
                  <option value="5">5</option>
                </select>
              </div>
            </div>
            <p id="inventory-tips" style="display: none"></p>
          </div>
          <div class="btnbox">
            <a class="now-buy-btn" id="now-buy-btn"><span>立即购买</span></a>
            <a class="add-buycart-btn" id="add-buycart-btn"
              ><span><i></i>添加到购物车</span></a
            >
          </div>
        </div>
      </div>

      <div class="mainbody-temp"></div>
    </mainbody>

    <script src="js/fangdajing.js"></script>
  </body>
</html>
