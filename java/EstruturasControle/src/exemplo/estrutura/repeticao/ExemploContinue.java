package exemplo.estrutura.repeticao;

public class ExemploContinue {

	public static void main(String[] args) {
		
		int valor = 0;
		
		while(valor < 10) {
			
			++valor;
			
			if(valor == 5) {
				continue;
			}
			
			System.out.println("Iterações da variavel valor: " + valor);
			
		}

	}

}
