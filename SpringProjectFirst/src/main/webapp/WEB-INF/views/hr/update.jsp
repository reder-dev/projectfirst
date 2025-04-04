<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>/hr/update.jsp</h1>
	<%-- ${memberVO } --%>
	<fieldset>
		<form action="" method="post" >
			아이디 : <input type="text" name="emp_id" value="${hrVO.emp_id }" readonly="readonly"> <br>
			비밀번호 : <input type="password" name="emp_pw" ><br>
			이름 : <input type="text" name="emp_name" value="${hrVO.emp_name }"><br>
			이메일 : <input type="email" name="emp_email" value="${hrVO.emp_email }"><hr>
			
			<input type="submit" value="회원수정">
		</form>	
	</fieldset>
	
	
	
</body>
</html>