package exemplo.argumentos.variaveis;

public class ChamarMetodosVarArgs {

	public static void main(String[] args) {
	
		int resultado;
		int intArray[] = {90, -67, 456, 789, 35, 68, 11};
		
		CriandoMetodosVars metodos = new CriandoMetodosVars();
		
		resultado = metodos.calcular(intArray);

		System.out.println("Resultado obtido a partir da chamada do m�todo calcular():" 
				+ resultado);
		
		resultado = metodos.contar(85, 234, 12, 56, 845, 9, 47);
		System.out.println("Resultado obtido a partir da chamada do m�todo contar(): "
				+ resultado);

	}

}
