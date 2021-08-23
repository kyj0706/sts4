<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
	<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<style type="text/css">
			table,tr,td,th {border:1px solid black; border-collapse: }
		
		</style>
	</head>
	<body>
		
		<table>
			<tr>
				<th>아이디</th>
				<th>이름</th>
				<th>성별</th>
				<th>전화번호</th>
			</tr>
		<c:forEach items="${map.list }" var="mVo" >
			<tr>
				<td>${mVo.id }</td>
				<td>${mVo.name }</td>
				<td>${mVo.gender }</td>
				<td>${mVo.tel }</td>
			</tr>
			
	
		</c:forEach>
		</table>
		<h3>page : ${map.page}</h3>
		<h3>count : ${map.count }</h3>
	</body>
</html>