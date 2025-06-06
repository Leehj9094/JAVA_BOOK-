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
	.wrapper>main h2{
	text-align : center;
	font-size : 1.8rem;
	font-weight : 400;
	}
	.wrapper>main table{
	border:1px solid;
	border-collapse:collapse;
	min-width:500px;
	min-height:350px;
	margin: 0 auto;
	}
	.wrapper>main table th,
	.wrapper>main table td{
	min-width:80px !important;
	min-height:25px !important;
	border: 1px solid;
	text-align:center;
	}
	.wrapper>footer{height:80px;}
</style>
</head>
<body>
<div class="wrapper">
		<!--  -->
		<%@include file="/layouts/Header.jsp" %>
		
		<!--  -->
		<%@include file="/layouts/Nav.jsp" %>
	
		<!--  
		select M.M_NO,M.M_NAME,COUNT(*)
		from TBL_MEMBER_202005 M
		join TBL_VOTE_202005 V
		on M.M_NO=V.M_NO
		group by M.M_NO,M.M_NAME
		order by COUNT(*) desc;
		-->
	
		<main>
			<h2>04폴더</h2>
		</main>
		
		<!--  -->
		<%@include file="/layouts/Footer.jsp" %>
		<footer>
		</footer>
	</div>
</body>
</html>