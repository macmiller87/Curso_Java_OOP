package exemplo.poo.abstrato;

public class Calculando {

	public static void main(String[] args) {
		
		Quadrado q = new Quadrado(10);
		Triangulo t = new Triangulo(5.2, 20.3);
		
		q.CalcularArea();
		t.CalcularArea();
		
	}

}
