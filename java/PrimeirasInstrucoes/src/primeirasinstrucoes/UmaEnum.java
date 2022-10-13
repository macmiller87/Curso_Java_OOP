package primeirasinstrucoes;

public class UmaEnum {
	
	public enum DiaDaSemana{
		SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO, DOMINGO;
	}

	public static void main(String[] args) {
	
		DiaDaSemana umDiaSensacional = DiaDaSemana.SEXTA;
		
		System.out.println("O Damião disse que: o dia sensacional da semana é - " 
		+ umDiaSensacional);		

	}

}
