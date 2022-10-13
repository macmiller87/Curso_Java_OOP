/*
 * Crie um algoritmo que simule o funcionamento de um caixa de supermercado. O caixa fica aberto at� o fim do expediente e pode processar a compra de v�rios clientes. Cada cliente pode comprar v�rios itens. Ao ler cada item deve ser exibida uma mensagem para o operador do caixa perguntando se h� mais itens a serem processados. Ao final, exiba quanto a compra custou ao cliente. E ent�o solicite do operador do caixa a informa��o se deseja fechar o caixa. Encerre o algoritmo quando o usu�rio informar que deseja fechar o caixa
*/

package exercicio13;

import java.util.Scanner;

public class Desafio13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Bem vindo ao supermercado, fa�a suas compras!");
		System.out.println();
		System.out.println();
		
		System.out.print("Informe seu nome: ");
		String nome = sc.next();
		System.out.println();
		
		double pao = 2.00; 
		double leite = 6.00;
		double carne = 20.00;
		double batata = 8.00;
		double cerveja = 8.00;
		double ovos = 12.00;
		double acucar = 9.00;
		double sal = 6.00;
		
		int item;
		int aux = 0;
		
		System.out.print(" Digite (1) para (P�o)" + "\n" + " Digite (2) para (Leite)" + "\n" + " Digite (3) para (Carne)" + "\n" + " Digite (4) para (Batata)" + "\n" + " Digite (5) para (Cerveja)" + "\n" + " Digite (6) para (ovos)" + "\n" + " Digite (7) para (A�ucar)" + "\n" + " Digite (8) para (Sal) ");
		System.out.println();
		System.out.println();
		item = sc.nextInt();
		
		do {
			
			if(item < 1 || item > 8) {
				
				System.out.println();
				System.out.println("Op��o inv�lida");
				System.out.println();
				System.out.print(" Digite (1) para (P�o)" + "\n" + " Digite (2) para (Leite)" + "\n" + " Digite (3) para (Carne)" + "\n" + " Digite (4) para (Batata)" + "\n" + " Digite (5) para (Cerveja)" + "\n" + " Digite (6) para (ovos)" + "\n" + " Digite (7) para (A�ucar)" + "\n" + " Digite (8) para (Sal) ");
				System.out.println();
				System.out.println();
				item = 0;
				item = sc.nextInt();
				
			}else {
				aux = item;
			}			
			
		}while(item < 1 || item > 8);
		
		char operador = 0;
		int quantiadade = 0;
		
		if(aux >= 1 || aux <= 8) {
			
			System.out.println();
			System.out.print("Informe a quantidade desse item: ");
			quantiadade = sc.nextInt();
			System.out.println();
			
			switch (aux) {
			
				case 1: {
					double somaItem1 = pao * quantiadade;
					System.out.println("Valor total do Item 1" + somaItem1);
					break;
				}
				case 2: {
					double somaItem2 = leite * quantiadade;
					System.out.println("Valor total do Item 2" + somaItem2);
					break;
				}
				case 3: {
					double somaItem3 = carne * quantiadade;
					System.out.println("Valor total do Item 3" + somaItem3);
					break;
				}
				case 4: {
					double somaItem4 = batata * quantiadade;
					System.out.println("Valor total do Item 4" + somaItem4);
					break;
				}
				case 5: {
					double somaItem5 = cerveja * quantiadade;
					System.out.println("Valor total do Item 5" + somaItem5);
					break;
				}
				case 6: {
					double somaItem6 = ovos * quantiadade;
					System.out.println("Valor total do Item 6" + somaItem6);
					break;
				}
				case 7: {
					double somaItem7 = acucar * quantiadade;
					System.out.println("Valor total do Item 7" + somaItem7);
					break;
				}
				case 8: {
					double somaItem8 = sal * quantiadade;
					System.out.println("Valor total do Item 8" + somaItem8);
					break;
				}
				
			}
			
			System.out.print("H� mais itens a serem processados ?, (Digite (S) para sim e (N) para n�o: ");
			operador = sc.next().charAt(0);
			System.out.println();
			
		}
		
		while(operador == 'S') {
			
			operador = 'N';
			System.out.print(" Digite (1) para (P�o)" + "\n" + " Digite (2) para (Leite)" + "\n" + " Digite (3) para (Carne)" + "\n" + " Digite (4) para (Batata)" + "\n" + " Digite (5) para (Cerveja)" + "\n" + " Digite (6) para (ovos)" + "\n" + " Digite (7) para (A�ucar)" + "\n" + " Digite (8) para (Sal) ");
			System.out.println();
			System.out.println();
			item = sc.nextInt();
			
			if(item < 1 || item > 8) {
				
				System.out.println();
				System.out.println("Op��o inv�lida");
				System.out.println();
				System.out.print(" Digite (1) para (P�o)" + "\n" + " Digite (2) para (Leite)" + "\n" + " Digite (3) para (Carne)" + "\n" + " Digite (4) para (Batata)" + "\n" + " Digite (5) para (Cerveja)" + "\n" + " Digite (6) para (ovos)" + "\n" + " Digite (7) para (A�ucar)" + "\n" + " Digite (8) para (Sal) ");
				System.out.println();
				System.out.println();
				item = 0;
				item = sc.nextInt();
				
			}
			
		}
		
		do {
			
			if(item < 1 || item > 8) {
				
				System.out.println();
				System.out.println("Op��o inv�lida");
				System.out.println();
				System.out.print(" Digite (1) para (P�o)" + "\n" + " Digite (2) para (Leite)" + "\n" + " Digite (3) para (Carne)" + "\n" + " Digite (4) para (Batata)" + "\n" + " Digite (5) para (Cerveja)" + "\n" + " Digite (6) para (ovos)" + "\n" + " Digite (7) para (A�ucar)" + "\n" + " Digite (8) para (Sal) ");
				System.out.println();
				System.out.println();
				item = 0;
				item = sc.nextInt();
				
			}else {
				aux = item;
			}			
			
		}while(item < 1 || item > 8);
		
if(aux >= 1 || aux <= 8) {
			
			System.out.println();
			System.out.print("Informe a quantidade desse item: ");
			quantiadade = sc.nextInt();
			System.out.println();
			
			switch (aux) {
			
				case 1: {
					double somaItem1 = pao * quantiadade;
					System.out.println("Valor total do Item 1" + somaItem1);
					break;
				}
				case 2: {
					double somaItem2 = leite * quantiadade;
					System.out.println("Valor total do Item 2" + somaItem2);
					break;
				}
				case 3: {
					double somaItem3 = carne * quantiadade;
					System.out.println("Valor total do Item 3" + somaItem3);
					break;
				}
				case 4: {
					double somaItem4 = batata * quantiadade;
					System.out.println("Valor total do Item 4" + somaItem4);
					break;
				}
				case 5: {
					double somaItem5 = cerveja * quantiadade;
					System.out.println("Valor total do Item 5" + somaItem5);
					break;
				}
				case 6: {
					double somaItem6 = ovos * quantiadade;
					System.out.println("Valor total do Item 6" + somaItem6);
					break;
				}
				case 7: {
					double somaItem7 = acucar * quantiadade;
					System.out.println("Valor total do Item 7" + somaItem7);
					break;
				}
				case 8: {
					double somaItem8 = sal * quantiadade;
					System.out.println("Valor total do Item 8" + somaItem8);
					break;
				}
				
			}
			
			System.out.print("H� mais itens a serem processados ?, (Digite (S) para sim e (N) para n�o: ");
			operador = sc.next().charAt(0);
			System.out.println();
			
		}
		
		sc.close();

	}

}
