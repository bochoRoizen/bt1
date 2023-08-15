package clase;
import java.util.*;
import java.lang.Math;

public class triangulo_p_a {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		double a, b, c;
		
		System.out.println("Ingresa base: ");
		a = s.nextDouble();
		
		System.out.println("Ingresa lado 2: ");
		b = s.nextDouble();
		
		System.out.println("Ingresa lado 3: ");
		c = s.nextDouble();
		
		double p = (a + b + c) / 2;
		
		System.out.println("Area: " + (Math.sqrt(p * (p-a) * (p-b) * (p-c))));
		
		System.out.println("Permietro: " + (a + b + c));
		
		s.close();
		
	}

}
