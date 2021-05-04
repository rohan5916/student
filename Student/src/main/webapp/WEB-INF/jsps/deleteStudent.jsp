<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Student Record</title>
</head>
<body>
	<form action="deleteStudentRecord" method="post">
	<pre>
		Student Id: <input type="text" name="id"  />
		<input type="submit" value="Delete Record"/>
	
	</pre>
	</form>

</body>
</html>