package login;

public class validar_passwords {
	
	private static char vocales[] = {'a', 'e', 'i', 'o', 'u'};
	
	private static boolean es_vocal(char ch) {
		for(char vocal: vocales) {
			if(vocal == ch)
				return true;
		}
		return false;
	}
	
	private static int contar_vocales(String str) {
		int contador_vocales = 0;
		char[] charray = str.toCharArray();
		
		for(char ch: charray) {
			if(es_vocal(ch))
				contador_vocales++;
		}
		
		return contador_vocales;
	}
	
	private static boolean tres_consecutivas_validas(String str) {
		int contador_consecutivas = 1;
		char[] charray = str.toCharArray();
		char char_anterior = '\0';
		
		for(char ch: charray) {
			if(es_vocal(ch)) {
				if(es_vocal(char_anterior)) {
					contador_consecutivas++;
				} else {
					contador_consecutivas = 1;
				}
			} else {
				if(!es_vocal(char_anterior)) {
					contador_consecutivas++;
				} else {
					contador_consecutivas = 1;
				}
			}
			
			char_anterior = ch;
			
			if(contador_consecutivas >= 3) 
				return false;
		}
		
		return true;
	}
	
	private static boolean ocurrencias_validas(String str) {
		char[] charray = str.toCharArray();
		char char_anterior = '\0';
		
		for(char ch: charray) {
			if(ch == 'e' || ch == 'o')
				continue;
			
			if(ch == char_anterior)
				return false;
			
			char_anterior = ch;
		}
		
		return true;
	}
	
	public boolean validar(String str) {
		
		if(contar_vocales(str) < 1)
			return false;
		
		if(!tres_consecutivas_validas(str))
			return false;
		
		if(!ocurrencias_validas(str))
			return false;
		
		return true;
	}
	
	public String validar_error(String str) {
		if(contar_vocales(str) < 1)
			return "Se requieren vocales";
		
		if(!tres_consecutivas_validas(str))
			return "No se permiten tres vocales/consonantes consecutivas";
		
		if(!ocurrencias_validas(str))
			return "No se permiten dos ocurrencias consecutivas de la misma letra";
		
		return "Password valida";
	}
}
