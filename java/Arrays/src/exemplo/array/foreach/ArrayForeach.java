package exemplo.array.foreach;

import java.util.Scanner;

public class ArrayForeach {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] numeros = new int[6];
		
		for(int i = 0; i < numeros.length; i++) {
			numeros[i] = sc.nextInt();
		}
		
		// Equivalente ao (foreach e for in) do JS.
		for(int num: numeros) {
			System.out.println(num);
		}
		
		sc.close();
		
	}

}
