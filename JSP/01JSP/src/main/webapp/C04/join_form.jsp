<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	:root{}
	*{box-sizing:border-box; padding:10px; border:1px solid;}
	a{}
	ul{}
	body{padding:0; margin:0;}
	.wrapper{height:100%;}
	.wrapper>header{min-height:100px;}
	.wrapper>header>top-header{min-height:25px;}
	.wrapper>header>nav{min-height:75px;}
	.wrapper>main{min-height:calc(100vh - 100px -250px);}
	.wrapper>main>section{}
	.wrapper>footer{min-height:250px;}
</style>
</head>
<body>
	<div class="wrapper">
		<header>
			<!--  -->
			<%@ include file="./layouts/TopHeader.jsp"%>
			<!--  -->
			<%@ include file="./layouts/Nav.jsp"%>
		</header>
		<main>
			<section>
				<h1>JOIN</h1>
				<form action="join.jsp" method="post">
					<input type="text" name="userid" /><br> 
					<input type="text" name="password" /><br> 
					<input type="submit" value="회원가입" />
				</form>
			</section>
		</main>
		<%@include file="./layouts/Footer.jsp" %>
		<footer>
			
		</footer>
</body>
</html>