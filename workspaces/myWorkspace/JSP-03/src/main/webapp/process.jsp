<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%!String name;
	String address;
	Integer age;

	//Resource for JDbc
	static Connection connection = null;
	static Statement stmt = null;
	ResultSet resultset = null;

	static {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql:///ineuron";
			String username = "root";
			String password = "Gaurav45";
			connection = DriverManager.getConnection(url, username, password);
			stmt = connection.createStatement();
		} catch (SQLException ex) {

		} catch (ClassNotFoundException e) {

		}
	}%>

	<%
	name = request.getParameter("name");
	age = Integer.parseInt(request.getParameter("age"));
	address = request.getParameter("address");
	resultset=stmt.executeQuery("select * from user where name='"+name+"'");
	boolean available =resultset.next();
	if(available){
		%>

	<jsp:forward page="existed.jsp" />
	<%	
	}
	else{
		String sqlInsertQuery = String.format("insert into user(name,age,address)values('%s','%d','%s')",name,age,address);
		int rowAffected=stmt.executeUpdate(sqlInsertQuery);
		
		if(rowAffected==1){
			%>
	<jsp:forward page="./success.jsp" />
	<%}
		else{
	%>
	<jsp:forward page="./failure.jsp" />
	<%	}	
	}
	%>
	
	
	
	

</body>
</html>