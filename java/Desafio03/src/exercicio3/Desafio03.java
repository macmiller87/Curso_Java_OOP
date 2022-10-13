/*
 * Crie um algoritmo que leia um número inteiro e mostre seu antecessor.
*/

package exercicio3;

import java.util.Scanner;

public class Desafio03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro para ver o seu número Antecessor: ");
		int numero = sc.nextInt();
		System.out.println();
		
		int numAntecessor = numero - 1;
		
		System.out.println("O número digitado foi: " + numero + ".");
		System.out.println();
		System.out.println("Seu número antecessor é: " + numAntecessor + ".");
		
		sc.close();

	}

}
