package cap5lab1;

public class Funcionario {
	
	public String nome;
	public String sobrenome;
	public String cargo;
	public int salario;

	void setNome(String nome) {
		this.nome = nome;
	}
	
	void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	void setSalario(int salario) {
		this.salario = salario;
	}
	
	String exibirValores() {
		return("Nome: " + nome + "\n" + "Sobrenome: " + sobrenome + "\n" + "Cargo: " + cargo + "\n" + "Salário: " + salario);
	}
	
}
