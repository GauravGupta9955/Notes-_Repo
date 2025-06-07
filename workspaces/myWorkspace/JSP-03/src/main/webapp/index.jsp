<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
		<h1>Registration Form</h1>

		<form method="get" action='./process.jsp'>
			<table>
				<tr>
					<th>Name</th>
					<td><input type='text' name='name' /></td>
				</tr>
				
				<tr>
					<th>Address</th>
					<td><input type='text' name='address' /></td>
				</tr>
				
				<tr>
					<th>Age</th>
					<td><input type='text' name='age' /></td>
				</tr>
				
				<tr>
					
					<td><input type='submit' name='Reg' /></td>
				</tr>

			</table>

		</form>

	</center>

</body>
</html>