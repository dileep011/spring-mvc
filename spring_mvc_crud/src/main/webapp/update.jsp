<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>saveHospital</title>
</head>
<body>
	<form:form action="updatehospital" modelAttribute="hospital">
	Id : <form:input path="id" readonly="true"/>
	Name : <form:input path="name"/>
	webSite :<form:input path="webSite"/>
	rating : <form:input path="rating"/>
	phNo :<form:input path="phNO"/>
	<form:button>Update</form:button>
	
	</form:form>	

</body>
</html>