<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	:root{}
	html{}
	*{box-sizing:border-box;}
	body{padding:0; margin:0;}
	ul{list-style:none; margin:0; padding:0;}
	a{text-decoration:none; color:black;}
	.wrapper{}
	.wrapper>header{height:80px;}
	.wrapper>nav{height:50px;}
	.wrapper>main{height:calc(100vh - 80px - 50px - 80px);}

	.wrapper>footer{height:80px;}
</style>
</head>
<body>
	<div class="wrapper">
		<!--  -->
		<%@include file="/layouts/Header.jsp" %>
		
		<!--  -->
		<%@include file="/layouts/Nav.jsp" %>
	
		<main>
		<h2>회원정보조회</h2>
		
			<table>
				<tr>
					<th>수강월</th>
					<th>회원번호</th>
					<th>회원명</th>
					<th>강의명</th>
					<th>강의장소</th>
					<th>수강료</th>
					<th>등급</th>
				</tr>
				
				<tr>
					<td><%= %></td>
					<td><%= %></td>
					<td><%= %></td>
					<td><%= %></td>
					<td><%= %></td>
					<td><%= %></td>
					<td><%= %></td>
				</tr>
			</table>
		</main>
		
		
		<!--  -->
		<%@include file="/layouts/Footer.jsp" %>
		<footer>
		</footer>
	</div>
</body>
</html>