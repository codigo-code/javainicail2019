<%@page import="com.utn.modelo.Auto"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
		Auto a = (Auto) request.getAttribute("autoObjeto");
	%>

	<table border="1" >
		<tr>
			<td>Marca</td>
			<td>Modelo</td>
			<td>Color</td>
		</tr>
		<tr>
			<td><%=a.getMarca()%></td>
			<td><%=a.getModelo()%></td>
			<td><%=a.getColor()%></td>
		</tr>
	</table>

</body>
</html>