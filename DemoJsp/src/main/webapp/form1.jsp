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
	width: 100vw;
	background-color: greenyellow;
	display: flex;
	align-items: center;
	justify-content: space-evenly;
	box-shadow: rgba(50, 50, 93, 0.25) 0px 30px 60px -12px inset, rgba(0, 0, 0, 0.3) 0px 18px 36px -18px inset;
}
form{
	height: 20vh;
	width: 45vw;
	display: flex;
	background-color:black;
	justify-content: space-evenly;
	align-items: center;
	border-radius: 20px;
}
button{
	padding: 12px 40px;
	border: none;
	font-size: 20px;
	font-weight: bold;
	border-radius: 20px;
	cursor: pointer;
}
#btn1{ 
color: darkblue; 
}
#btn2{ 
color: rgb(255, 0, 0); 
}

</style>
</head>
<body>
<form >
<button id="btn1" formaction="register.jsp">Create Account</button>
<button id="btn2" formaction="login.jsp">Login</button>
</form>
</body>
</html>