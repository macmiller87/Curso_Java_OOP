package exemplo.poo.interfac;

public class Televisao implements Eletrodomestico {

	@Override
	public void ligar() {
		System.out.println("Ligando TV .. ");
	}

	@Override
	public void desligar() {
		System.out.println("TV desligada .. ");
	}

}
