<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	Integer count = (Integer) session.getAttribute("sessionRequest");
	if (session.isNew()) {
		if (count == null)
			count = 1;
		else
			count++;
	}
	application.setAttribute("sessionRequest", count);
	%>
	<h1 style='color: red;'>
		user count of the application is ::
		<%=count%></h1>

</body>
</html>