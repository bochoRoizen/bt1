package clase;

import java.util.*;

public class promedio_notas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		
		int n1, n2, n3;
		
		System.out.println("Imgresar las tres notas del alumno: ");
		
		n1 = s.nextInt();
		n2 = s.nextInt();
		n3 = s.nextInt();
		
		int promedio = (n1 + n2 + n3) / 3;
		
		if(promedio >= 7) {
			System.out.println("Promocionado");
		} else if(promedio >= 4 && promedio < 7) {
			System.out.println("Regular");
		} else {
			System.out.println("Reprobado");
		}
		
		s.close();
		
	}

}
