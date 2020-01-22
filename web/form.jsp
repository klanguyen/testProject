<%--
  Created by IntelliJ IDEA.
  User: nnguyen1
  Date: 2020-01-21
  Time: 20:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Demo Form</title>
</head>
<body>
    <form method="get" action="hello">
        <input type="text" value="tearex" name="favDino">
        <input type="submit" value="Submit with GET"><br/>
    </form>
    <form method="post" action="hello">
        <input type="text" value="Peach" name="favTea">
        <input type="submit" value="Submit with POST"><br/>
    </form>
</body>
</html>
