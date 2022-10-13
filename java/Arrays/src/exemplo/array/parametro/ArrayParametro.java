package exemplo.array.parametro;

public class ArrayParametro {
	static int[] dobrarValores(int[] aux) {
		
		for(int i = 0; i < aux.length; i ++) {
			aux[i] *= 2;
		}
		
		return aux;
	}

	public static void main(String[] args) {
		
		int valoresA[] = {10, 20, 30};
		int valoresB[] = new int[3];
		
		for(int i = 0; i < valoresA.length; i++) {
			System.out.println("valoresA[" + i + "] = " + valoresA[i]);
		}
		
		System.out.println("----------------------------------------");
		
		valoresB = dobrarValores(valoresA);
		
		for(int j = 0; j < valoresB.length; j++) {
			System.out.println("valoresB[" + j + "] = " + valoresB[j]);
		}

	}

}
