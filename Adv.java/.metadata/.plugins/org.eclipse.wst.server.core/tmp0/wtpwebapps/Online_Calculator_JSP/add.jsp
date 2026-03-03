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
	int sum=num1+num2;
	out.println("<h1>Sum Of Two Number Is:"+sum+"<h1>");
%>
<h2>To Get Square Click On Square Button</h2>
<form action="square.jsp">
<button>Square</button>
</form>
<%
	HttpSession hs=request.getSession();
	hs.setAttribute("s", sum);
%>


</body>
</html>