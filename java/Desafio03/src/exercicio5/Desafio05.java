/*
 * Crie um algoritmo que solicite o nome, o endere�o e o telefone do usu�rio e depois mostra os dados digitados em uma �nica linha 
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
		
		System.out.print("Informe seu endere�o : ");
		String endereco = sc.nextLine();
		
		System.out.print("Informe seu Telefone: ");
		String telefone = sc.nextLine();
		
		System.out.println();
		System.out.println("Os dados informados foram: ");
		System.out.println();
		
		System.out.println("Nome: " + nome + ", Endere�o: " + endereco + ", Telefone: " + telefone + ".");
		
		sc.close();

	}

}
