<%--
  Created by IntelliJ IDEA.
  User: thanh
  Date: 5/12/2021
  Time: 2:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="/">List Product</a>
<c:if test="${message != null}">
    <c:out value="${message}"/>
</c:if>
<h3>Create Product</h3>
<form action="?action=create" method="post">
    <p>Id: <input type="text" name="id"></p>
    <p>Name: <input type="text" name="name"></p>
    <p>Price: <input type="text" name="price"></p>
    <input type="submit" value="Create">
</form>
</body>
</html>

