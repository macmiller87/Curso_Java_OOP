package primeirasinstrucoes;

public class IncreDecre {

	public static void main(String[] args) {
		int h = 7;
		
		System.out.println("Incremento sufixo: " + (h++) * 5);
		System.out.println("Valor da variavel h com incremento sufixo: " + h);
		System.out.println("Incremento prefixo: " + (++h));
		
		System.out.println("Decremento sufixo: " + (h--));
		System.out.println("Valor da variavel h com decremento sufixo: " + h);
		System.out.println("Decremento prefixo: " + (--h));

	}

}
