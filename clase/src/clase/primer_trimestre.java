package clase;

import java.util.*;

public class primer_trimestre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		
		int mes;
		
		System.out.println("Ingresar dia, mes y año: ");
		
		//dia = s.nextInt();
		mes = s.nextInt();
		//anio = s.nextInt();
		
		System.out.println((mes > 3 ? "No" : "Si") + " corresponde al primer trimestre");
		
		s.close();
		
	}

}
