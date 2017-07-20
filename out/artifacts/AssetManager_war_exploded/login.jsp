<%--
  Created by IntelliJ IDEA.
  User: john
  Date: 2017/7/12
  Time: 14:14
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
<body style="background-image:url(/assets/layouts/layout/img/login.jpg); background-repeat:no-repeat;background-size: 100% 100%;">
<br>
<br>
<br>
<br>
<br>
<h1 style="text-align: center">江苏软件园智慧园资产管理系统</h1>
<form name="form1" action="/test/login" method="post" >
    <table width="300" border="1" align="center">
        <tr>
            <td colspan="2">登入窗口</td>
        </tr>
        <tr>
            <td>用户名:</td>
            <td><input type="text" name="userName">
            </td>
        </tr>
        <tr>
            <td>密码:</td>
            <td><input  type="password" name="password"/>
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" name="submit" value="登录"/>
            </td>


        </tr>
    </table>
</form>
</body>
</html>
