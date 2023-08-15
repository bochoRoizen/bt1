package clase;

import java.util.*;

public class desde_el_uno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Ingrese un numero: ");
		
		float i = s.nextFloat(), j = 1;
		
		while(j <= i) {
			
			System.out.println(j);
			
			j++;
		}
		
		s.close();

	}

}
