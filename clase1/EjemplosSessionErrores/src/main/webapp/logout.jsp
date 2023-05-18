<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


	<%
		String sessionId = session.getId();
		Date fecha = new Date(session.getCreationTime());
		session.invalidate();
	%>


	Mi session id es: <b><%= sessionId  %></b><br>
	La session fue creada el <b><%= fecha %></b>
	



</body>
</html>