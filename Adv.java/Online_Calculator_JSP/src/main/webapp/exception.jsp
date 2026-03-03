<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage="true"%>
    <%@ include file="nav.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	if(response.getStatus()==500)
	{
	/* 	 out.println("Internal Error!!! ");
	}  */
%>
	<%=exception.getMessage() %>
	<%
	}else{
	%>
	<h1>Something Went Wrong</h1>
	<a href="index.jsp">Click Here</a>
	<%} %>
</body>
</html>