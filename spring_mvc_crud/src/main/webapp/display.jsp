<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Hospital List</title>
	<style type="text/css">
	table {
	text-align: center;
	
}
th {
	color: red;
	width: 100px;
	height: 10px;
}
tr {
	width: 20px;
	height: 10px;
}
	</style>
</head>
<body>
	<div align="center">
	<h1>Hospital data</h1>
	<form:form>
		<table border="2px"; style="border-collapse: collapse;">
			<tr>
				<th>ID</th>
				<th>NAME</th>
				<th>WEBSITE</th>
				<th>RATING</th>
				<th>PHONE NO</th>
				<th>EDIT</th>
				<th>DELETE</th>
			</tr>
			<c:forEach var="list" items="${list}">
				<tr>
					<td>${list.getId()}</td>
					<td>${list.getName()}</td>
					<td>${list.getWebSite()}</td>
					<td>${list.getRating()}</td>
					<td>${list.getPhNO()}</td>
					<td><button><a href="getbyid?id=${list.getId()}">Edit</a></button></td>
					<td><button><a href="deletehospital?id=${list.getId()}">Delete</a></button></td>
				</tr>
			</c:forEach>
		</table>
	</form:form>
	</div>
</body>
</html>
