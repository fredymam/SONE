<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SONE</title>
</head>
<body>
	<h1>Agregar Curso</h1>
	<form action="CursoServlet?action=register" method="post">
		<table border="1" align="center">
		<tr>
			<td>Curso:</td>		
			<td><input type="text" name="curso"/></td>	
		</tr>
		<tr>
			<td>Division:</td>		
			<td><input type="text" name="division"/></td>	
		</tr>
		<tr>
			<td>Turno:</td>		
			<td><input type="text" name="turno"/></td>	
		</tr>
		<tr>
			<td>Detalle:</td>		
			<td><input type="text" name="detalle"/></td>	
		</tr>
	</table>
	<br>
	<table border="0" align="center">
		<tr>
			<td><input type="submit" value="Agregar" name="agregar"></td>
		</tr>
	</table>
	</form>
</body>
</html>