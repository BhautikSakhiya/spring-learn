<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<style> 
	.error{color:red}
</style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form:form action="processForm" modelAttribute="customer">

First Name: <form:input path="firstName"/><br><br>
Last Name*: <form:input path="lastName"/>
			<form:errors path="lastName" cssClass="error"/><br><br>
Select Pass:<form:input path="freePasses"/>
			<form:errors path="freePasses" cssClass="error"/><br><br>
Select Postal Code:<form:input path="postalCode"/>
			<form:errors path="postalCode" cssClass="error"/><br><br>
Select Course Code:<form:input path="courseCode"/>
			<form:errors path="courseCode" cssClass="error"/><br><br>
<input type="submit" value="Submit"/>
</form:form>
</body>
</html>