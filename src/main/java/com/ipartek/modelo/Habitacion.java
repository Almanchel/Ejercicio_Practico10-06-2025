package com.ipartek.modelo;

public class Habitacion {

	private int id_habitaciones;
	private int metros;
	private double precio;
	private int num_camas;
	private boolean exterior;
	private int num_habitacion;
	
	
	public Habitacion(int id_habitaciones, int metros, double precio, int num_camas, boolean exterior,
			int num_habitacion) {
		super();
		this.id_habitaciones = id_habitaciones;
		this.metros = metros;
		this.precio = precio;
		this.num_camas = num_camas;
		this.exterior = exterior;
		this.num_habitacion = num_habitacion;
	}
	
	public Habitacion() {
		super();
		this.id_habitaciones = 0;
		this.metros = 0;
		this.precio = 0.0;
		this.num_camas = 0;
		this.exterior = false;
		this.num_habitacion = 0;
	}

	public int getId_habitaciones() {
		return id_habitaciones;
	}

	public void setId_habitaciones(int id_habitaciones) {
		this.id_habitaciones = id_habitaciones;
	}

	public int getMetros() {
		return metros;
	}

	public void setMetros(int metros) {
		this.metros = metros;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getNum_camas() {
		return num_camas;
	}

	public void setNum_camas(int num_camas) {
		this.num_camas = num_camas;
	}

	public boolean getExterior() {
		return exterior;
	}

	public void setExterior(boolean exterior) {
		this.exterior = exterior;
	}

	public int getNum_habitacion() {
		return num_habitacion;
	}

	public void setNum_habitacion(int num_habitacion) {
		this.num_habitacion = num_habitacion;
	}

	@Override
	public String toString() {
		return "Habitacion [id_habitaciones=" + id_habitaciones + ", metros=" + metros + ", precio=" + precio
				+ ", num_camas=" + num_camas + ", exterior=" + exterior + ", num_habitacion=" + num_habitacion + "]";
	}
	
	
	
	
}
