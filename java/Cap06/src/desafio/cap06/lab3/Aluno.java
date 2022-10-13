package desafio.cap06.lab3;

public class Aluno {
	
	private String nome;
	public static int contadorAluno;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void imprimeAluno() {
		System.out.println("Aluno: " + this.nome);
	}

}
