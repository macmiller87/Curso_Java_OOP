/*
 * Crie um algoritmo que leia dois números inteiros, X e Y, e mostre o resultado da mmultiplicação de x por y.
*/

package exercicio4;

import java.util.Scanner;

public class Desafio04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite 2 números inteiros para efetuar a multiplicação.");
		System.out.println();
		System.out.println();
		
		System.out.print("Digite o Primeiro número: ");
		int X = sc.nextInt();
		
		System.out.print("Digite o Segundo número: ");
		int Y = sc.nextInt();
		
		int resultado = X * Y;
		
		System.out.println();
		System.out.println("O resultado da multiplicação de " + X + " por " + Y + " é igual à : " + resultado + ".");
		
		sc.close();

	}

}
