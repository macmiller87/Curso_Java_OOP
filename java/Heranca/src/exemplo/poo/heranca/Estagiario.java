package exemplo.poo.heranca;

public class Estagiario extends Dev {
	
	String relatorio;
	String horas;
	
	public Estagiario() {}
	
	public Estagiario(String relatorio, String horas, String nome, double graninha) {
		
		this.relatorio = relatorio;
		this.horas = horas;
		this.nome = nome;
		super.setSalario(graninha);
		
	}
	
	public void exibirDados() {
		
		System.out.println("Nome: " + nome);
		System.out.println("Relatório do Estagiario: " + relatorio);
		System.out.println("Quantidade de horas: " + horas);
		System.out.println("Salario: " + super.getSalario());
		
	}
	
}
