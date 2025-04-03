<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="./errors.jsp"%>

<%@page import = "C04.*" %>
    <%
    
    // request로부터 전달받은 파라미터 꺼내서 System.out 확인
    // 받은 username, password 값이 null인지 여부를 체크(String API trim() + isEmpty() 이용)
    // error 발생 시 처리되는 페이지로 전달(error.jsp)
  
    UserDto userDto = (UserDto)request.getAttribute("userDto");
    System.out.println("[VALIDATION CHECK] userDto : " + userDto);
   
    if(userDto == null)
    	throw new Exception("UserDto가 NULL 입니다..");
    if(userDto.getUserid().trim().isEmpty())
    	throw new Exception("userid를 입력하세요");
    if(userDto.getPassword().trim().isEmpty()) 
    	throw new Exception("password를 입력하세요");
    if(userDto.getRole().trim().isEmpty())
    	throw new Exception("기본 역할(ROLE_USER)이 지정되지 않았습니다..");
    
    // error 미발생 시 dbUtils.jsp 로 해당 내용 Forwarding
    request.setAttribute("url","/join");				// DB 요청 처리
    request.setAttribute("serviceNo",1);				// ServiceNo C : 1 R : 2 U : 3 D : 4
    request.getRequestDispatcher("./dbUtils.jsp").forward(request,response);
    
    %>