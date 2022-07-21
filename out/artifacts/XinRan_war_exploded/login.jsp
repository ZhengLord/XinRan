<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
  String basePath=request.getScheme()
  +"://"
  +request.getServerName()
  +":"
  +request.getServerPort()
  +request.getContextPath()
  +"/";
%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>login</title>
    <base href="<%=basePath%>">
    <link href="bootstrap-3.3.7-dist/css/bootstrap.css" rel="stylesheet" />
    <link href="css/login.css" rel="stylesheet" />
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
          <div class="col-img">
            <img
              src="image/register.jpg"
              alt="reg-img"
              width="400px"
              height="400px"
            />
          </div>

<%--          <div>--%>
<%--            <span><%=request.getAttribute("info")==null?"请输入用户名和密码":request.getAttribute("info")%></span>--%>
<%--          </div>--%>

          <div class="col-form">
            <form action="userServlet" class="reg-form" id="log" method="post">
              <input type="hidden" name="action" value="login">
              <div class="form-group" id="tel">
                <label for="exampleInputEmail1">电话号码</label>
                <input
                  type="text"
                  class="form-control"
                  id="exampleInputEmail1"
                  placeholder="请输入电话号码"
                  name="tel"
                  value="<%=request.getAttribute("phone")==null?"":request.getAttribute("phone")%>"
                />
              </div>
              <div class="form-group">
                <label for="exampleInputPassword1">密码</label>
                <input
                  type="password"
                  class="form-control"
                  id="exampleInputPassword1"
                  placeholder="请输入密码"
                  name="password"
                />
              </div>

              <button type="submit">
                <div class="reg-submit">登录</div>
              </button>
              <div id="huixian">${requestScope.info}</div>
            </form>

          </div>
        </div>

        <div class="col-md-2"></div>
      </div>
      <script src="js/login.js"></script>
    </mainbody>
  </body>
</html>
