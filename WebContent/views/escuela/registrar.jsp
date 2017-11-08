<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ESCUELA</title>
</head>
<body>
	<h1>AGREGAR ESCUELA</h1>
	<form action="EscuelaServlet?action=registrar" method="post">
		<table border="1" align="center">
		<tr>
			<td>C.U.E:</td>		
			<td><input type="text" name="cue"/></td>	
		</tr>
		<tr>
			<td>Nombre Escuela:</td>		
			<td><input type="text" name="nombre_escuela"/></td>	
		</tr>		
		
	</table>
	<br>
	<table border="0" align="center">
		<tr>
		<td><input type="submit" value="Agregar" name="agregar"></td>	
		</tr>
	
	</form>
</body>
</html>