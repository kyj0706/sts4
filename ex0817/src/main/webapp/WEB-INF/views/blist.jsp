<%@page import="java.sql.Timestamp"%>
<%@page import="javax.xml.crypto.Data"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<style type="text/css">
			table,tr,td {border: 1px solid black; border-collapse: collapse; 
	
}
		
		</style>
	</head>
	<body>
		<table>
			<tr>
				<td>순서</td>
				<td>게시글제목</td>
				<td>작성자</td>
				<td>작성일</td>
				<td>조회수</td>
			</tr>
			
			<c:forEach items="${map.list }" var="bVo">
			<tr>
				<td>${bVo.bid }</td>
				<td>${bVo.btitle }</td>
				<td>${bVo.bname }</td>
				<td>${bVo.bdate }</td>
				<td>${bVo.bhit }</td>
				
			
			</tr>
			</c:forEach>
		
		</table>
		<h3>전체페이지 수 : ${map.maxpage }</h3>
		<h3>현재게시글 수 : ${map.count } </h3>
	
	</body>
</html>