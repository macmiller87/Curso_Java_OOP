package Laboratorio;

public class Lab3 {

	public static void main(String[] args) {
		
		int ano = 2022;
		
		for(int i = 1930; i <= ano; i+= 4) {
			
			if(i == 1942 ||i == 1946) {
				continue;
			}
			
			System.out.println("Copa do mundo de " + i + "!");
		}
	}

}
