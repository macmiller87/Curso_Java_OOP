package exemplo.inicial.estatico;

public class ChamarMetodosEstaticos {
	
	static void novoEstatico() {
		System.out.println("Este conteudo este declarado no método dentro da classe principal");
	}

	public static void main(String[] args) {
	
		DeclarandoAlgunsEstaticos.metodoEstatico();
		
		new DeclarandoAlgunsEstaticos().metodoNaoEstatico(); 
		
		novoEstatico();

	}

}
