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
	String name = (String) application.getAttribute("name");
	String password = (String) session.getAttribute("pass");
	%>
	<h1>Name : <%= name %></h1>
	<h1>Password : <%= password %></h1>
</body>
</html>