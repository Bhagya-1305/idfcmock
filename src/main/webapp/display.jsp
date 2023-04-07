<%@page import="dto.StudentDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1px">
	<tr>
	<th>id</th>
	<th>name</th>
	<th>email</th>
	<th>pwd</th>
	</tr>
	<%
	StudentDto data=(StudentDto)request.getAttribute("key");
	%>
	<tr>
	<td><%=data.getId() %></td>
	<td><%=data.getName() %></td>
	<td><%=data.getEmail() %></td>
	<td><%=data.getPwd() %></td>
	</tr>
	</table>
</body>
</html>