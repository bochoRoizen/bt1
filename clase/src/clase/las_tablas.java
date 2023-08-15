package clase;

import java.util.*;

public class las_tablas {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int contador = 0, numero = 0;
		
		System.out.println("Ingrese un numero: ");
		numero = s.nextInt();
		
		while(contador < 10) {
			
			contador++;
			
			System.out.printf("%d x %d = %d\n", contador, numero, contador * numero);
		}
		
		s.close();
		
	}

}
