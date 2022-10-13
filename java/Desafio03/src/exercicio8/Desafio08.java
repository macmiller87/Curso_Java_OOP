/*
 * Construa um algoritmo que leia do usuário o salário e exiba uma mensagem de acordo com as seguintes:
condições: se o salário for até R$ 645, escreva a mensagem “Até 1 salário mínimo; se o salário for acima de R$ 645 e até
R$ 1935, escreva a mensagem “Até 3 salários mínimos”; se for acima de R$ 1935 e abaixo de R$ 3225, escreva a
mensagem “Até 5 salários mínimos”; se for acima de R$ 3225, escreva a mensagem “Acima de 5 salários mínimos”. 
*/

package exercicio8;

import java.util.Scanner;

public class Desafio08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe seu salário: ");
		double salario = sc.nextDouble();
		System.out.println();
		
		if(salario <= 645.00) {
			System.out.println("Até 1 salário mínimo.");
			
		}else if(salario >= 646.00 && salario <= 1935.00) {
			System.out.println("Até 3 salários mínimos.");
			
		}else if(salario >= 1936.00 && salario <= 3225.00) {
			System.out.println("Até 5 salários mínimos.");
			
		}else {
			System.out.println("Acima de 5 salários mínimos.");
		}
		
		sc.close();

	}

}
