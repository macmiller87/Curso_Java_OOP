package exemplo.estrutura.controle;

public class IfElseAninhado {

	public static void main(String[] args) {
		
		int hora = 12;
		
		if(hora < 12) {
			System.out.println("Bom dia! como vocês estão"); 
			
		}else if(hora < 18) {
			System.out.println("Boa tarde!");
			
		}else {
			System.out.println("Boa noite!");
		}
		

	}

}
