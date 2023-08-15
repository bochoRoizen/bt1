package clase;

import java.util.Scanner;

public class el_for_lup {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int input;
		float i;
		
		System.out.println("1) Imprimir del 1-10\n"
				+ "2) Imprimir 10-1\n"
				+ "3) Imprimir 1-100 aumentado de 0.5\n"
				+ "4) Imprimir 50-1 disminuyendo en 0.5\n"
				+ "5) Imprimir del 75-100\n"
				+ "Ingresar opcion: ");
		
		input = scanner.nextInt();
		
		switch(input) {
			case 1:
				for(i = 1; i <= 10; i++) {
					System.out.println(i);
				}
				break;
			case 2:
				for(i = 10; i <= 1; i--) {
					System.out.println(i);
				}
				break;
			case 3:
				for(i = 1; i <= 100; i += 0.5f) {
					System.out.println(i);
				}
				break;
			case 4:
				for(i = 50; i <= 1; i -= 0.5f) {
					System.out.println(i);
				}
				break;
			case 5:
				for(i = 75; i <= 100; i++) {
					System.out.println(i);
				}
				break;
			default:
				System.out.println("Ingresar opcion valida.");
		}
		
		scanner.close();
		
	}

}
