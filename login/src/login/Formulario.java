package login;

import java.util.Scanner;

public class Formulario {
	
	public static void printf(String format, Object... args) {
		System.out.printf(format, args);
	}
	
	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		
		String usario, password;
		
		int input, codigo;
		
		validar_passwords validador = new validar_passwords();
		base_de_datos sql_funcs_ = new base_de_datos();
						
		sql_funcs_.cargarDriver();
		
		do {
			
			codigo = 0;
			
			printf("Ingrese la accion\n"
					+ "[1] Iniciar sesion\n"
					+ "[2] Registrarse\n"
					+ "[3] Consulta de usuario\n"
					+ "[0] Salir\n");
			
			input = scanner.nextInt();
			
			switch(input) {
			
			case 0:
				System.out.println("Saliendo");
				break;
			
			case 1:
				printf("[String]Usario: ");
				usario = scanner.next();
				
				printf("[String]Password: ");
				password = scanner.next();
				
				codigo = sql_funcs_.consultar_usario(usario);
				
				if(codigo == 0) {
					printf("No se encontro el usario \"%s\"\n", usario);
					break;
				}
				
				if(password.equals(sql_funcs_.consultar_codigo(codigo)[1])) {
					printf("Se inicio sesion correctamente\n");
				} else {
					printf("Combinacion usario/contraseña incorrecta\n");
				}
				
				break;
				
			case 2:
				printf("[String]Nuevo usario: ");
				usario = scanner.next();
				
				while(sql_funcs_.consultar_usario(usario) != 0) {
					printf("Ese usario ya existe\nNueva password: ");
					usario = scanner.next();
				}
				
				printf("[String]Nueva password: ");
				password = scanner.next();
				
				while(!validador.validar(password)) {
					printf("Password invalida\nNueva password: ");
					password = scanner.next();
				}
				
				sql_funcs_.insertar_usario_password(usario, password);
				
				printf("Registrado correctamente\n");
				
				break;
				
			case 3:
				printf("[int]Ingrese codigo a consultar: ");
				codigo = scanner.nextInt();
				
				if(sql_funcs_.consultar_codigo(codigo).length < 1 || sql_funcs_.consultar_codigo(codigo) == null) {
					printf("No se ha encontrado el codigo %d\n", codigo);
					break;
				}
				
				usario = sql_funcs_.consultar_codigo(codigo)[0];
				password = sql_funcs_.consultar_codigo(codigo)[1];
				
				printf("Articulo con el codigo [%d]:\nUsario: %s\nPassword: %s\n", codigo, usario, password);
				
				break;
				
			default:
				printf("Accion invalida\n");
				
			}
			
		} while(input != 0);
		
		scanner.close();
		
	}

}
