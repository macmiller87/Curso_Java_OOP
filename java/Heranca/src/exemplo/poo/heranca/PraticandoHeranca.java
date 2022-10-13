package exemplo.poo.heranca;

public class PraticandoHeranca {

	public static void main(String[] args) {
		
		Dev trainee = new Dev();
		Estagiario novato = new Estagiario();
		
		trainee.nome = "Tesouro.";
		trainee.email = "tesouro@gmail.com .";
		trainee.setLinguagemProg("Javascript and Java.");
		trainee.setSistemaOp("Windows e Linux.");
		
		trainee.exibirDados();
		
		System.out.println();
		System.out.println("------------------------------");
		System.out.println();
		
		novato.nome = "Madruguinha";
		novato.relatorio = "Primeiro relatório";
		novato.horas = "2000";
		novato.setSalario(2000);
		
		novato.exibirDados();

	}

}
