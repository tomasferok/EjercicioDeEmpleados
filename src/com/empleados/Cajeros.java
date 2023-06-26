package com.empleados;

public class Cajeros implements Empleados{

	//Sueldo estatico ya que no aplica descuento
	final double sueldoLiquido = 25630.89;
	
	public Cajeros() {
		
	}

	@Override
	public void calcularSueldo() {
				
		System.out.println("El sueldo de los cajeros es " + sueldoLiquido);
		
	}
	
}
