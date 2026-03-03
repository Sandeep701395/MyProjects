<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="exception.jsp"%>
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
int div=(int) hs.getAttribute("c");
int d=div/2;
/* int d=div/0; */
out.println("<h1> Square Division Is "+d+"</h1>");
%>
</body>
</html>