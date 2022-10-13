/*
 * Escreva um algoritmo que leia uma sequência de números do usuário e realize a soma desses números. Encerre a execução quando um número negativo for digitado. 
*/

package exercicio12;

import java.util.Scanner;

public class Desafio12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite números inteiros para somar!");
		System.out.println();
		System.out.println();
		
		int numero;
		int somaNumeros = 0;
		
		do {
			
			System.out.print("Digite um número: ");
			numero = sc.nextInt();
			somaNumeros += numero;
			
		}while(numero >= 0);
		
		System.out.println();
		System.out.println("A soma dos números é igual a: " + somaNumeros);
		sc.close();

	}

}
