package exemplo.poo.polimorfismo;

public class Zoologico {
	
	public static void main(String[] args) {
	
		Animal animalzinho = new Animal();
		Zebra zebrinha = new Zebra();
		Leao leaozinho = new Leao();
		
		animalzinho.comer();
		
		animalzinho = zebrinha;
		animalzinho.comer();
		
		animalzinho = leaozinho;
		animalzinho.comer();
		
	}

}
