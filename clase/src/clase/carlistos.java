package clase;

import java.util.*;

public class carlistos {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Donde estas? (primero x dsp y): ");
		int x = s.nextInt(), y = s.nextInt();
		
		if(x > 0 && y > 0) {
			System.out.println("Carlistos esta en B");
		} else if(x > 0 && y < 0) {
			System.out.println("Carlistos esta en C");
		} else if(x < 0 && y > 0) {
			System.out.println("Carlistos esta en D");
		} else {
			System.out.println("Carlistos esta en A");
		}
		
		s.close();
		
		
	}
}
