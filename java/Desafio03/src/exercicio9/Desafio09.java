/*
 * Escreva um algoritmo que leia um n�mero qualquer do usu�rio e escreva os �mpares existentes entre 1 e o n�mero informado pelo usu�rio. 
*/

package exercicio9;

import java.util.Scanner;

public class Desafio09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe um n�mero inteiro, para verificar os n�meros impares no intervalo entre 1 e o n�mero informado: ");
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
