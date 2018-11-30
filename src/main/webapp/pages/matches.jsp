<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Fixtures</title>
</head>
<body>
	<center>
		<h2>Players</h2>
		<table style="">
			<c:forEach items="${list}" var="player" varStatus="loop">
			<c:choose>
				<c:when test="${loop.index%2 eq 0}"><tr style="background-color: #cce5ff"></c:when>
				<c:otherwise><tr></c:otherwise>
			</c:choose>
					<td><c:out value="${player.pid}" /></td>
					<td><c:out value="${player.name}" /></td>
					<td><c:out value="${player.fullName}" /></td>
				</tr>
			</c:forEach>
		</table>
	</center>
</body>
</html>