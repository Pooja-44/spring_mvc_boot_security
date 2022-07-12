<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<h1>Login</h1><br>


${SPRING_SECURITY_LAST_EXCEPTION.message}

<form action='login' method="post">
<input  type='text' name='username'><br>
<br>
<input  type='password' name='password'><br>
<br>
<button type="submit">Submit</button>
</form>

</center>
</body>
</html>