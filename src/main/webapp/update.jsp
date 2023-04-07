<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form:form action="updatedetails" modelAttribute="updatebyid">
ID:<form:input path="id"/>
Name:<form:input path="name"/>
Email:<form:input path="email"/>
Password:<form:input path="pwd"/>
<form:button>Submit</form:button>
</form:form>
</body>
</html>