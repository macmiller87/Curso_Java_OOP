/*
 * Crie um algoritmo que leia um n�mero inteiro e mostre seu antecessor.
*/

package exercicio3;

import java.util.Scanner;

public class Desafio03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um n�mero inteiro para ver o seu n�mero Antecessor: ");
		int numero = sc.nextInt();
		System.out.println();
		
		int numAntecessor = numero - 1;
		
		System.out.println("O n�mero digitado foi: " + numero + ".");
		System.out.println();
		System.out.println("Seu n�mero antecessor �: " + numAntecessor + ".");
		
		sc.close();

	}

}
