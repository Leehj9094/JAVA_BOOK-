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

html {
	
}

* {
	box-sizing: border-box;
}

body {
	padding: 0;
	margin: 0;
}

ul {
	list-style: none;
	margin: 0;
	padding: 0;
}

a {
	text-decoration: none;
	color: black;
}

.wrapper {
	
}

.wrapper>header {
	height: 80px;
}

.wrapper>nav {
	height: 50px;
}

.wrapper>main {
	height: calc(100vh - 80px - 50px - 80px);
}
.wrapper>main{}

.wrapper>footer {
	height: 80px;
}
</style>
</head>
<body>

	<div class="wrapper">
		<!--  -->
		<%@include file="/layouts/Header.jsp"%>

		<!--  -->
		<%@include file="/layouts/Nav.jsp"%>

		<main>
			<h2>강사조회</h2>

			<table>
				<tr>
					<th>강사번호</th>
					<th>강사명</th>
					<th>강의명</th>
					<th>수강료</th>
					<th>강사자격취득일</th>
				</tr>
				<%@page import="Utils.*,java.util.*,java.time.*,java.time.format.*"%>
				<%
				List<TeacherDto> list = DBUtils.getInstance().selectAllTeacher();
				%>
				<%
					for(TeacherDto dto : list)
					{
				%>
				<tr>
					<td><%=dto.getTeacher_code() %></td>
					<td><%=dto.getTeacher_name() %></td>
					<td><%=dto.getClass_name() %></td>
					<td><%=dto.getClass_price() %></td>
					<%
						String date = dto.getTeacher_regist_date();
						// INFMT
						DateTimeFormatter inFmt = DateTimeFormatter.ofPattern("yyyyMMdd");
						LocalDate localDate = LocalDate.parse(date,inFmt);
						
						// OUTFMT
						DateTimeFormatter outFmt = DateTimeFormatter.ofPattern("yyyy년MM월dd일");
						out.print("<td>"+localDate.format(outFmt)+"</td>");
						
					%>
					<!-- <td><%=dto.getTeacher_regist_date() %></td> -->
				</tr>
				<%
					}
				%>
			</table>

		</main>

		<!--  -->
		<%@include file="/layouts/Footer.jsp"%>
		<footer> </footer>
	</div>
</body>
</html>