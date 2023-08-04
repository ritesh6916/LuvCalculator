<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center"> The Love calculator </h1><hr/><br />
	
	<div align="center">
		<form:form action="process-Home" method="post" modelAttribute="userInfo">
			<tr>
				<td>
					<label for="txt1">Enter Your name: </label> 
					<form:input type="text" path="txtuname" id="txt1"/>
				</td>
			</tr><br><br>
			<tr>
				<td>
					<label for="txt2">Enter Crush name: </label> 
					<form:input type="text" path="txtcrush" id="txt2" />
				</td>
			</tr><br><br>
			<tr>
				<td>
					<input type="submit" value="Calculate">
					<input type="reset" value="Reset">
				</td>
			</tr>
		</form:form>
	</div>
</body>
</html>