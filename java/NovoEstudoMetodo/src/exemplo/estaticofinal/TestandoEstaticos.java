package exemplo.estaticofinal;

public class TestandoEstaticos {

	public static void main(String[] args) {

		double raio = 2.3;
		
		double perimetro = 2 * raio * ConstantePI.PI;
		
		System.out.printf("O valor do perimetro é : %.2f", perimetro);
	}

}
