<%!
Integer id;
String name;
Integer age;
String address;
%>

<%
id=Integer.parseInt(request.getParameter("id"));
name=request.getParameter("name");
address=request.getParameter("address");
age=Integer.parseInt(request.getParameter("age"));
%>


<jsp:useBean id="student" class="in.ineuron.bean.Student" scope="page">
	<jsp:setProperty property="*" name="student" />//all the property name are same so need to specify

</jsp:useBean>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html;charset=ISO-8859-1">
<title>output</title>
</head>
<body>
	<center>
		<h1>STUDENT DETAILS</h1>

		<table border=1>
			<tr>
				<th>ID</th>
				<td>
				<jsp:getProperty property="id" name="student" />
				</td>
			</tr>
			<tr>
				<th>Name</th>
				<td>
				<jsp:getProperty property="name" name="student" />
				</td>
			</tr>
			<tr>
				<th>Address</th>
				<td>
				<jsp:getProperty property="address" name="student" />
				</td>
			</tr>
			<tr>
				<th>Age</th>
				<td>
				<jsp:getProperty property="age" name="student" />
				</td>

			</tr>
		</table>

	</center>

</body>
</html>