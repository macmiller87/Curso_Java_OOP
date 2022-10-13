/*
 * Crie um algoritmo que solicite o nome, o endereço e o telefone do usuário e depois mostra os dados digitados em uma única linha 
*/
package exercicio5;

import java.util.Scanner;

public class Desafio05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe alguns dados pessoais!");
		System.out.println();
		
		System.out.print("Informe seu nome completo: ");
		String nome = sc.nextLine();
		
		System.out.print("Informe seu endereço : ");
		String endereco = sc.nextLine();
		
		System.out.print("Informe seu Telefone: ");
		String telefone = sc.nextLine();
		
		System.out.println();
		System.out.println("Os dados informados foram: ");
		System.out.println();
		
		System.out.println("Nome: " + nome + ", Endereço: " + endereco + ", Telefone: " + telefone + ".");
		
		sc.close();

	}

}
