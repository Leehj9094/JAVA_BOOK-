<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
:root {
	
}

* {
	box-sizing: border-box;
	padding: 10px;
	border: 1px solid;
}

a {
	
}

ul {
	
}

body {
	padding: 0;
	margin: 0;
}

.wrapper {
	height: 100%;
}

.wrapper>header {
	min-height: 100px;
}

.wrapper>header>.top-header {
	min-height: 25px;
}

.wrapper>header>.nav {
	min-height: 75px;
}

.wrapper>main {
	min-height: calc(100vh - 100px -250px);
}

.wrapper>main>section {
	
}

.wrapper>footer {
	min-height: 250px;
}
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

				<!-- 
			1. myinfo.jsp(생성)
				- url:"/myinfo" 를 request.setAttribute로 저장 후 Forwarding
			2. validationCheck.jsp
				- 유효성 체크
			3. dbUtils.jsp(기존) 
				- select 작업 조회 이후 forwarding
			4. myinfo.jps(내용표시)
				-
		 -->
				<h1>MYINFO</h1>
				<form action="join.jsp" method="post">
					<input type="text" name="userid" /><br> <input type="hidden"
						name="url" value="/myinfo" /> <input type="submit" value="조회" />
				</form>
			</section>
		</main>
		<!-- footer insert 지시자 이용해서 가져오기 -->
		<%@include file="./layouts/Footer.jsp" %>
	</div>
</body>
</html>