<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<table ="20px" cellspacing="0px" align="center" border="">
		<tr>
			<th>ID</th>
			<th>NAME</th>
			<th>PHONE_NO</th>
			<th>UPDATE</thj>
			<th>DELETE</th>
		</tr>

		<c:forEach var="contact" items="${allcontacts}">
			<tr>
				<td>${contact.getId() }</td>
				<td>${contact.getName() }</td>
				<td>${contact.getPhno() }</td>
				<td><a href="update?id=${contact.getId() }">update</td>
				<td><a href="delete?id=${contact.getId() }">delete</a></td>
		</c:forEach>
	</table>
	<a href="HomePage.jsp" align="center" color="red">HOME_PAGE</a>
</body>
</html>