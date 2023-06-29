<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>saveHospital</title>
<style type="text/css">

</style>
</head>
<body>
	<form:form action="saveHospital" modelAttribute="hospital">
	Name : <form:input path="name"/><br><br>
	webSite :<form:input path="webSite"/><br><br>
	rating : <form:input path="rating"/><br><br>
	phNo :<form:input path="phNO"/><br><br>
	<form:button>Register</form:button><br><br>
	
	</form:form>	

</body>
</html>