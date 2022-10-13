/*
 * Escreva um algoritmo que leia uma sequ�ncia de n�meros do usu�rio e realize a soma desses n�meros. Encerre a execu��o quando um n�mero negativo for digitado. 
*/

package exercicio12;

import java.util.Scanner;

public class Desafio12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite n�meros inteiros para somar!");
		System.out.println();
		System.out.println();
		
		int numero;
		int somaNumeros = 0;
		
		do {
			
			System.out.print("Digite um n�mero: ");
			numero = sc.nextInt();
			somaNumeros += numero;
			
		}while(numero >= 0);
		
		System.out.println();
		System.out.println("A soma dos n�meros � igual a: " + somaNumeros);
		sc.close();

	}

}
