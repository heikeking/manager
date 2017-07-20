<%--
  Created by IntelliJ IDEA.
  User: john
  Date: 2017/7/11
  Time: 19:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>用户登录</title>
</head>

<body>
<form action="/test/login" method="post" id="myform">
    <input type="text" id="username" name="username"/>
    <input type="password" id="password" name="password"/>
    <input type="submit" value="提交" id="login" />
</form>
</body>

</html>
