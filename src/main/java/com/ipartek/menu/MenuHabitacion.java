package com.ipartek.menu;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.util.List;

import com.ipartek.modelo.DB_Helper;
import com.ipartek.modelo.Habitacion;
import com.ipartek.modelo.I_Constantes;


@WebServlet("/MenuHabitacion")
public class MenuHabitacion extends HttpServlet implements I_Constantes {
	private static final long serialVersionUID = 1L;
       
  
    public MenuHabitacion() {
        super();
     
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			DB_Helper db = new DB_Helper();
			Connection con = db.conectar();
			
		
			List<Habitacion> listaHabitaciones = db.obtenerHabitaciones(con);
 			
			
			
			db.desconectar(con);
			
			request.setAttribute(ATR_HABITACIONES, listaHabitaciones);
			System.out.println(listaHabitaciones + "weeeeeeeeeeee");
			request.getRequestDispatcher(JSP_HABITACIONES).forward(request, response);
		
	}

	
	


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
