package clase;
import java.util.Scanner;
public class calculadora {
	public static void main(String[] args) throws Exception {
		
		Scanner input = new Scanner(System.in);
		
		//while(true) { // el programa nunca termina
		for(;;) {
			
			System.out.println("Modos:\n1. Sumar\n2. Restar\n3. Multiplicar\n4. Dividir\nIngrese el modo: ");
		
			int modo;		
			float num1, num2;
			
			modo = input.nextInt();
			if(modo > 4 || modo < 1) { // solo modos del 1 al 4
				
				if(modo == 0) {
					System.out.println("exiting");
					input.close();
					break;
				}
				
				System.out.println("Modo invalido.\n");
				System.in.read(); // q aprete enter para seguir el programa
				continue; // ir a la siguiente iteracion
			}
			
			System.out.println("Numero 1: ");
			num1 = input.nextFloat();
			System.out.println("Numero 2: ");
			num2 = input.nextFloat();
		
			float resultado = 0;
			switch(modo) {
				case 1:
					resultado = num1 + num2;
					break;
				case 2:
					resultado = num1 - num2;
					break;
				case 3:
					resultado = num1 * num2;
					break;
				case 4:
					if(num2 == 0) {
						System.out.println("No se puede dividir entre cero.\n");
						continue;
					}
					resultado = num1 / num2;
					break;
				}
		
			System.out.println("Resultado: " + resultado + "\n");			
		
		}
		
	}
}
