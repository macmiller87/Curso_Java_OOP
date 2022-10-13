package primeirasinstrucoes;

public class OpTernario {

	public static void main(String[] args) {
		int g = 54, k = 98;
		
		System.out.println(g + k > k - g ? "Sim, é maior!" : "Não. é menor.");
		
		int idadeJonatha = 18;
		String mensagem = !(idadeJonatha < 18)? "entra ae": "de meia-volta";
		System.out.println(mensagem);

	}

}
