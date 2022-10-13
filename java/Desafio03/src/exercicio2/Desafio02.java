
/*
 * Crie um algoritmo que leia um número inteiro e mostre seu sucessor.
*/

package exercicio2;

import java.util.Scanner;

public class Desafio02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro para ver o seu número sucessor: ");
		int numero = sc.nextInt();
		System.out.println();
		
		int numSucessor = numero + 1;
		
		System.out.println("O número digitado foi: " + numero + ".");
		System.out.println();
		System.out.println("Seu número sucessor é: " + numSucessor + ".");
		
		sc.close();

	}

}
