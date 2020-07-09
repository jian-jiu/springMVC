<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getLocalPort() + path + "/";
%>
<html>
<head>
    <base href="<%=basePath%>%>">
    <title>简九</title>
    <script type="text/javascript" src="js/jquery-3.4.1.js"></script>
    <script type="text/javascript">
        $(function () {
            $("button").click(function () {
                alert("yyyy")
                $.ajax({
                    url: "test/ajax.do",
                    data: {
                        name: "小明",
                        age: 30
                    },
                    type: "post",
                    dataType: "json",
                    success: function (resp) {
                        alert(resp)
                        alert(resp.name + "       " + resp.age)
                    }
                })
            })
        })
    </script>
</head>
<body>
<div align="center">
    <table border="1">
        <p>第一个springmvc学生项目</p>
        <form action="${pageContext.request.contextPath}/test/some.do" method="post">
            <td>身份证：<input type="text" name="rid"><br/></td>
            <tr/>
            <td>学号：<input type="text" name="rnum"><br/></td>
            <tr/>
            <td>姓名：<input type="text" name="rname"><br/></td>
            <tr/>
            <td>年龄：<input type="text" name="rage"><br/></td>
            <tr/>
            <td>性别：<input type="radio" name="rsex" value="男" checked="checked">男
                <input type="radio" name="rsex" value="女">女<br/></td>
            <tr/>
            <td align="center"><input type="submit" value="提交参数"></td>
        </form>
    </table>
    <br>
    <table border="1">
        <p>第一个springmvc学生项目</p>
        <form action="${pageContext.request.contextPath}/test/other.do" method="post">
            <td>身份证：<input type="text" name="id"><br/></td>
            <tr/>
            <td>学号：<input type="text" name="studentNumber"><br/></td>
            <tr/>
            <td>姓名：<input type="text" name="name"><br/></td>
            <tr/>
            <td>年龄：<input type="text" name="age"><br/></td>
            <tr/>
            <td>性别：<input type="radio" name="sex" value="男" checked="checked">男
                <input type="radio" name="sex" value="女">女<br/></td>
            <tr/>
            <td align="center"><input type="submit" value="提交参数"></td>
        </form>
    </table>
    <button id="btn">提交ajax数据</button>
</div>
</body>
</html>
