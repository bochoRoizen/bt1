package clase;

import java.util.*;

public class hatsa_q_igrese_cero {

	public static void main(String[] args) {

		/*
		 * hasta q ingrese cero
		 * cuantos ingreso?
		 * la suma de todos
		 * cuantos son pares
		 * cuantos son impares
		 * cuantas son multiplos de 3
		 */
		
		Scanner s = new Scanner(System.in);
		
		int i = 0, input, suma = 0, pares = 0, impares = 0, multiploDeTres = 0;
		
		for(;;) {
			
			System.out.println("Ingrese un numero: ");
			
			input = s.nextInt();
			
			if(input == 0) {
				System.out.printf("Numeros ingresados: %d\nSuma: %d\nPares: %d\nImpares: %d\nMultiplos de tres: %d", i, suma, pares, impares, multiploDeTres);
				s.close();
				return;
			};
			
			i++;
			
			suma += input;
			
			if(input % 2 == 0) {
				pares++;
			}
			if(input % 3 == 0) {
				impares++;
				multiploDeTres++;
			}
			
		}
			
	}

}
