<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ESCUELAS</title>
</head>
<body>
	<h1>LISTA ESCUELAS</h1>
	<table>
		<tr>
			<td><a href="EscuelaServlet?action=index" >MENU</a> </td>
		</tr>
	</table>
	
	<table border="1" width="100%">
		<tr>
		 <td> CUE</td>
		 <td> NOMBRE DE ESCUELAS</td>
		 <td colspan=2>ACCIONES</td>
		</tr>
		<c:forEach var="escuela" items="${lista}">
			<tr>
				<td><c:out value="${escuela.cue}"/></td>
				<td><c:out value="${escuela.nombre_escuela}"/></td>
				<td><a href="EscuelaServlet?action=mostrarEditar&cue=<c:out value="${escuela.cue}" />">Editar</a></td>
				<td><a href="EscuelaServlet?action=eliminar&cue=<c:out value="${escuela.cue}"/>">Eliminar</a> </td>				
			</tr>
		</c:forEach>
	</table>
	
</body>
</html>