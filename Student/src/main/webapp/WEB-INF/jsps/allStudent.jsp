<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="menu.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Student Details</title>
</head>
<body>
	<table border='1'>
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Subject</th>
			<th>Marks</th>
		</tr>

		<c:forEach items="${student}" var="student">
			<tr>
				<td>${student.id}</td>
				<td>${student.name}</td>
				<td>${student.subject}</td>
				<td>${student.marks}</td>
			</tr>
		</c:forEach>

	</table>

</body>
</html>