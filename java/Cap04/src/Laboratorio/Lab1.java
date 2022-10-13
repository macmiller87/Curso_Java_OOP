package Laboratorio;

import java.util.Scanner;

public class Lab1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		int count = 0;
		
		for(int i = 1; i <= numero; i++) {
			
			if(numero % i == 0) {
				count++;	
			}
		}
		
		if(count == 2) {
			System.out.println(numero + " é um número primo");
			
		}else {
			System.out.println(numero + " não é um número primo");
		}
		
		sc.close();

	}

}
