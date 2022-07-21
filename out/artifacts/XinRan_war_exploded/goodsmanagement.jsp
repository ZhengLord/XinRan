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
    <link rel="stylesheet" href="css/goodsmanagement.css" />
    <link rel="stylesheet" href="css/header.css" />
    <script src="jquery-3.4.1/jquery-3.4.1.min.js"></script>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<mainbody>
    <div class="comment">
        <div class="shoppingitemblank">
            <div class="com-discblank">商品信息</div>
            <div class="itempriceblank">价格</div>
            <div class="salesblank">销量</div>
            <div class="repertoryblank">库存</div>
            <div class="caozuoblank">操作</div>
        </div>
        <c:forEach items="${requestScope.goods}" var="good">
            <div class="shoppingitem">
                <div class="com-disc">
                    <img src="${good.imgPath}" alt="desc" class="desc-img" /><span
                        class="desc-txt"
                >${good.name}</span
                >
                </div>
                <div class="itemprice">${good.price}</div>
                <div class="sales">${good.sales}</div>
                <div class="repertory">${good.stock}</div>
                <div class="caozuo">
                    <button class="btn-change">修改</button>
                    <button class="btn-del">删除</button>
                </div>
            </div>
        </c:forEach>


    </div>
</mainbody>
</body>
</html>

