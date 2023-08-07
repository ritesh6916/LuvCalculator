<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>
	<h1 align="center">Please register here</h1>
	<div align="center">
		<form:form action="registration-success" modelAttribute="registrationModel" method="get">
			<label>User Name : </label>
			<form:input path="txtname" /><br />
			
			<label>User ID : </label>
			<form:input path="txtuser" /><br />
			
			<label>Password : </label>
			<form:input type="password" path="txtpass" /><br />
			
			<label>Country : </label>
			<form:select path="country">
				<form:option value="ind" label="India" />
				<form:option value="usa" label="United State" />
				<form:option value="sl" label="Srilanka" />
				<form:option value="pak" label="Pakistan" />
				<form:option value="other" label="Other" />
			</form:select><br/>
			
			<label>Hobbies : </label>
			Cricket<form:checkbox path="hobbies" value="cricket" />
			FootBall<form:checkbox path="hobbies" value="football" />
			Coding<form:checkbox path="hobbies" value="coding" />
			Reading<form:checkbox path="hobbies" value="reading" />
			Travel<form:checkbox path="hobbies" value="travel" /><br/>
			
			<label>Gender : </label>
			Male <form:radiobutton path="gender" value="male"/>
			Female <form:radiobutton path="gender" value="female"/><br>
			
			<input type="submit" value="Register">
			
		</form:form>
	</div>
</body>
</html>