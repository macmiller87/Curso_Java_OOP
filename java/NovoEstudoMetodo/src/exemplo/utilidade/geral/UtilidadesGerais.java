package exemplo.utilidade.geral;

public class UtilidadesGerais {

	public static String inventerString(String texto) {
		
		char[] letras = texto.toCharArray();
		
		char[] letrasInvertidas = new char[letras.length];
		
		for(int i = 0; i < letras.length; i++) {
			
			letrasInvertidas[letras.length -i -1] = letras[i];
		}
	
		return new String(letrasInvertidas);
	}

}
