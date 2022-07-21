<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<header>
  <nav class="navbar navbar-default">
    <div class="container-fluid">
      <!-- Brand and toggle get grouped for better mobile display -->
      <div class="navbar-header">
        <button
                type="button"
                class="navbar-toggle collapsed"
                data-toggle="collapse"
                data-target="#bs-example-navbar-collapse-1"
                aria-expanded="false"
        >
          <span class="sr-only">Toggle navigation</span>
          <span class="icon-bar"></span>
          <span class="icon-bar"></span>
          <span class="icon-bar"></span>
        </button>
        <a class="navbar-brand" href="index.jsp">欣然</a>
      </div>

      <!-- Collect the nav links, forms, and other content for toggling -->
      <div
              class="collapse navbar-collapse"
              id="bs-example-navbar-collapse-1"
      >
        <form class="navbar-form navbar-left">
          <div class="form-group">
            <input type="text" class="form-control" placeholder="Search" />
          </div>
          <button type="submit" class="btn btn-default">搜索</button>
        </form>
        <ul class="nav navbar-nav navbar-right">
         <c:if test="${empty sessionScope.user}">
           <li><a href="login.jsp">登录</a></li>
           <li>
             <a href="register.jsp">注册</a>
           </li>
         </c:if>
          <c:if test="${not empty sessionScope.user}">
            <li><a href="#">欢迎你: ${sessionScope.user.username}</a></li>
            <li><a href="userServlet?action=logout">注销</a></li>
            <li><a href="shoppingcar.jsp">购物车</a></li>
            <li class="dropdown">
              <a
                      href="#"
                      class="dropdown-toggle"
                      data-toggle="dropdown"
                      role="button"
                      aria-haspopup="true"
                      aria-expanded="false"
              >我的信息 <span class="caret"></span
              ></a>
              <ul class="dropdown-menu">
                <li><a href="#">查看信息</a></li>

                <li role="separator" class="divider"></li>
                <li><a href="messagechange.html">修改信息</a></li>
              </ul>
            </li>
          </c:if>


        </ul>
      </div>
      <!-- /.navbar-collapse -->
    </div>
    <!-- /.container-fluid -->
    <div class="fenlei">
      <div class="fenlei-blank"></div>
      <div>
        <a href="http://localhost:8080/XinRan/goodsServlet?action=list1&category=4">书籍</a>
        <span class="glyphicon glyphicon-triangle-bottom"></span>
      </div>
      <div>
        <a href="http://localhost:8080/XinRan/goodsServlet?action=list1&category=1
">服装</a>
        <span class="glyphicon glyphicon-triangle-bottom"></span>
      </div>
      <div>
        <a href="http://localhost:8080/XinRan/goodsServlet?action=list1&category=2">电子</a>
        <span class="glyphicon glyphicon-triangle-bottom"></span>
      </div>
      <div>
        <a href="http://localhost:8080/XinRan/goodsServlet?action=list1&category=3">生活</a>
        <span class="glyphicon glyphicon-triangle-bottom"></span>
      </div>
      <div class="fenlei-blank"></div>
    </div>
  </nav>
</header>

