<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register Here</title>
</head>
<body>
<a href="showLoginPage">Login Here</a>

	<h2>Register Here</h2>
		<form action="saveReg" method="post">
	<pre>
		First Name: <input type="text" name="firstName"/>
		Last Name: <input type="text" name="lastName"/>
		Email: <input type="text" name="email"/>
		Password: <input type="text" name="password"/>
		<input type="submit" value="Submit"/>


	
	</pre>
	</form>
</body>
</html>