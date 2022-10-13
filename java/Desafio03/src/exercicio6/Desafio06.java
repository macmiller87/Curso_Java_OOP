/*
 * Crie um algoritmo que receba do usúario um número qualquer e verifique se esse é múltiplo de 5. 
*/
package exercicio6;

import java.util.Scanner;

public class Desafio06 {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		
		System.out.print("Digite um número inteiro, para verificar se o número informado é múltiplo de 5: ");
		
		int numero = sc.nextInt();
		System.out.println();
		
		if(numero % 5 == 0) {
			System.out.println("O número: " + numero + " é múltiplo de 5.");
			
		}else {
			System.out.println("O número: " + numero + " não é múltiplo de 5.");
		}
		
		sc.close();

	}

}
