<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>First Page</title>
</head>
<body>
<h1>Welcome to iNeuron + physics Wallah</h1>
<jsp:include page="./second.jsp">
<jsp:param value ="java" name ="sub1"/>
<jsp:param value ="JEE" name ="sub2"/>
<jsp:param value ="Framework" name ="sub3"/>
<jsp:param value ="Algorithms" name ="sub4"/>
<jsp:param value ="System Design" name ="sub4"/>

</jsp:include>

</body>
</html>