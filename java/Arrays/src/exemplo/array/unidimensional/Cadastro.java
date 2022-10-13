package exemplo.array.unidimensional;

public class Cadastro {

	public static void main(String[] args) {
		
		Pessoa pessoas[] = new Pessoa[2];
		
		pessoas[0] = new Pessoa();
		pessoas[0].altura = 1.68;
		pessoas[0].peso = 68.5;
		
		pessoas[1] = new Pessoa();
		pessoas[1].altura = 1.81;
		pessoas[1].peso = 85.5;
		
		System.out.println(pessoas[0].altura);
		System.out.println(pessoas[0].peso);
		System.out.println();
		System.out.println(pessoas[1].altura);
		System.out.println(pessoas[1].peso);

	}

}
