package exemplo.estrutura.repeticao;

public class ExemploInstrucoesRotuladas {

	public static void main(String[] args) {

		instrucao1: for (int i = 1; i < 4; i++) {

			instrucao2: for (int j = 1; j < 4; j++) {

				if (j == 2) {
					System.out.println("Saindo da instrução 1");
					break instrucao1;
				}
				System.out.println("Texto instrução " + j);
			}
			System.out.println("Texto instrução1");

		}
	}

}
