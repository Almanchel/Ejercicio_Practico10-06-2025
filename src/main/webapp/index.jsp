<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

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
		<section id="cabecera_movil">
				<section >
					<img  id="imagen"src="imagenes/habitación.jpg" height="200px" width="350px">
				</section>
			<section >
				<h2>Habitación Suite 5 estrellas</h2>
				<p>Disfruta del confort exclusivo de nuestra suite de 5 estrellas, con amplios ventanales que ofrecen
					vistas panorámicas inigualables. Elegancia, diseño moderno y 
					detalles de lujo se combinan para brindarte una experiencia única, 
					perfecta para quienes buscan lo mejor.</p>
					
					<p>Al redactar una descripción de un teléfono, es crucial
					incorporar detalles relevantes como el tamaño de la pantalla, la
					resolución, la capacidad de almacenamiento, la potencia del
					procesador, la calidad de la cámara, entre otros aspectos clave que
					influyen en la experiencia del usuario.</p>
					</section>
					
			</section>



		


		<section id="detalles">
			<h2>Detalles del producto</h2>
			<h3>Superficie:  </h3>
			<p>60 m² aprox.
			<h3>Vistas: </h3>

			<p>Panorámicas a la ciudad / mar / montaña (ajustable según la ubicación)
			<h3>Cama:</h3>

			<p>King size con ropa de cama premium
			<h3>Baño: </h3>
			<p>Privado con bañera de hidromasaje y ducha efecto lluvia.
			<h3>Tecnología:</h3>
			<p>Smart TV, Wi-Fi de alta velocidad, sistema de sonido integrado.</p>
			<h3>Servicios incluidos:</h3>
			<ul>
				<p>
					- Desayuno gourmet.<br>
					- Servicio de habitaciones 24h.<br>
					- Acceso al spa y gimnasio.
				
				</p>
			
			</ul>
			<h3>Extras de lujo:</h3>
			<p>Minibar personalizado, cafetera Nespresso, albornoces y amenities de marca.</p>
			<h3>Decoración</h3>
			<p>Estilo contemporáneo con acabados de alta gama.</p>
		</section>


		<section id="servicios">
			<h2>Servicios</h2>
			<ol>
				<p>
					- Recepción 24 horas con atención personalizada.<br>
					- Servicio de conserjería y reservas.<br>
					- Servicio de habitaciones 24 horas.<br>
					- Desayuno buffet gourmet y opciones a la carta.<br>
					- Restaurante de alta cocina y bar lounge.<br>
					- Spa de lujo con tratamientos exclusivos.<br>
					- Sauna, baño turco y piscina climatizada.<br>
					- Gimnasio equipado con tecnología avanzada.<br>
					- Servicio de traslado y valet parking.<br>
					- Wi-Fi de alta velocidad en todas las instalaciones.<br>
					- Salas de reuniones y espacios para eventos.<br>
					- Servicio de lavandería y planchado.<br>
					- Alquiler de coches y bicicletas.<br>
					- Servicio de niñera y actividades infantiles.<br>
					- Servicio de limpieza diario y amenities premium.<br>
					- Acceso adaptado para personas con movilidad reducida
					
				</p>
			</ol>
			
		</section>
	</main>

	<%@include file="includes/pie.jsp"%>

</body>
</html>