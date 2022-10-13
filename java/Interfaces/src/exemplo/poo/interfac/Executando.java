package exemplo.poo.interfac;

public class Executando {

	public static void main(String[] args) {
		
		Eletrodomestico tv = new Televisao();
		Eletrodomestico ge = new Geladeira();
		Eletrodomestico mi = new Microondas();
		
		tv.ligar();
		tv.acionarTimer(4);
		
		ge.ligar();
		ge.acionarTimer(8);
		
		mi.ligar();
		mi.acionarTimer(12);
		
		/* Eletrodomestico a, b, c, d, e, f, g;
		
		a = new Geladeira();
		b = new Televisao();
		c = new Televisao();
		d = new Geladeira();
		e = new Microondas();
		f = new Televisao();
		g = new Microondas();
		
		Eletrodomestico.ligarTudo(a, b, c, d, e, f, g); */
		
		/*Eletrodomestico aparelho;
		
		aparelho = new Geladeira();
		aparelho.ligar();
		
		aparelho = new Televisao();
		aparelho.ligar();
		
		aparelho = new Microondas();
		aparelho.ligar(); */

	}

}
