
/*
 * Crie um algoritmo que leia um n�mero inteiro e mostre seu sucessor.
*/

package exercicio2;

import java.util.Scanner;

public class Desafio02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um n�mero inteiro para ver o seu n�mero sucessor: ");
		int numero = sc.nextInt();
		System.out.println();
		
		int numSucessor = numero + 1;
		
		System.out.println("O n�mero digitado foi: " + numero + ".");
		System.out.println();
		System.out.println("Seu n�mero sucessor �: " + numSucessor + ".");
		
		sc.close();

	}

}
