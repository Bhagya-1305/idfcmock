<%@page import="dto.StudentDto"%>
<%@page import="java.util.List"%>
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
List<StudentDto> data1=(List<StudentDto>)request.getAttribute("key");
for(StudentDto dto:data1){
%>
<tr>
<td><%=dto.getId() %></td>
<td><%=dto.getName() %></td>
<td><%=dto.getEmail() %></td>
<td><%=dto.getPwd() %></td>
</tr>
<%
}
%>
</table>
</body>
</html>