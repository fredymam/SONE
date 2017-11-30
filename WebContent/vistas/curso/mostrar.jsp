<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Administrar Cursos</title>
</head>
<body>
	<h1>Lista Cursos</h1>
	<table>
		<tr>
			<td><a href="CursoServlet?action=index">Inicio</a> </td>
		</tr>
	</table>
	
	<table border="1" width="100%">
		<tr>
		 <td>CURSO</td>
		 <td>DIVISION</td>
		 <td>TURNO</td>
		 <td>OPERACIONES</td>
		</tr>
		<c:forEach items="${cursos}" var="entry">
			<tr>
				<td><c:out value="${entry.value.numero_curso}"/></td>
				<td><c:out value="${entry.value.division}"/></td>
				<td><c:out value="${entry.value.turno}"/></td> 
				<td><a href="CursoServlet?action=showedit&id=<c:out value="${entry.key}" />">Editar</a></td>
				<td><a href="CursoServlet?action=eliminar&curso=<c:out value="${entry.key}"/>">Eliminar</a> </td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>