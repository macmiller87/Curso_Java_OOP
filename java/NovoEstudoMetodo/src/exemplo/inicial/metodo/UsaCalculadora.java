package exemplo.inicial.metodo;

public class UsaCalculadora {

	public static void main(String[] args) {

		int somando;
		
		Calculadora calc = new Calculadora();
		
		somando = calc.somar(12, 60);
		
		System.out.println("Chamada do m�todo somar - resultado: " + somando);

	}

}
