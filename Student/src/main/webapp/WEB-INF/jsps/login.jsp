<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
<a href="showReg">Register Here</a>
		<h2>Login Here</h2>

	<form action="verifyLogin" method="post">
		<pre>
		${error }
			EmailId: <input type="text" name="emailId"/>
			Password: <input type="password" name="password"/>
			<input type="submit" value="Login"/>
		
		
		</pre>
	</form>
	

</body>
</html>