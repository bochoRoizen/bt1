package clase;

import java.util.*;

public class verificador_de_cedula {
	
	static int NUMERITOS[] = {2, 9, 8, 7, 6, 3, 4};

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		for(;;) {
			
			System.out.println("Ingresar cedula: ");
		
			// mas comodo usar char[]
			char[] cedula = s.next().toCharArray();
			
			if(cedula[0] == '0' && cedula.length == 1) {
				System.out.println("Exit");
				s.close();
				return;
			}
		
			if(cedula.length != 8) {
				System.out.println("Cedula invalida\n");
				continue;
			}
		
			int arrayCedula[] = new int[9];
		
			// pasar de char[] a int[]
			for(int j = 0; j < 7; j++) {
				arrayCedula[j] = Character.getNumericValue(cedula[j]);
			}
		
			// el algoritmo raro este
			int resultado = 0;
			for(int i = 0; i < 7; i++) {
				resultado += arrayCedula[i] * NUMERITOS[i];
			}
			
			// redondearlo
			int num = (resultado + 10) / 10 * 10;
		
			System.out.printf("Cedula %s\n", Character.getNumericValue(cedula[7]) == num - resultado ? "valida\n" : "invalida\n");
			
			s.next();
			
		}		
		
	}

}    