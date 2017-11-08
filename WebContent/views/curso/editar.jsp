<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Actualizar Curso</title>
</head>
<body>
<h1>Actualizar Curso</h1>
	<form action="CursoServlet?action=editar" method="post">
		<table>
			<input type="hidden" name="id" value='<c:out value="${id}"></c:out>'>
			<tr>
				<td><label>Curso</label></td>
				<td><input type="text" name="numero_curso" value='<c:out value="${curso.numero_curso}"></c:out>'></td>
			</tr>
			<tr>
				<td><label>Division</label></td>
				<td><input type="text" name="division" value='<c:out value="${curso.division}"></c:out>'></td>
			</tr>
			<tr>
				<td><label>Turno</label></td>
				<td><input type="text" name="turno" value='<c:out value="${curso.turno}"></c:out>'></td>
			</tr>			
		</table>
	
		<input type="submit" name="registrar" value="Guardar"> 
	</form>

</body>
</html>