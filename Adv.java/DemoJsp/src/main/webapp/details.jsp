
		<!-- DIRECTIVE TAG  -->
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
         <!--DECLARATION TAG  -->
	<%!int a = 70;%>
	<!-- SCRIPTLET TAG  -->
	<%
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		out.println("<h1>UserName is:" + name + " and Age is:" + age + "<h1>");
		ArrayList al;
	%>
	<!-- EXPRESSION TAG -->
	<%=a%>
</body>
</html>