<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>匡威男子鞋类</title>
    <link rel="stylesheet" href="bootstrap-3.3.7-dist/css/bootstrap.css" />
    <link href="css/show.css" rel="stylesheet" />
    <link rel="stylesheet" href="css/header.css" />
    <script src="jquery-3.4.1/jquery-3.4.1.min.js"></script>
    <script type="text/javascript">
      $(document).ready(function () {
        $(".btnaddshopping").click(function () {
          var goodsId = $(this).attr("goodid");
           location.href = "http://localhost:8080/XinRan/cartServlet?action=addItem&id="+goodsId;
          //发ajax请求
          // $.getJSON("http://localhost:8080/XinRan/cartServlet","action=ajaxAddItem&id="+goodsId,function (data) {
          //
          // })
        });
      });
    </script>
  </head>
  <body>
  <jsp:include page="header.jsp"></jsp:include>
  <mainbody class="mainbody">
<%--    <div class="category-title">--%>
<%--      <c:choose>--%>
<%--        <c:when test="${empty requestScope.goods}"></c:when>--%>
<%--        <c:when test="${requestScope.goods[0].}"></c:when>--%>
<%--      </c:choose>--%>
<%--      <h1></h1>--%>
<%--    </div>--%>
    <div class="first-floor">
      <div class="mainbody-temp"></div>

      <div class="second-floor">
        <div class="product-list">
<c:forEach items="${requestScope.goods}" var="good">
          <div class="shoes" >
            <a href="#"
            ><img src="${good.imgPath}" alt="shoes1" height="150" width="150"
            /></a>
            <br />
            <a href="#" class="shoes-textlink"
            >${good.name}</a
            >
            <p>
              <span>￥${good.price}</span>
              <span>库存：${good.stock}</span>
              <span>销量：${good.sales}</span>
            </p>
            <button goodid="${good.id}" class="btnaddshopping">购物车</button>
          </div>
</c:forEach>
        </div>
      </div>
      <div class="mainbody-temp"></div>
    </div>
  </mainbody>

    <!-- 悬浮窗 -->
    <div class="go-top">
      <a href="#">返回<br />顶部</a>
    </div>
  </body>
</html>
