package Repaso;

/**
 * Mostrar los números impares del 1 al 100 utilizando el bucle for.
 */

public class Tarea6 {

	public static void main(String[] args) {
		
		System.out.println("Los números impares son:");
		
		for(int i=0; i<100; i++) {
			if (i%2 !=0) {
				System.out.println(i);
			}
		}

	}

}
