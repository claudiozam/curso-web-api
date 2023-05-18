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
		String nombre = (String) session.getAttribute("nombre");
		Integer idProducto = (Integer) session.getAttribute("id-producto");
		
		
	%>
	
	
	Mi session id es: <b><%= sessionId  %></b><br>
	La session fue creada el <b><%= fecha %></b>><br>
	El nombre es <%= nombre %><br>
	El id del producto es <%= idProducto %><br>


</body>
</html>