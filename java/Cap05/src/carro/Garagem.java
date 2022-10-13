package carro;

public class Garagem {
	
	public String carroPasseio;
	public String carroUtilitario;

	void setCarroPasseio(String carroPasseio) {
		this.carroPasseio = carroPasseio;
	}
	
	void setCarroUtilitario(String carroUtilitario) {
		this.carroUtilitario = carroUtilitario;
	}
	
	String exibirValoresCarroPasseio() {
		return("Carro de Passeio:");
	}
	
	String exibirValoresCarroUtilitario() {
		return("Carro Utilitário:");
	}
	
}

