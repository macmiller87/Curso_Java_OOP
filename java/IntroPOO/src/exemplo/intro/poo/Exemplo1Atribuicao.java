package exemplo.intro.poo;

public class Exemplo1Atribuicao {

	public static void main(String[] args) {
		
		Pessoa joao = new Pessoa();
		Pessoa maria = new Pessoa();
		
		joao.genero = 'M';
		joao.idade = 44;
		joao.nome = "Jo�nzinho";
		
		maria.genero = 'F';
		maria.idade = 25;
		maria.nome = "Mariinha";
		
		joao = maria;
		
		System.out.println("O objeto Jo�o declara o genero como " + joao.genero + ", seu nome � " + joao.nome + ", e tem " + joao.idade + " anos de idade.");;

	}

}
