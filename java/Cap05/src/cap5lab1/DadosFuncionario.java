package cap5lab1;

public class DadosFuncionario {

	public static void main(String[] args) {
		
		Funcionario func1 = new Funcionario();
		
		func1.setNome("Tesouro");
		func1.setSobrenome("Do papai");
		func1.setCargo("Programador");
		func1.setSalario(4000);
		
		System.out.println(func1.exibirValores());
	}

}
