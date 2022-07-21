<%--
  Created by IntelliJ IDEA.
  User: yuxin
  Date: 2022/6/29
  Time: 20:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>good_edit</title>
    <link href="bootstrap-3.3.7-dist/css/bootstrap.css" rel="stylesheet" />
    <link href="css/checkout.css" rel="stylesheet" />
    <link rel="stylesheet" href="css/header.css" />
    <script src="jqueryvalidate/lib/jquery.js"></script>
    <script src="jqueryvalidate/dist/jquery.validate.min.js"></script>
    <script src="jqueryvalidate/dist/localization/messages_zh.min.js"></script>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<mainbody>
    <div class="row">
        <div class="col-md-2"></div>

        <div class="col-md-8">
            <div class="tempblank"></div>
            <div class="col-form">订单已结算订单号是${sessionScope.orderId}</div>
        </div>
        <div class="tempblank"></div>
        <div class="col-md-2"></div>
    </div>
</mainbody>
<!-- <script src="js/register.js"></script> -->
</body>
</html>
