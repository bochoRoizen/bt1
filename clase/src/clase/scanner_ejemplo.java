package clase;
import java.util.Scanner;

public class scanner_ejemplo {

	public static void main(String[] args) {
		int edad;
		float altura;
		String nombre;
		Scanner input = new Scanner(System.in);
		System.out.println("Ingrese su nombre: ");
		nombre = input.next();
		System.out.println("Ingrese su edad: ");
		edad = input.nextInt();
		System.out.println("Ingrese su altura: ");
		altura = input.nextFloat();
		System.out.println("\nLos datos ingresados fueron:\nNombre: " + nombre + "\nEdad: " + edad + "\nAltura: " + altura);
		
		input.close();
		
	}

}
