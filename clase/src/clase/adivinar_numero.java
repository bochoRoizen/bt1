package clase;

import java.util.*;

public class adivinar_numero {
	
	private static int juego_adivinar(int numero, int puntos, Scanner scanner) {
		
		int input;
		
		while(true) {
			
			System.out.println("Ingrese el numero a adivniar: ");
			
			input = scanner.nextInt();
			
			if(input > numero) {
				System.out.println("El numero ingresado es mayor al numero a adivinar.");
			} else if(input < numero) {
				System.out.println("El numero ingresado es menor al numero a adivinar.");
			} else {
				System.out.println("Has adivinado el numero!");
				return 1;
			}
			
			System.out.println("Te quedan " + (puntos - 1) + " intentos.\n");
			
			if(puntos - 1 == 0) {
				System.out.println("Te quedaste sin intentos :(\n");
				return 0;
			}
			
			puntos--;
		}
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		Random random = new Random();
		
		int numero, puntos = 10, jugar;
		
		numero = random.nextInt(1, 100);
		
		System.out.println("Jugar a adivinar el numero (1/0): ");
		
		jugar = scanner.nextInt();
		
		while(jugar == 1) {
			
			juego_adivinar(numero, puntos, scanner);
			
			System.out.println("Jugar otra ves? (1/0): ");
			
			numero = random.nextInt(1, 100);
			
			jugar = scanner.nextInt();
			 
		}
		
		
	}
}
