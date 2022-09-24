<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form:form action="updated" modelAttribute="id">
id :  <form:hidden path="id" />
name: <form:input path="name" value="${u.getName()}" />
phonenum: <form:input path="Phno" value="${u.getPhno()}" />
		<input type="submit">
	</form:form>

</body>
</html>