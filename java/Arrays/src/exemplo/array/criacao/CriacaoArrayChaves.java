package exemplo.array.criacao;

public class CriacaoArrayChaves {

	public static void main(String[] args) {
		
		int numero = 5;
		
		int codigo[] = {0, 1, 2, 3, 4, numero, 15, 25};
		
		for(int i = 0; i < codigo.length; i++) {
			System.out.println("Foram encontardos os seguintes elementos na posição: " + i + " = " + codigo[i]);
		}

	}

}
