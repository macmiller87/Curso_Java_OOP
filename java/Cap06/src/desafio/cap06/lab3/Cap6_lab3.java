package desafio.cap06.lab3;

public class Cap6_lab3 {

	public static void main(String[] args) {
		
		Aluno joao = new Aluno();
		joao.setNome("Joao");
		Aluno.contadorAluno++;
		joao.imprimeAluno();
		System.out.println("Contando a variavel a partir do objeto João: " + joao.contadorAluno);
		System.out.println();
		
		Aluno maria = new Aluno();
		maria.setNome("Maria");
		Aluno.contadorAluno++;
		maria.imprimeAluno();
		System.out.println("Contando a variavel a partir do objeto Maria: " + maria.contadorAluno);
		System.out.println();
		
		Aluno marcos = new Aluno();
		marcos.setNome("Marcos");
		Aluno.contadorAluno++;
		marcos.imprimeAluno();
		System.out.println("Contando a variavel a partir do objeto Marcos: " + marcos.contadorAluno);
		
		System.out.println();
		System.out.println("Contador acessado diretamente da classe: " + Aluno.contadorAluno);

	}

}
