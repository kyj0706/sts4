<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>index</title>
	</head>
	<body>
		<h3>메인페이지</h3>
		<ul>
			<li><a href="/member">회원가입</a></li>
			<li>로그인</li>
			<li><a href="list">리스트</a></li>
			<li><a href="blist">board리스트</a></li>
		</ul>
		
		<c:if test="${map !=null }">
		<table>
			<tr>
				<td>이름</td>
				<td>${map.name }</td>
			</tr>
			<tr>
				<td>페이지</td>
				<td>${map.page }</td>
			</tr>
			<tr>
				<td>페이지</td>
				<td>${map.hobby }</td>
			</tr>
		</table>
		</c:if>
	</body>
</html>