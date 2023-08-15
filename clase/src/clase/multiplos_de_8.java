package clase;

import java.util.Scanner;

public class multiplos_de_8 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		int contador = 0;
		
		while(contador < 500) {
			
			System.out.println(contador);
			
			contador += 8;
		}
		
		s.close();
		
	}

}
