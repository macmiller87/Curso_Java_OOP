package primeirasinstrucoes;

public class OrdemPrioriOp {

	public static void main(String[] args) {
		
		int a = 1 + 2 * 3 / 4 + 5;
		int b = (1 + 2) * ((3 / 4) + 5);

		System.out.println("Resultado da primeira operação - sem parenteses: " + a);
		System.out.println("Resultado da segunda operação - com parenteses: " + b);

	}

}
