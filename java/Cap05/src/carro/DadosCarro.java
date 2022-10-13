package carro;

public class DadosCarro {

	public static void main(String[] args) {
		
		Garagem g = new Garagem();
		Carro carro = new Carro();
		
		carro.setCor("Preto");
		carro.setModelo("VW Jetta");
		carro.setPotenciaDoMotor(2.0);
		
		System.out.println(g.exibirValoresCarroPasseio());
		System.out.println(carro.exibirValores());
		
		System.out.println("------------------------------");
		
		carro.setModelo("Prata");
		carro.setModelo("VW Golf");
		carro.setPotenciaDoMotor(1.6);
		
		System.out.println(g.exibirValoresCarroUtilitario());
		System.out.println(carro.exibirValores());

	}

}
