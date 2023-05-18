<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script type="text/javascript">
	function guardarDatos() {
		var valorCampoTexto = document.getElementById("campoTexto").value;
		localStorage.setItem("campoTexto", valorCampoTexto);
				
		var producto = { "nombre" : "ejemplo1234", "precio" : 1000 };
		localStorage.setItem("producto", JSON.stringify(producto));

	}
	
	function recuperarDatos() {
		var valorSession = localStorage.getItem("campoTexto");
		document.getElementById("divDatos").innerHTML = valorSession;
		
		var producto = JSON.parse(localStorage.getItem("producto"));
		console.log(producto.precio + ' ' + producto.nombre);
	}

</script>
</head>
<body>

Dato: <input type="text" id="campoTexto">
<br>
<div id="divDatos">Sin datos</div>
<br>

<button type="button" onclick="guardarDatos()">Guardar dato</button>
<button type="button" onclick="recuperarDatos()">Recuperar dato</button>


</body>
</html>