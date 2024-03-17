package Repaso;

import java.util.Scanner;

/**
 * Hacer un programa que lea 10 números y que diga si se ha introducido algún
 * número negativo.
 * 
 * Muestra los valores negativos que se han introducido.
 */

public class Tarea5R {

	public static void main(String[] args) {

	Scanner sc = new Scanner (System.in);
	
	int numero =0;
	boolean hayNegativos = false;
	int i =0;
	String txtNumNeg = "";
	
	
	
	for (i=0; i<=10; i++) {
		System.out.println("Introduzca un numero:");
		numero = sc.nextInt();
		
		if (numero <0) {
			hayNegativos = true;
			txtNumNeg += " " + numero;
		}
	}
	System.out.println(numero);
	if (!txtNumNeg.isEmpty()) {
		System.out.println("Ha introducido negativos.." + txtNumNeg);
		
	}else {
		System.out.println("No ha introducido ningún negativo...!");
	}
			
	}
}
