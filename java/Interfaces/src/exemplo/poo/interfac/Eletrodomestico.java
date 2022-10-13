package exemplo.poo.interfac;

public interface Eletrodomestico {
	
	void ligar();
	void desligar();
	
	default void acionarTimer(int minutos) {
		
		try {
			Thread.sleep(minutos * 1000);
			
		}catch (Exception e) {
			
		}
		
		desligar();
		
	}
	
	/* static void ligarTudo(Eletrodomestico ... eletroArray) {
		
		for(Eletrodomestico eletro: eletroArray) {
			eletro.ligar();
		}
		
	} */

}
