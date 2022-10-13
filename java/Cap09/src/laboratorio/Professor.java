package laboratorio;

public class Professor  extends Pessoa{

	private float salario;
	private String disciplina; 
	
	public float getSalario() {
		return salario;
	}
	
	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	public String getDisciplina() {
		return disciplina;
	}
	
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	
	public Professor(String nome, int idade, char sexo, int numeroRG, String dataNasc, float salario, String disciplina) {
		
		super(nome, idade, sexo, new RG(numeroRG, dataNasc));
		
		this.salario = salario;
		this.disciplina = disciplina;
		
	}


	public String Falar(String fala) {
		
		System.out.println(this.getNome() + ": " + fala);
		return fala;
	}


	public void MostarDados() {
		
		System.out.println();
		System.out.println("--- " + "Professor: " + nome + " ---");
		System.out.println("Idade: " + idade);
		System.out.println("Sexo: " + sexo);
		System.out.println("Salario: " + salario);
		System.out.println("Disciplina: " + disciplina);
		System.out.println("Numero RG: " + rg.getNumero());
		System.out.println("Data de Nascimento: " + rg.getDataNasc());
		
		
	}

}
