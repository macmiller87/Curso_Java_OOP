
/*
 * Crie um algoritmo que escreve o seu nome completo, colocando uma palavra em cada linha.
*/

package exercicio1;

import java.util.Scanner;

public class Desafio01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		System.out.println();
		System.out.println();
		
		System.out.print("Informe seu Primeiro Nome: ");
		String firstName = sc.nextLine();
		
		System.out.print("Informe seu Segundo Nome: ");
		String middleName = sc.nextLine();
		
		System.out.print("Informe seu Terceiro Nome: ");
		String LastName = sc.nextLine();
		System.out.println();
		
		System.out.print("O nome informado foi:");
		System.out.println();
		System.out.println();
		System.out.println(firstName);
		System.out.println(middleName);
		System.out.println(LastName);
		
		sc.close();
	}

}
