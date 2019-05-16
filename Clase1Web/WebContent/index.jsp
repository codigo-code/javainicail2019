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
		// trabajamos con queryString --> son las variables que se pasan por la url
		// a travez del metodo get!

		String marca = request.getParameter("marca");
		String modelo = request.getParameter("modelo");
		String color = request.getParameter("color");
	%>



	<h1>
		<%
			out.print("Hola mundo desde java");
		%>
	</h1>

	<%
		if (marca != null && modelo != null && color != null) {
	%>

	<h3>
		El auto que solicito es de la marca
		<%=marca%>
	</h3>
	<h3>
		El modelo pedido es
		<%=modelo%></h3>
	<h3>
		Con el color
		<%=color%></h3>

	<%
		}
	%>

	<h2>Ingreso auto a mi base de datos!</h2>
	<!--  Yo quieror hacer un comentario y que esto no se vea en la web -->
	<br>
	<form action="cargoAuto" method="get">
		<input type="text" name="marca" placeholder="ingrese la marca" /> <br />
		<input type="text" name="modelo" placeholder="ingrese el modelo" /> <br />
		<input type="text" name="color" placeholder="ingrese el color" /> <br>
		<input type="submit" value="ingresar auto" />
	</form>



	<form action="buscarAuto" method="get">
		<input type="number" name="id"
			placeholder="ingrese el id del auto a buscar"> <input
			type="submit" value="buscar auto ">

	</form>

</body>
</html>