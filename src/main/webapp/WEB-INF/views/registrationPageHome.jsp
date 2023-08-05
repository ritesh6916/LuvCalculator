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
	<form:form modelAttribute="registrationModel">
		<label>User Name : </label>
		<form:input path="txtname" /><br />
		
		<label>User ID : </label>
		<form:input path="txtuser" /><br />
		
		<label>Password : </label>
		<form:input path="txtpass" /><br />
		
		<label>Country : </label>
		<form:select path="country">
			<form:option value="ind" label="India" />
			<form:option value="usa" label="United State" />
			<form:option value="sl" label="Srilanka" />
			<form:option value="pak" label="Pakistan" />
			<form:option value="other" label="Other" />
		</form:select>
		
		
		
	</form:form>
</body>
</html>