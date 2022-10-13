
public class ExecucaoComandos {
	// definir um novo método static
	static void executarTarefa() {
		System.out.println("Executando uma tarefa.");
	}

	public static void main(String[] args) {
		System.out.println("Execuntado a primeira chamada println");
		System.out.println("Execuntado a segunda chamada println");
		System.out.println(".");
		System.out.println(".");
		System.out.println(".");
		
		executarTarefa();
		
		System.out.println("Proximo comando depois da chamada do m�todo");
	}

}
