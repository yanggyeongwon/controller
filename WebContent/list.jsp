<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1">
<tr>
	<td>번호</td>
	<td>아이디</td>
	<td>비번</td>
	<td>이름</td>
	<td>날짜</td>
	<td>삭제</td>
	<td>수정</td>
</tr>
<c:forEach var="name" items="${lists }">
	<tr>
		<td>${name.num }</td>
		<td>${name.id }</td>
		<td>${name.passwd }</td>
		<td>${name.name }</td>
		<td>${name.register }</td>
		<td><a href="#">삭제</a></td>
		<td><a href="#">수정</a></td>
	</tr>
	</c:forEach>
</table>
</body>
</html>