package exemplo.bidirecional.direto;

public class AtribuicaoBidimensionalDireto {

	public static void main(String[] args) {
		
		int elementos[][] = { {0, 1, 1}, {21, 89} };
		
		for(int i = 0; i < elementos.length; i++) {
			
			for(int j = 0; j < elementos[i].length; j++) {
				System.out.println(elementos[i][j]);
			}
			
		}

	}

}
