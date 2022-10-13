package Laboratorio;

public class Cadastro {
	
	private String nome;
	private String sobrenome;
	private int idade;
	
	
	public String getNome() {
		return nome;	
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getsobrenome() {
		return sobrenome;	
	}
	
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public int getIdade() {
		return idade;	
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void dados() {}
	
	public void dados2(String nome, String sobrenome) {
		this.nome = nome;
		this.sobrenome = sobrenome;
	}
	
	public void dados3(String nome, String sobrenome, int idade) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.idade = idade;
	}
	
	public void mostrar() {
		System.out.println("Nome: " + this.nome + "\n" + "Sobrenome: " + this.sobrenome + "\n" + "Idade: " + this.idade);
		
	}

}
