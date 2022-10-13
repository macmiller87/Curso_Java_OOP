package laboratorio;

//import java.util.Random;
import java.util.Scanner;

public class ExercicioMatriz2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int linha = sc.nextInt();
		int coluna = sc.nextInt();
		
		System.out.println();
		
		int numbers[][] = new int[linha][coluna];
		int numbers2[][] = new int[linha][coluna];
		int prodMatriz1E2[][] = new int[linha][coluna];
		
		//int numbers[][] = new int[3][3];
		//int numbers2[][] = new int[3][3];
		//int prodMatriz1E2[][] = new int[3][3];
		
		//Random number = new Random();
		
		for(int i = 0; i < numbers.length; i++) {
			for(int j = 0; j < numbers.length; j++) {
				//numbers[i][j] = number.nextInt(100);
				numbers[i][j] = sc.nextInt();
			}
		}
		
		for(int k = 0; k < numbers2.length; k++) {
			for(int l = 0; l < numbers2.length; l++) {
				//numbers2[k][l] = number.nextInt(100);
				numbers2[k][l] = sc.nextInt();
			}
		}

		System.out.println();
		System.out.println("Imprimindo Matriz 1");
		System.out.println();
		
		for(int i = 0; i < numbers.length; i++) {
			for(int j = 0; j < numbers.length; j++) {
				System.out.print(numbers[i][j] + " ");
			}
			System.out.println();
		}	
		
		System.out.println();
		System.out.println("Imprimindo Matriz 2");
		System.out.println();
		
		for(int k = 0; k < numbers2.length; k++) {
			for(int l = 0; l < numbers2.length; l++) {
				System.out.print(numbers2[k][l] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		int prodEntreMatrizes = 0;
		
		for(int i = 0; i < numbers.length; i++) {
			for(int j = 0; j < numbers.length; j++) {
				
				prodEntreMatrizes = numbers[i][j] * numbers2[i][j];
				System.out.println("Produto entre as matrizes 1 e 2, linha " + i + " da Matriz 1 * coluna " + j + " da Matriz 2 é: " + prodEntreMatrizes);
			}
			
		}
		
		System.out.println();
		System.out.println("Produto resultado entre as matrizes 1 e 2:");
		System.out.println();
		
		
		for(int i = 0; i < numbers.length; i++) {
			for(int j = 0; j < numbers.length; j++) {
				prodMatriz1E2[i][j] = numbers[i][j] * numbers2[i][j];
				System.out.print(prodMatriz1E2[i][j] + " ");
			}
			System.out.println();
		}
		
		sc.close();

	}

}
