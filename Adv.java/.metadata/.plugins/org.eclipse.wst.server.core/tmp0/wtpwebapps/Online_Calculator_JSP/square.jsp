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
	HttpSession hs=request.getSession();
	int square=(int)hs.getAttribute("s");
	int sq=square*square;
	
	out.println("<h1>Square Of Sum Is "+sq+"<h1>");

%>
<h2>To Get Division Click On Division Button</h2>
<form action="divide.jsp">
<button>Divide</button>
</form>
<%

hs.setAttribute("c", sq);

%>
</body>
</html>