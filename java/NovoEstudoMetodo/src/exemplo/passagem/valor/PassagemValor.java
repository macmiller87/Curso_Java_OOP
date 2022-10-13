package exemplo.passagem.valor;

public class PassagemValor {
	
		static void alterarValor(int valor) {
			valor = 123;
		}
		
		static void alterarRefObj(Pessoa p) {
			
			Pessoa ana = new Pessoa();
			ana.nome = "Ana";
			ana.idade = 33;
			ana.genero = 'F';
			p = ana;
			p.exibirDados();
		}
		
		static void alterarContObj(Pessoa p) {
			p.idade = 95;
			p.genero = 'M';
		}


	public static void main(String[] args) {
	
		int valor = 1500;
		
		System.out.println("Antes da chamada do m�todo alterarValor - o valor é: " + valor);
		
		alterarValor(valor);
		
		System.out.println("Depois da chamada do método alterarValor - o valor �: " + valor);
		
		System.out.println("================================================================");		
		
		
		
		System.out.println("=============IMPLEMENTA��O DA CLASSE PESSOA=======================");
		
		Pessoa maria = new Pessoa();
		maria.nome = "Maria";
		maria.idade = 26;
		maria.genero = 'F';
		
		System.out.println("Valores antes da chamada do método alterarRefObj:");
		maria.exibirDados();
		
		alterarRefObj(maria);
		
		System.out.println("Valores depois da chamada do m�todo alterarRefObj:");
		maria.exibirDados();
		
		System.out.println("================================================================");	
		
		
		System.out.println("Conteudo/Valores antes da chamda do m�todo alterarContObj");
		maria.exibirDados();
		
		alterarContObj(maria);
		
		System.out.println("Conteudo/Valores depois da chamda do m�todo alterarContObj");
		maria.exibirDados();
		
		System.out.println("=============IMPLEMENTA��O DA CLASSE PESSOA=======================");
	}	
	
}
