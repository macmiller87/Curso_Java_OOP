/*
 * Escreva um algoritmo que leia o ano de nascimento de uma pessoa e apresente uma linha do tempo, mostrando cada ano de vida da pessoa e quantos anos ela tinha em cada ano at� o ano atual.
*/

package exercicio10;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Desafio10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Date date = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		int anoAtual = calendar.get(Calendar.YEAR);
		
		
		System.out.print("Linha do tempo atrav�s do Ano de Nascimento.");
		System.out.println();
		System.out.println();
		
		System.out.print("Informe seu ano de Nascimento: ");
		int anoNascimento = sc.nextInt();
		System.out.println();
		
		int count = 0;
		
		for(int i = anoNascimento; i <= anoAtual; i++, count++) {
			
			if(i == anoNascimento) {
				System.out.println("Estamos no ano de: " + i + ", aqui voc� nasceu, e tem " + count + " anos de idade.");
				
			} else if(i == anoAtual) {
				System.out.println("Estamos no ano de: " + i + ", aqui voc� tem " + count + " anos de idade.");
				
			}else {
				System.out.println("Estamos no ano de: " + i + ", aqui voc� tinha " + count + " anos de idade.");
			}
			
		}
		
		sc.close();

	}

}
