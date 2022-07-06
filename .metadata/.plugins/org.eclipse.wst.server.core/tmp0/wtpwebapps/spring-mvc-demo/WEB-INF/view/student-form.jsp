<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form:form action="processForm" modelAttribute="student">
Enter First Name:<form:input path="firstName"/><br><br>
Enter Last Name:<form:input path="lastName"/><br><br>
Select Country:<form:select path="country"><br><br>
<form:options items="${student.countryOptions }"/>
</form:select><br>
Select Language:
<form:radiobutton path="lang" value="java" />Java
<form:radiobutton path="lang" value="go"/>Go
<form:radiobutton path="lang" value="python"/>Python
<form:radiobutton path="lang" value="c"/>C
<br>
Select OS:
Linux<form:checkbox path="os" value="linux"/>
Mac os<form:checkbox path="os" value="mac os"/>
windows<form:checkbox path="os" value="windows"/>
<br>
<input type="submit" value="submit"/><br><br>

</form:form>
</body>
</html> 