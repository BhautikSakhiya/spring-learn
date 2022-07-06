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

Your UserName is: ${param.firstName} ${customer.lastName}
<br>
You get ${customer.freePasses} free passes
<br>
Your postal code ${customer.postalCode }
<br>
Your course ${customer.courseCode }
</body>
</html>