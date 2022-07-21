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
    <title>register</title>
    <base href="<%=basePath%>">
    <link href="bootstrap-3.3.7-dist/css/bootstrap.css" rel="stylesheet" />
    <link href="css/register.css" rel="stylesheet" />
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
<%--            <span><%=request.getAttribute("info")==null?"":request.getAttribute("info")%></span>--%>
<%--          </div>--%>

          <div class="col-form">
            <form action="userServlet" method="post" class="reg-form" id="reg">
              <input type="hidden" name="action" value="register">
              <div class="form-group">
                <label for="exampleInputEmail1">昵称</label>
                <input
                  name="name"
                  type="text"
                  class="form-control"
                  id="exampleInputEmail2"
                  placeholder="请输入昵称"
                  value="<%=request.getAttribute("username")==null?"":request.getAttribute("username")%>"
                />
              </div>

              <div class="form-group">
                <label for="exampleInputPassword1">密码</label>
                <input
                  name="password"
                  type="password"
                  class="form-control"
                  id="exampleInputPassword1"
                  placeholder="请输入密码"
                />
              </div>

              <div class="form-group">
                <label for="exampleInputPassword1">确认密码</label>
                <input
                  name="rpassword"
                  type="password"
                  class="form-control"
                  id="exampleInputPassword2"
                  placeholder="请再次输入密码"
                />
              </div>

              <div class="form-group" id="tel">
                <label for="exampleInputEmail1">电话号码</label>
                <input
                  name="tel"
                  type="text"
                  class="form-control"
                  id="exampleInputEmail1"
                  placeholder="请输入电话号码"
                />
              </div>

              <div class="sex">
                <label class="radio-inline">
                  <input
                    type="radio"
                    name="optionsRadiosinline"
                    id="optionsRadios3"
                    value="男"
                    checked
                  />
                  男
                </label>
                <label class="radio-inline">
                  <input
                    type="radio"
                    name="optionsRadiosinline"
                    id="optionsRadios4"
                    value="女"
                  />
                  女
                </label>
              </div>

              <div class="form-group" id="email">
                <label for="email">邮箱地址</label>
                <input
                  name="email"
                  type="email"
                  class="form-control"
                  id="exampleInputEmail3"
                  placeholder="请输入邮箱地址"
                  value="<%=request.getAttribute("email")==null?"":request.getAttribute("email")%>"
                />
              </div>

              <button type="submit">
                <div class="reg-submit">注册</div>
              </button>
              <div id="huixian">${requestScope.info}</div>
            </form>
          </div>
        </div>
        <div class="col-md-2"></div>
      </div>
    </mainbody>
    <script src="js/register.js"></script>
  </body>
</html>
