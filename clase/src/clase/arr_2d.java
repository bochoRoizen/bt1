package clase;

import java.util.*;

public class arr_2d {
	
	private static void printf(String str, Object... obj) {
		System.out.printf(str, obj);
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		int[][] arr = new int[3][5];
		
		int input;
		
		do {
			
			printf("1. cargar\n"
					+ "2. imprimir\n"
					+ "0. salir\n");			
			
			input = s.nextInt();
			
			if(input == 0) {
				return;
			}
			
			switch(input) {
			case 1:
				for(int i = 0; i < arr.length; i++) {
					for(int j = 0; j < arr[0].length; j++) {
						printf("ingresar numero en la posicion [%d] del array numero [%d]: ", j, i);
						arr[i][j] = s.nextInt();
					}
				}
				break;
			case 2:
				for(int i = 0; i < arr.length; i++) {
					for(int j = 0; j < arr[0].length; j++) {
						printf("numero en la posicion [%d] del array numero [%d]: %d\n", j, i, arr[i][j]);
					}
				}
				break;
			}
			
		} while(input != 0);
		
	}

}
