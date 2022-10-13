package exemplo.estrutura.repeticao;

public class ExemploBreakFor {

	public static void main(String[] args) {
		
		for(int i = 1; i < 11; i++) {
			
			if(i == 5) {
				System.out.println("O valor da variavel iteradora é: " + i);
				break;
			}
			
			System.out.println("Proxima linha após o if!");
			
		}

	}

}
