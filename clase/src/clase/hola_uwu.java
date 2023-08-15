package clase;

import java.util.Scanner;

public class hola_uwu {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int input, arr[], i;
		
		arr = new int[10];
		
		do {
			
			System.out.println("1. Cargar array\n"
					+ "2. Mostrar array\n"
					+ "0. Salir");
			
			input = scanner.nextInt();
			
			switch(input) {
			case 1:
				for(i = 0; i < arr.length; i++) {
					System.out.println("Ingresar int en la posicion " + i + ": ");
					arr[i] = scanner.nextInt();
				}
				break;
			case 2:
				for(i = 0; i < arr.length; i++) {
					System.out.println("arr[" + i + "]: " + arr[i]);
				}
				break;
			case 0:
				System.out.println("Saliendo...");
				break;
			default:
				System.out.println("Invalido");
			}
			
		} while(input != 0);
		
		scanner.close();
		
	}

}
