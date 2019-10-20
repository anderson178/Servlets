<%@ page import="java.util.List" %><%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="C" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <meta charset="UTF-8">
    <title>Mironenko Denis</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
    <table class="table table-bordered" id="names">
        <thead>
        <tr>
            <th>${firstColName}</th>
            <th>${secondColName}</th>
            <th>${thirdColName}</th>
        </tr>

        </thead>
        <tbody>
        <c:forEach items="${products}" var="product">
        <tr>
            <td>${product.position}</td>
            <td>${product.name}</td>
            <td>
                <button type="submit" id="moveDown_${product.position}" class="btn btn-primary">Move down</button>
                <button type="submit" id="moveUp_' + ${product.position} + '" class="btn btn-primary" >Move up</button>
                <button type="submit" id="remove_' + ${product.position} + '" class="btn btn-primary">Remove</button>
            </td>
        </tr>
        </c:forEach>
    </table>
    <form method="post" action="<c:url value="/add"/>">
        <div class="form-group">
            <label for="position">${firstColName}</label>
            <input type="text" class="form-control" id="position" name="position" required>
            <label for="name">${secondColName}</label>
            <input type="text" class="form-control" id="name" name="name">
        </div>
        <button type="submit" id="add" class="btn btn-primary">${nameButtonAdd}</button>
        <button type="submit" id="sort" class="btn btn-primary">${nameButtonSort}</button>
    </form>
</div>
</body>
</html>