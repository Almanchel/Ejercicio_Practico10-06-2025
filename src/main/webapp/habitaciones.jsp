<%@page import="com.ipartek.modelo.I_Constantes"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.ipartek.modelo.Habitacion"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	List <Habitacion> listaHabitaciones = new ArrayList<Habitacion>();
	
	if(request.getAttribute(I_Constantes.ATR_HABITACIONES)!= null){
		listaHabitaciones = (List<Habitacion>) request.getAttribute(I_Constantes.ATR_HABITACIONES);
	}




%>



<!DOCTYPE html>
<html lang="es">
<head>
<meta charset="UTF-8">
<title>Hotel</title>
<link rel="stylesheet" href="styles/style_productos.css">
<link rel="stylesheet" href="styles/style.css">
<link rel="stylesheet" href="styles/style_index.css">
</head>
<body>  

	<%@include file="includes/cabecera.jsp"%>

	<%@include file="includes/menu.jsp"%>

	<main>
		<section>
			<table border 1>
				<thead>
					<tr>
						<th>ID</th>
						<th>Nº habitación</th>
						<th>precio</th>
						<th>Nº camas</th>
						<th>Nº metros</th>
						<th>Exterior</th>
					</tr>
				</thead>
				<tbody>
					<%for (Habitacion elem : listaHabitaciones){ %>
					<tr>
						<td><%=elem.getId_habitaciones() %></td>
						<td><%=elem.getNum_habitacion() %></td>
						<td><%=elem.getPrecio() %></td>
						<td><%=elem.getNum_camas() %></td>
						<td><%=elem.getMetros() %></td>
						<td><%=elem.getExterior() ? "Si" : "No"%></td>
					</tr>
				
				<%} %>
				
				</tbody>
			</table>
	
		</section>
	</main>

	<%@include file="includes/pie.jsp"%>

</body>
</html>