package clase;

import java.util.*;

public class gooood {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		int numero = 0, contador = 0, acumulador = 0;
		
		/*
		System.out.println("Ingrese un numero: ");
		
		numero = s.nextInt();
		*/
		
		while(contador < 3) {
			
			contador++;
			
			System.out.println("Ingrese un numero: ");
			
			numero = s.nextInt();
			
			acumulador += numero;
			
		}
		
		System.out.println("\n" + acumulador);
		System.out.println(contador);
				
		s.close();
		
	}

}
