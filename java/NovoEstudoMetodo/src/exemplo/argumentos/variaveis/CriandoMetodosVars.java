package exemplo.argumentos.variaveis;

public class CriandoMetodosVars {
	
	public int calcular(int[] lista) {
		
		int soma = 0;
	
		for(int i: lista) {
			soma += i;
		}
		return soma;
	}
	
	public int contar(int ...lista) {
		
		int soma = 0;

		for(int i: lista) {
			soma += i;
		}
		
		return soma;
	}

}
