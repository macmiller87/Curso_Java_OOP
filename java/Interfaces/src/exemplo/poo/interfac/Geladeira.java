package exemplo.poo.interfac;

public class Geladeira implements Eletrodomestico {

	@Override
	public void ligar() {
		System.out.println("Ligando Geladeira .. ");
	}

	@Override
	public void desligar() {
		System.out.println("Geladeira desligada .. ");
	}
	
}
