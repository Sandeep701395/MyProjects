<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ include file="nav.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	int num1=Integer.parseInt(request.getParameter("num1"));
	int num2=Integer.parseInt(request.getParameter("num2"));
	int mul=num1*num2;
	out.println("<h1> Multiplication Of Two Numbers is "+mul+"</h1>");
	
	%>
</body>
</html>