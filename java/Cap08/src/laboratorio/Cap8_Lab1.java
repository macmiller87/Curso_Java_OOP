package laboratorio;

public class Cap8_Lab1 {
	
	public static int maiorNumero(int[] numbers) {
		
		int aux = 0;
		
		for(int i = 0; i < numbers.length; i++) {
			
			if(aux < numbers[i]) {
				aux = numbers[i];
			}
			
		}
		
		return aux;
	}
	
	public static void main(String[] args) {
		
		int numeros[] =  {1, 2, 99, 88};
		
		int Maiorvalor = maiorNumero(numeros);
		
		System.out.println(Maiorvalor); 		
		
	}

}
