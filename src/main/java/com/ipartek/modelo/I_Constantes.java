package com.ipartek.modelo;

public interface I_Constantes {

	// constantes de la BD
	String BD = "jsp_hotel";
	String DRIVER = "com.mysql.cj.jdbc.Driver";
	String CONEXION = "jdbc:mysql://localhost:3306/"+BD;
	String USUARIO = "root";
	String PASS = "1234";
	
	//constantes de los JSP
	String JSP_INDEX = "index.jsp";
	String JSP_HABITACIONES= "habitaciones.jsp";
	
	
	
	
	
	//TABLA
	String TABLA_HABITACIONES = "tabla_habitaciones";
	String HABITACIONES_ID_HABITACION="id_habitaciones";
	String HABITACIONES_METROS="metros";
	String HABITACIONES_PRECIO="precio";
	String HABITACIONES_NUM_CAMAS="num_camas";
	String HABITACIONES_EXTERIOR="exterior";
	String HABITACIONES_NUM_HABITACION="num_habitacion";
	
	String SP_OBTENER_HABITACIONES = "call sp_obtener_habitaciones();";
	
	
	// MOCHILA
	String ATR_HABITACIONES="atr_habitaciones";
}
