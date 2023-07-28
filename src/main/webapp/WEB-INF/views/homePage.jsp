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
		<form action="process-Home" method="get">
			<tr>
				<td>
					<label for="txt1">Enter Your name: </label> 
					<input type="text" name="txtuname" id="txt1"/>
				</td>
			</tr><br><br>
			<tr>
				<td>
					<label for="txt2">Enter Crush name: </label> 
					<input type="text" name="txtcrush" id="txt2" />
				</td>
			</tr><br><br>
			<tr>
				<td>
					<input type="submit" value="Calculate">
					<input type="reset" value="Reset">
				</td>
			</tr>
		</form>
	</div>
</body>
</html>