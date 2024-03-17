package Repaso;

import java.util.Scanner;

/**
 * Solicita un número por teclado.
 * 
 * Una vez introducido el número muestra un contador donde aparezcan todos los
 * números desde el 0 al número indicado.
 * 
 * ¿Qué pasa si el número introducido es negativo? Vuestro programa debe
 * funcionar con números positivos y negativos.
 */

public class Tarea4R {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		int numero =0;
		int i =0;
		
		System.out.println("Introduzca un número: ");
		numero = sc.nextInt();
		
		for (i =0; i < numero; i++) {
			System.out.println(i);
			
		}
		
		if (numero <0) {
			System.out.println("Ha introducido un número negativo. El contador se mostrará a la inversa...!");
			
			for (i=0; i>numero; i--) {
				System.out.println(i);
				
			}
		}
	}
}
