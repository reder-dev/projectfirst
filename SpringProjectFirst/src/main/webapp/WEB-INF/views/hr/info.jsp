<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>인사 조회</title>
</head>
<body>
	<h1>http://localhost:8088/hr/info</h1>
	
	
	<h2> 회원정보 보기 (내정보 보기) </h2>
<%-- 	${memberVO } --%>
	<hr>
	<h3>아이디 : ${hrVO.emp_id }</h3>
	<h3>비밀번호 : ${hrVO.emp_pw }</h3>
	<h3>이름 : ${hrVO.emp_name } </h3>
	<h3>이메일 : ${hrVO.emp_email }</h3>
	
	
	<h2><a href="/hr/main">메인페이지로.....</a></h2>
	
	
	
	
</body>
</html>