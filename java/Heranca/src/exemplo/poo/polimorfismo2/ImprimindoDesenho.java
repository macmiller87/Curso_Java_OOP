package exemplo.poo.polimorfismo2;

public class ImprimindoDesenho {

	public static void main(String[] args) {
		
		Desenho d = new Desenho();
		Quadrado q = new Quadrado();
		Circulo c = new Circulo();
		
		d.imprimir();
		q.imprimir();
		c.imprimir();
		
		if(c instanceof Circulo) {
			System.out.println("Objeto do tipo construido Desenho");
			
		}else {
			System.out.println("Não é um objeto do tipo construido Desenho!");
		}

	}

}
