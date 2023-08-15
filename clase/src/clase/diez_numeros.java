package clase;

import java.util.*;

public class diez_numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		
		int i = 0;
		float suma = 0.f;
		
		while(i < 10) {
			
			System.out.println("Ingresar numero " + (i + 1) + ": ");
			
			suma += s.nextFloat();
			
			i++;
		}
		
		System.out.println("Suma: " + suma + "\nPromedio: " + suma/10);
		
		s.close();
		
	}

}
