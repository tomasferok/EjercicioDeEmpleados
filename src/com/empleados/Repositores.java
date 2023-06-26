package com.empleados;

public class Repositores implements Empleados {

	double sueldo;
	public Repositores() {
		this.sueldo = 15890;
	}

	public void calcularSueldo() {
	    
		//Sumarle bonos
		sueldo += sueldo *(10.0/100.0);
		System.out.println("El sueldo de los repositores es " + sueldo);
		
	}
}
