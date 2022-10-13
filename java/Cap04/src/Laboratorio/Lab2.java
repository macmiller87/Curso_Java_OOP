package Laboratorio;

import java.util.Scanner;

public class Lab2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String mes = sc.next();
		
		switch(mes) {
		
		case "Janeiro":
			System.out.println("O mês escolhido tem 31 dias");
			break;
			

		case "Fevereiro":
			System.out.println("O mês escolhido tem 28 dias");
			break;
			

		case "Março":
			System.out.println("O mês escolhido tem 31 dias");
			break;
			

		case "Abril":
			System.out.println("O mês escolhido tem 30 dias");
			break;
			

		case "Maio":
			System.out.println("O mês escolhido tem 31 dias");
			break;
			

		case "Junho":
			System.out.println("O mês escolhido tem 30 dias");
			break;
			

		case "Julho":
			System.out.println("O mês escolhido tem 31 dias");
			break;
			

		case "Agosto":
			System.out.println("O mês escolhido tem 31 dias");
			break;
			

		case "Setembro":
			System.out.println("O mês escolhido tem 30 dias");
			break;
			

		case "Outubro":
			System.out.println("O mês escolhido tem 31 dias");
			break;
			

		case "Novembro":
			System.out.println("O mês escolhido tem 30 dias");
			break;
			

		case "Dezembro":
			System.out.println("O mês escolhido tem 31 dias");
			break;
			
			default:
				System.out.println("Erro mês escolhido não existe");
				break;
			
		}
		
		sc.close();
	}

}
