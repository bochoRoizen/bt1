package clase;
import java.util.Scanner;

public class tres_numeros {
	
	public static float mayor(float num1, float num2, float num3) {
		float mayor;
		
		if(num1 > num2 && num1 > num3) {
			mayor = num1;
		} else if(num2 > num1 && num2 > num3) {
			mayor = num2;
		} else {
			mayor = num3;
		}
		
		return mayor;
	}
	
	public static float menor(float num1, float num2, float num3) {
		float menor;
		
		if(num1 < num2 && num1 < num3) {
			menor = num1;
		} else if(num2 < num1 && num2 < num3) {
			menor = num2;
		} else {
			menor = num3;
		}
		
		return menor;
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		System.out.println("Numero 1: ");
		float num1 = s.nextInt();
		
		System.out.println("Numero 2: ");
		float num2 = s.nextInt();
		
		System.out.println("Numero 3: ");
		float num3 = s.nextInt();
		
		System.out.println("El numero mas grande es: " + mayor(num1, num2, num3));
		System.out.println("El numero mas chico es: " + menor(num1, num2, num3));
	
		s.close();
		
	}

}
