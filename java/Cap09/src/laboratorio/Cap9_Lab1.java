package laboratorio;

public class Cap9_Lab1 {

	public static void main(String[] args) {
		
		Pessoa chaves = new Aluno("Chaves", 18 , 'M', 12345678, "30/01/1960", 400, "ADS");
		Pessoa kiko = new Aluno("Kiko", 22 , 'M', 87654321, "01/10/1958", 800, "Ciência da Computação");
		Pessoa girafales = new Professor("Girafales", 54, 'M', 12458923, "12/04/1940", 4000, "POO");
		
		girafales.Falar("Chaves ?");
		chaves.Falar("Presente");
		girafales.Falar("kiko ?");
		kiko.Falar("Presente");
		
		girafales.MostarDados();
		chaves.MostarDados();
		kiko.MostarDados();
		
	}

}
