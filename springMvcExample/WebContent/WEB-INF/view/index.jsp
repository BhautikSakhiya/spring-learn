<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style> 
	.error{color:red}
</style>
</head>
<body>
<form action="homePage" modelAttribute="reservation">
Enter First Name: <form:input path="firstname"/><form:errors path="firstname" cssClass="error"/><br><br>
Enter Last Name: <form:input path="lastname"/><form:errors path="lastname" cssClass="error"/><br><br>
Choose Gender: <form:radiobutton path="gender" value="Male"/>
				<form:radiobutton path="gender" value="Female"/><br><br>
Choose Meal: <form:checkbox path="food" value="Breakfast"/>	
			<form:checkbox path="food" value="Launch"/>	
			<form:checkbox path="food" value="Dinner"/>	<br><br>
Departure From: <form:select path="fromCity">
				 <form:option value="Gandhinagar" label="Gandhinagar"/>  
        		 <form:option value="Modinagar" label="Modinagar"/>  
        		 <form:option value="Meerut" label="Meerut"/>  
       			 <form:option value="Amristar" label="Amristar"/> 
       		 </form:select> <br><br>
Arriving At: <form:select path="toCity">
				 <form:option value="Gandhinagar" label="Gandhinagar"/>  
        		 <form:option value="Modinagar" label="Modinagar"/>  
        		 <form:option value="Meerut" label="Meerut"/>  
       			 <form:option value="Amristar" label="Amristar"/>  
       		 </form:select> 						<br><br>
<input type="submit" value="Submit"/>
</form>
</body>
</html>