package exemplo.poo.interfac;

public class Microondas implements Eletrodomestico {

	@Override
	public void ligar() {
		System.out.println("Ligando Microondas .. ");	
	}

	@Override
	public void desligar() {
		System.out.println("Microondas desligado .. ");
	}
	
}
