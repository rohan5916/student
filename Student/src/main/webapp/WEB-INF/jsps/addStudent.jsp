<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Student</title>
</head>
<body>
	<h2>Add Student Details</h2>
	
	<form action="addStudentRecord" method="post">
	<pre>
		Id: <input type="text" name="id"/>
		Name: <input type="text" name="name"/>
		Subject: <input type="text" name="subject"/>
		Marks: <input type="text" name="marks"/>
		<input type="submit" value="Add Student"/>
	
	
	</pre>
	</form>
	
	
</body>
</html>