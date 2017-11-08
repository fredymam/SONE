
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Actualizar Escuela</title>
</head>
<body>
<h1>Actualizar Escuela</h1>
	<form action="EscuelaServlet?action=editar" method="post" >
		<table>
			<tr>
				<td><label>C.U.E</label></td>
				<td><input type="text" name="cue" value='<c:out value="${escuela.cue}"></c:out>' ></td>
			</tr>
			<tr>
				<td><label>Nombre Escuela</label></td>
				<td><input type="text" name="nombre_escuela" value='<c:out value="${escuela.nombre_escuela}"></c:out>' ></td>
			</tr>
		</table>
	 		
		<input type="submit" name="registrar" value="Guardar"> 
		
		<input type="hidden" name="cue_old" value="99">
		
	</form>

</body>
</html>