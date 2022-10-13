/*
 * Crie um algoritmo que, dada uma temperatura em graus célsius, exiba uma mensagem informando o tipo do clima, de acordo com as seguintes condições: se a temperatura estiver até 18 graus, o clima é frio; se a temperatura estiver entre 19 e 23 graus, o clima é agradável; se a temperatura estiver entre 24 e 35 graus, o clima é quente; se a temperatura estiver acima de 35 graus, o clima é muito quente. 
*/

package exercicio7;

import java.util.Scanner;

public class Desafio07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe qual a temperatura: ");
		int temperatura = sc.nextInt();
		System.out.println();
		
		if(temperatura <= 18) {
			System.out.println("O clima é frio.");
			
		}else if(temperatura > 18 && temperatura <= 23) {
			System.out.println("O clima é agradavél.");
			
		}else if(temperatura > 23 && temperatura <= 35) {
			System.out.println("O clima é quente.");
			
		}else {
			System.out.println("O clima é muito quente.");
		}
		
		sc.close();
		
	}

}
