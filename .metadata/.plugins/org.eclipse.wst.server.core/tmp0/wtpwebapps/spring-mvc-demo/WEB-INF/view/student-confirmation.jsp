<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
Your User Name is: ${student.firstName } ${student.lastName }
<br>
country: ${student.country }<br>
language: ${student.lang }<br>
OS: 
<ul>
<c:forEach var="temp" items="${student.os }">
<li>${temp }</li>'
</c:forEach>
</ul>
</body>
</html>