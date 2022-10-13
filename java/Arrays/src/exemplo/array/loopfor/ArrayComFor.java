package exemplo.array.loopfor;

public class ArrayComFor {

	public static void main(String[] args) {
		
		int arrayNumeros[] =  new int[10];
		
		//int arrayNumeros[];
		//arrayNumeros = new int[10];
		
		for(int i = 0; i < arrayNumeros.length; i++) {
			
			arrayNumeros[i] = i;
			System.out.println(arrayNumeros[i]);
			
		}

	}

}
