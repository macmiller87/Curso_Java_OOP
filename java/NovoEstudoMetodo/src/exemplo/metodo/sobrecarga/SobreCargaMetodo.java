package exemplo.metodo.sobrecarga;

public class SobreCargaMetodo {
	
	static void mostrar(int valor) {
		System.out.println("O valor oferecido ao 1 método é: " + valor);
	}
	
	static void mostrar(String nome) {
		System.out.println("O valor oferecido ao 2 método é: " + nome);
	}
	
	static void mostrar() {
		System.out.println("M�todo sem parametros.");
	}

}
