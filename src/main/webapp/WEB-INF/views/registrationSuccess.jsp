<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<body>
<h1>Your Registration is Successful</h1>
<h2>Following is the result Entered...</h2>

	user:     ${registrationModel.txtname}<br>
	Gender:   ${registrationModel.gender}<br/>
	User ID:  ${registrationModel.txtuser}<br>
	Password: ${registrationModel.txtpass}<br/>
	Country:  ${registrationModel.country}<br/>
	Hobbies:  ${registrationModel.hobbies}

</body>
</html>