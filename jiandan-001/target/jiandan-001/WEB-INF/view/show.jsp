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
    <table border="1" width="500">
        <tr>
            <td colspan="5"><p align="center"><span>学生数据</span></p></td>
        </tr>
        <c:forEach items="${stuDents}" var="stuDent">
            <tr>
                <td>身份证：${stuDent.id}</td>
                <td> 学号：${stuDent.studentNumber}</td>
                <td> 姓名：${stuDent.name}</td>
                <td> 年龄：${stuDent.age}</td>
                <td> 性别：${stuDent.sex}</td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
