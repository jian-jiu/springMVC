<%--
  Created by IntelliJ IDEA.
  User: 24245
  Date: 2020/7/4
  Time: 15:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getLocalPort() + path + "/";
%>
<html>
<head>
    <base href="<%=basePath%>%>">
    <title>数据</title>
</head>
<body>
<div align="center">
    <h1><%=basePath%></h1>
    <a href="<%=basePath%>">首页</a>
    <table border="1" width="600">
        <tr>
            <td colspan="5"><p align="center"><span>/WEB-INF/view/other.jsp从request作用域获取数据j</span></p></td>
        </tr>
        <%--<c:forEach items="${stuDent}" var="stuDent">--%>
        <tr>
            <td>身份证：${stuDent.id}</td>
            <td> 学号：${stuDent.studentNumber}</td>
            <td> 姓名：${stuDent.name}</td>
            <td> 年龄：${stuDent.age}</td>
            <td> 性别：${stuDent.sex}</td>
        </tr>
        <%--</c:forEach>--%>
    </table>
</div>
</body>
</html>
