package com.ipartek.modelo;


import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.xdevapi.Result;




public class DB_Helper implements I_Constantes{
	
	
	public Connection conectar() {
		Connection con = null;

		try {
			Class.forName(DRIVER);
			con = DriverManager.getConnection(CONEXION, USUARIO, PASS);
			System.out.println("BASE DE DATOS CONECTADA");
		} catch (ClassNotFoundException e) {
			System.out.println("NO SE ENCONTRO EL DRIVER");
		} catch (SQLException e) {
			System.out.println("ERROR AL CONECTAR A LA BD");
		}
		
		return con;
	}

	public void desconectar(Connection con) {
		try {
			con.close();
			System.out.println("BASE DE DATOS DESCONECTADA");
		} catch (SQLException e) {
			System.out.println("NO SE PUDO DESCONECTAR");
		}
	}

	public List<Habitacion> obtenerHabitaciones(Connection con) {
		
		try {
			List<Habitacion> lista = new ArrayList<Habitacion>();
			CallableStatement cstmt = con.prepareCall(SP_OBTENER_HABITACIONES);
			cstmt.execute();
			
			ResultSet rs = cstmt.getResultSet();
			
			while(rs.next()) {
				Habitacion re = new Habitacion();
				
				re.setExterior(rs.getBoolean(HABITACIONES_EXTERIOR));
				re.setId_habitaciones(rs.getInt(HABITACIONES_ID_HABITACION));
				re.setMetros(rs.getInt(HABITACIONES_METROS));
				re.setNum_camas(rs.getInt(HABITACIONES_NUM_CAMAS));
				re.setPrecio(rs.getDouble(HABITACIONES_PRECIO));
				re.setNum_habitacion(rs.getInt(HABITACIONES_NUM_HABITACION));
				
				lista.add(re);
				
				
			}
			
			return lista;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return null;
	}
	
}
