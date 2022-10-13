package exemplo.intro.poo;

public class Empregado {
	
	private String nome;
	private String endereco;
	private int idade;
	
	void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	void setNome(String nome) {
		this.nome = nome;
	}
	
	void setIdade(int idade) {
		this.idade = idade;
	}
	
	String mostrarValores() {
		return("Nome: " + nome + "\n" + "Endereço: " + endereco + "\n" + "Idade: " + idade);
	}
	
}
