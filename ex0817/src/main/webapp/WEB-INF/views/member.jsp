<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>회원가입</title>
	</head>
	<body>
		<h3>회원가입</h3>
		<form action="member" name="member" method="post">
		
			<label>아이디</label>
				<input type="text" id="id" name="id"><br>  
			<label>비밀번호</label>
				<input type="password" id="pw" name="pw"><br>  
			<label>비밀번호확인</label>
				<input type="text" id="pw2" name="pw2"><br>  
			<label>이름</label>
				<input type="text" id="name" name="name"><br>  
			<label>닉네임</label>
				<input type="text" id="nickname" name="nickname"><br>  
			<label>성별</label>
				<input type="radio" id="male" name="gender"><label for="male">남자</label>  
				<input type="radio" id="fmale" name="gender"><label for="female">여자</label>
				<br>  
			<label>전화번호</label>
				<input type="text" id="tel" name="tel"><br>  
			<label>주소1</label>
				<input type="text" id="address1" name="address1"><br>  
			<label>주소2</label>
				<input type="text" id="address2" name="address2"><br>  
			<label>취미</label>
				<input type="checkbox" id="swim" name="hobby" value="swim"><label for="swim">수영</label>
				<input type="checkbox" id="game" name="hobby" value="game"><label for="game">게임</label>
				<input type="checkbox" id="golf" name="hobby" value="golf"><label for="golf">골프</label>
				<input type="checkbox" id="run" name="hobby" value="run"><label for="run">조깅</label>
				<br>  
				
				<input type="submit" value="가입완료">
				<input type="reset" value="취소">
		</form>
	</body>
</html>