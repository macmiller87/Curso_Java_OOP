/*
 * Crie um algoritmo que receba do us�ario um n�mero qualquer e verifique se esse � m�ltiplo de 5. 
*/
package exercicio6;

import java.util.Scanner;

public class Desafio06 {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		
		System.out.print("Digite um n�mero inteiro, para verificar se o n�mero informado � m�ltiplo de 5: ");
		
		int numero = sc.nextInt();
		System.out.println();
		
		if(numero % 5 == 0) {
			System.out.println("O n�mero: " + numero + " � m�ltiplo de 5.");
			
		}else {
			System.out.println("O n�mero: " + numero + " n�o � m�ltiplo de 5.");
		}
		
		sc.close();

	}

}
