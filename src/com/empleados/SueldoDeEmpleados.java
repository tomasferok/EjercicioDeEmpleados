package com.empleados;

import java.util.Scanner;

public class SueldoDeEmpleados {

	public static void main(String[] args) {

		Empleados cajero = new Cajeros();
		Empleados supervisor = new Supervisores();
		Empleados repositor = new Repositores();
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("ingresar un empleado y se le dara su sueldo: ");
			String empleado = scanner.nextLine();
			
			if(empleado.equals("cajero")) {
				cajero.calcularSueldo();
			}
			else if(empleado.equals("supervisor")) {
				supervisor.calcularSueldo();
			}
			else if(empleado.equals("repositor")) {
				repositor.calcularSueldo();
			}
			else {
				System.out.println("no existe el timpo de empleado que indico");
			}
		}
		
		
		

	}

}
