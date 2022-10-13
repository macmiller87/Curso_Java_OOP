/*
 * Escreva um algoritmo que leia a quantidade de funcionários em uma empresa e, para cada funcionário leia seu nome e seu tempo de serviço (em meses). Se o funcionário possuir mais de 12 meses na empresa, escreva a mensagem “<NOME> tem direito a férias”. Caso contrário, escreva a mensagem “<NOME> não tem direito a férias”. Ao final, exiba quantos funcionários possuem direito a férias e quantos não possuem. 
*/

package exercicio11;

import java.util.Scanner;

public class Desafio11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe alguns dados:");
		System.out.println();
		System.out.println();
		
		System.out.print("Informe a quantidade de Funcionários: ");
		int quantFunc = sc.nextInt();
		System.out.println();
		
		String nomefuncionarios[] = new String[quantFunc];
		int tempoServicoFuncionarios[] = new int[quantFunc];
		
		int count = 1;
		int countFuncDirFerias = 0;
		int countFuncSemDirFerias = 0;
		
		for(int i = 0; i < quantFunc; i++, count++) {
			
			System.out.print("Informe o nome do " + count + " funcionário: ");
			nomefuncionarios[i] = sc.next();
			
			System.out.print("Informe o tempo de serviço do " + count + " funcionário: ");
			tempoServicoFuncionarios[i] = sc.nextInt();
			
			System.out.println();
			if(tempoServicoFuncionarios[i] >= 12) {
				
				System.out.println(nomefuncionarios[i] + " tem direito a férias.");
				countFuncDirFerias++;
				System.out.println();
				
			}else {
				
				System.out.println(nomefuncionarios[i] + " não tem direito a férias.");
				countFuncSemDirFerias++;
				System.out.println();
			}
			
		}
		
		System.out.println("Um total de " + countFuncDirFerias + " funcionarios tem direito a férias!");
		System.out.println("Um total de " + countFuncDirFerias + " funcionarios não tiveram direito a férias!");
		
		sc.close();

	}

}
