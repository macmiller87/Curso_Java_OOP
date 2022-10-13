package exemplo.intro.poo;

public class PrincipalEmpregado {

	public static void main(String[] args) {
		
		Empregado emp = new Empregado();
		
		emp.setNome("Dr Estranho");
		emp.setEndereco("Centro da Cidade");
		emp.setIdade(41);
		
		System.out.println(emp.mostrarValores());

	}

}
