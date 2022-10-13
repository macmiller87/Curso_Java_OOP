package exemplo.poo.heranca;

public class Dev extends Funcionario {
	
	private String linguagemProg;
	private String sistemaOp;
	private double salario;

	public String getLinguagemProg() {
		return linguagemProg;
	}
	
	public void setLinguagemProg(String linguagemProg) {
		this.linguagemProg = linguagemProg;
	}
	
	public String getSistemaOp() {
		return sistemaOp;
	}
	
	public void setSistemaOp(String sistemaOp) {
		this.sistemaOp = sistemaOp;
	}
	
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public Dev() {}
	
	public Dev(String n, String e, String linguagem, String so) {
		nome = n;
		email = e;
		this.linguagemProg = linguagem;
		this.sistemaOp = so;
	}
	
	public Dev(double salario) {
		this.salario = salario;
	}
	
	public void exibirDados() {
		
		System.out.println("Nome: " + nome);
		System.out.println("email: " + email);
		System.out.println("Linguagem de Programação: " + linguagemProg);
		System.out.println("Sistema Operacional: " + sistemaOp);
		
	}

}
