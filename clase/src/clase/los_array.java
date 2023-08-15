package clase;

import java.util.Scanner;

class los_array{
     
     private static void print(String str){
          System.out.print(str);
     }
     
     public static void main(String args[]){
    	 
          Scanner scanner = new Scanner(System.in);
          
          int[] arr = new int[10];          
          
          int op, cNumPares = 0, cNumImpares = 0, sNumPares = 0, sNumImpares = 0, sNumTodos = 0, i;
          
          do {
        	  
        	  print("1. cargar\n"
                		+ "2. recorrer\n"
                		+ "3. cantidad de numeros pares\n"
                		+ "4. cantidad de numeros impares\n"
                		+ "5. suma de numeros pares\n"
                		+ "6. suma de numeros impares\n"
                		+ "7. suma de todos los numeros cargados\n"
                		+ "8. mostrar los ultimos 3 numeros cargados\n"
                		+ "9. mostrar los numeros de forma inversa\n"
                		+ "10. mostrar los numeros de los indices pares\n"
                		+ "11. mostrar los numeros de los indices impares\n"
                		+ "0. salir\n"
                		+ "ingrese operacion: ");
        	  
        	  op = scanner.nextInt();
              
              switch(op) {
              case 0:
            	  print("[+] saliendo\n");
            	  scanner.close();
            	  return;
              case 1:
            	  for(i = 0; i < arr.length; i++){
                      print("ingresar numero " + i + ": ");
                      arr[i] = scanner.nextInt();
            	  }
            	  break;
              case 2:
            	  for(i = 0; i < arr.length; i++){
                      print("numero en la pos " + i + ": " + arr[i] + '\n');
            	  }
            	  break;
              case 3:
            	  for(i = 0; i < arr.length; i++){
                      cNumPares += arr[i] % 2 == 0 ? 1 : 0;
            	  }
            	  print("cantidad de pares: " + cNumPares + "\n");
            	  break;
              case 4:
            	  for(i = 0; i < arr.length; i++){
                      cNumImpares += arr[i] % 3 == 0 ? 1 : 0;
            	  }
            	  print("cantidad de impares: " + cNumImpares + "\n");
            	  break;
            	  
              case 5:
            	  for(i = 0; i < arr.length; i++){
                      sNumPares += arr[i] % 2 == 0 ? arr[i] : 0;
            	  }
            	  print("suma de pares: " + sNumPares + "\n");
            	  break;
            	  
              case 6:
            	  for(i = 0; i < arr.length; i++){
                      sNumImpares += arr[i] % 3 == 0 ? arr[i] : 0;
            	  }
            	  print("suma de impares: " + sNumImpares + "\n");
            	  break;            	  
            	  
              case 7:
            	  for(i = 0; i < arr.length; i++){
                      sNumTodos += arr[i];
            	  }
            	  print("suma de todos: " + sNumTodos + "\n");
            	  break;
            	  
              case 8:
            	  for(i = arr.length; i > arr.length - 3; i--){
                      print("numero en la pos " + (i - 1) + ": " + arr[i-1] + "\n");
            	  }
            	  break;
              case 9:
            	  for(i = arr.length; i > 0; i--){
                      print("numero en la pos " + (i - 1) + ": " + arr[i-1] + "\n");
            	  }
            	  break;
              case 10:
            	  for(i = 0; i < arr.length; i++) {
            		  print(i % 2 == 0 ? "numero en la pos " + i + ": " + arr[i] + "\n" : "");
            	  }
            	  break;
              case 11:
            	  for(i = 0; i < arr.length; i++) {
            		  print(i % 3 == 0 ? "numero en la pos " + i + ": " + arr[i] + "\n" : "");
            	  }
            	  break;
            	 default:
            		 print("[-] ingrese modo valido\n");
            	  
              }  
          } while(true);                    
          
     }
     
}
