/*
 * Uma escola possui um determinado número de turmas. Crie um algoritmo que leia a quantidade de turmas existentes na escola. Para cada turma, leia a quantidade de alunos e, para cada aluno, leia a sua média no semestre. Informe a média de cada uma das turmas.
*/

package exercicio14;

import java.util.Scanner;

public class Desafio14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantidade de turmas na escola");
		System.out.println();
		System.out.println();
		
		System.out.print("Informe a quantidade de turma: ");
		int quantTurmas = sc.nextInt();
		int totalTurmas[] = new int[quantTurmas];
		
		int quantAlunos = 0;
		double mediaAluno = 0;
		
		System.out.println();
		
		for(int i = 0; i < quantTurmas; i++) {
			
			System.out.print("Qual a quantidade de alunos na turma " + (i + 1) + " :");
			quantAlunos = sc.nextInt();
			System.out.println();
			
			totalTurmas[i] = quantAlunos;
			double MediaTurma = 0;
			double resultMediaTurma = 0;
			
			for(int j = 0; j < quantAlunos; j++) {
				
				System.out.print("Qual a média do aluno " + (+ j + 1) + " :");
				mediaAluno = sc.nextDouble();
				MediaTurma += mediaAluno;
				resultMediaTurma = MediaTurma / quantAlunos;
				
			}
			
			System.out.println();
			System.out.printf("A média da turma " + (i + 1) + " foi: %.2f", resultMediaTurma);
			System.out.println();
			System.out.println();
			
		}
		
		sc.close();

	}

}
