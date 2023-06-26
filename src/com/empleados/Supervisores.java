package com.empleados;

public class Supervisores implements Empleados {

	double sueldo;
	public Supervisores() {
		this.sueldo = 35560.20;
	}

	@Override
	public void calcularSueldo() {
		//Aplicar descuento
		sueldo-= (11.0/100.0) * sueldo;
		
		System.out.println("El sueldo de los supervisores es " + sueldo);
		
	}

	

}
