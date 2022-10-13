package carro;

public class Carro {
	
	public String modelo;
	public double potenciaDoMotor;
	public String cor; 
	
	void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	void setPotenciaDoMotor(double potenciaDoMotor) {
		this.potenciaDoMotor = potenciaDoMotor;
	}
	
	void setCor(String cor) {
		this.cor = cor;
	}
	
	String exibirValores() {
		return("Cor: " + cor + "\n" + "Modelo: " + modelo + "\n" + "Potência: " + potenciaDoMotor);
	}

}
