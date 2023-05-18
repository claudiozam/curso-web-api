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
		Integer valorCampo1 = Integer.parseInt(request.getParameter("campo1"));
		Integer valorCampo2 = Integer.parseInt(request.getParameter("campo2"));

		Integer total = valorCampo1 / valorCampo2;
		
	%>
	
	El resultado es: <%= total %>
</body>
</html>