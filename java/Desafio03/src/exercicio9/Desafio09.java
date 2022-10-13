/*
 * Escreva um algoritmo que leia um número qualquer do usuário e escreva os ímpares existentes entre 1 e o número informado pelo usuário. 
*/

package exercicio9;

import java.util.Scanner;

public class Desafio09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe um número inteiro, para verificar os números impares no intervalo entre 1 e o número informado: ");
		int numero = sc.nextInt();
		System.out.println();
		
		for(int i = 1; i <= numero; i++) {
			
			if(i % 2 != 0) {
				System.out.println(i);
			}
			
		}
		
		sc.close();

	}

}
