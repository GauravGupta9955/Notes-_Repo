<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	Page Scope attribute::<%=pageContext.getAttribute("p",1)%><br>
	Request Scope attribute ::<%=pageContext.getAttribute("r",2)%><br>
	Session scope attribute ::<%=pageContext.getAttribute("s",3)%><br>
	Application Scope Attribute ::<%=pageContext.getAttribute("a",4)%><br>

</body>
</html>