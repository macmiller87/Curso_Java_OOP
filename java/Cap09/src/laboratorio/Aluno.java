package laboratorio;

public class Aluno extends Pessoa {

	private float mensalidade;
	private String curso;
	
	public float getMensalidade() {
		return mensalidade;
	}
	
	public void setMensalidade(float mensalidade) {
		this.mensalidade = mensalidade;
	}
	
	public String getCurso() {
		return curso;
	}
	
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	public Aluno(String nome, int idade, char sexo, int numeroRG, String dataNasc, float mensalidade, String curso) {
		
		super(nome, idade, sexo, new RG(numeroRG, dataNasc));
		
		this.mensalidade = mensalidade;
		this.curso = curso;
		
	}

	public String Falar(String fala) {
		
		System.out.println(this.getNome() + ": " + fala);
		return fala;
		
	}

	public void MostarDados() {
		
		
		System.out.println();
		System.out.println("--- " + "Aluno: " + nome + " ---");
		System.out.println("Idade: " + idade);
		System.out.println("Sexo: " + sexo);
		System.out.println("Mensalidade: " + mensalidade);
		System.out.println("Curso: " + curso);
		System.out.println("Numero RG: " + rg.getNumero());
		System.out.println("Data de Nascimento: " + rg.getDataNasc());
		
		
	}

}
