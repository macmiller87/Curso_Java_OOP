package laboratorio;

import java.util.Random;

public class ExercicioMatriz {

	public static void main(String[] args) {
		
		int numbers[][] = new int[10][10];
		
		Random number = new Random();
		
		for(int i = 0; i < numbers.length; i++) {
			for(int j = 0; j < numbers.length; j++) {
				numbers[i][j] = number.nextInt(9) + 1;
			}
		}
		
		System.out.println("Conteúdo de cada posição da matriz");
		System.out.println();
		
		for(int k = 0; k < numbers.length; k++) {
			for(int l = 0; l < numbers.length; l++) {
				
				System.out.println("matriz[" + k + "][" + l + "] = " + numbers[k][l]);
				
			}
		}
		
		System.out.println();
		System.out.println("Conteúdo da matriz completa");
		System.out.println();
		
		for(int m = 0; m < numbers.length; m++) {
			for(int n = 0; n < numbers.length; n++) {
				System.out.print(numbers[m][n] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		int soma = 0;
		
		for(int i = 0; i < 10; i++) {
			soma += numbers[i][2];
		}

		System.out.println("Soma da 3 coluna da matriz " + soma);
	}

}
