<%--
  Created by IntelliJ IDEA.
  User: john
  Date: 2017/7/12
  Time: 14:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <title></title>
</head>
<body>

登入成功!
<br>
您好!${user.username}
<br>
<a href="/login.jsp">返回</a>
</body>
</html>