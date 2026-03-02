<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
*{
padding: 0;
margin: 0;
box-sizing: border-box;
}
body{
height: 100vh;
width:100vw;
background-color: darkblue;
display: flex;
justify-content: space-evenly;
align-items: center;
}
form
{
	height:40vh;
	width:25%;
	background-color: red;
	border-radius: 15px;
	display: flex;
	flex-direction:column;
	justify-content: space-evenly;
	align-items: center;
	box-shadow: inset 0px 0px 10px white,inset 0px 0px 15px white,inset 0px 0px 25px white;
}
input{
	padding: 5px 15px;
	margin: 5px;
	border-radius: 10px;
	border: none;
	outline: none;
	font-size: 15px;
	font-weight: bold;
}
button {
	padding: 5px 15px;
	margin-bottom: 10px;
	border-radius: 10px;
	border: none;
	outline: none;
	font-size: 18px;
	color:white;	
	font-weight: bold;
	box-shadow: inset 0px 0px 10px purple,inset 0px 0px 15px purple,inset 0px 0px 25px purple;
}

h1{
color: pink;
}
</style>
</head>
<body>
	<form action="loginpage.jsp">
	<h1>LoginPage</h1>
	<input type="text" name="email" placeholder="Email">
	<input type="password" name="pwd" placeholder="Password"><br>
	<button>Submit</button>
	
	</form>
</body>
</html>