<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Document</title>
    <link rel="stylesheet" href="bootstrap-3.3.7-dist/css/bootstrap.css" />
    <link rel="stylesheet" href="css/shoppingcar.css" />
    <link rel="stylesheet" href="css/header.css" />
    <script src="jquery-3.4.1/jquery-3.4.1.min.js"></script>
    <script type="text/javascript">
      $(document).ready(function () {
        $(".btn-puy").click(function (){
          location.href="http://localhost:8080/XinRan/orderServlet?action=createOrder"
        })
        $(".amountin").change(function () {
          var count = this.value;
          if (confirm("确认要修改数量为" + count + "吗？")) {
            var id = $(this).parent().parent().attr("goodId");
            location.href =
                    "http://localhost:8080/XinRan/cartServlet?action=updateCount&count=" +
                    count +
                    "&id=" +
                    id;
          } else {
            this.value = this.defaultValue;
          }
        });
        $(".btn-del").click(function () {
          if (confirm("确定要删除吗？")) {
            var goodId = $(this).attr("goodId");
            // alert(goodId);
            location.href =
                    "http://localhost:8080/XinRan/cartServlet?action=deleteItem&id=" +
                    goodId;
          }
        });
        $(".btn-clear").click(function () {
          if (confirm("确定要清空购物车吗？")) {
            location.href =
                    "http://localhost:8080/XinRan/cartServlet?action=clear";
          }
        });
      });
    </script>
  </head>
  <body>
  <jsp:include page="header.jsp"></jsp:include>
  <mainbody>
    <c:if test="${not empty sessionScope.cart.items}">

      <div class="sum">
        <div class="sum-logo">购物车共有 ${sessionScope.cart.totalCount} 件商品</div>
        <div class="sum-desc">
          <span></span>共计<span class="sumprice">￥${sessionScope.cart.totalPrice}</span>
          <button class="btn-puy"><div>结算</div></button>
        </div>
      </div>
    </c:if>

    <div class="comment">
      <div class="shoppingitemblank">
        <div class="com-discblank">商品信息</div>
        <div class="amountblank">数量</div>
        <div class="itempriceblank">单价</div>
        <div class="itemsumpriceblank">金额</div>
        <div class="btn-delblank"></div>
      </div>
    <c:if test="${empty sessionScope.cart.items}">
      <div class="shoppingitemempty">
        <a href="index.jsp">购物车为空!快和小伙伴们去购物吧！</a>
      </div>

    </c:if>
    <c:if test="${not empty sessionScope.cart.items}">
      <c:forEach items="${sessionScope.cart.items}" var="entry">
        <div class="shoppingitem" goodId="${entry.value.id}">
          <div class="com-disc">
            <img src="${entry.value.imgPath}" alt="desc" class="desc-img" /><span
                  class="desc-txt"
          >${entry.value.name}</span
          >
          </div>
          <div class="amount">
            <input type="text" class="amountin" value="${entry.value.count}" />
          </div>
          <div class="itemprice">${entry.value.price}</div>
          <div class="itemsumprice">${entry.value.totalPrice}</div>
          <button class="btn-del" goodId="${entry.value.id}"><div>删除</div></button>
        </div>
      </c:forEach>
      <div class="temp">
        <button class="btn-clear"><div>清空</div></button>
      </div>
    </c:if>



    </div>
  </mainbody>

  </body>
</html>
