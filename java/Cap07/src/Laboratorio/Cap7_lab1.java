package Laboratorio;

public class Cap7_lab1 {

	public static void main(String[] args) {
		
		Cadastro cad1 = new Cadastro();
		Cadastro cad2 = new Cadastro();
		Cadastro cad3 = new Cadastro();
		
		cad1.dados();
		cad2.dados2("Chapolim", "Colorado");
		cad3.dados3("Kiko", "Tesouro", 18);
		
		
		cad1.mostrar();
		System.out.println();
		
		cad2.mostrar();
		System.out.println();
		
		cad3.mostrar();
		

	}

}
