/*
 * Crie um algoritmo que leia dois n�meros inteiros, X e Y, e mostre o resultado da mmultiplica��o de x por y.
*/

package exercicio4;

import java.util.Scanner;

public class Desafio04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite 2 n�meros inteiros para efetuar a multiplica��o.");
		System.out.println();
		System.out.println();
		
		System.out.print("Digite o Primeiro n�mero: ");
		int X = sc.nextInt();
		
		System.out.print("Digite o Segundo n�mero: ");
		int Y = sc.nextInt();
		
		int resultado = X * Y;
		
		System.out.println();
		System.out.println("O resultado da multiplica��o de " + X + " por " + Y + " � igual �: " + resultado + ".");
		
		sc.close();

	}

}
