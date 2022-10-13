package exemplo.poo.abstrato;

public class Quadrado extends Poligono {
	
	private double lado;
	
	public Quadrado(double lado) {
		this.lado = lado;
	}
	
	public double CalcularArea() {
		
		double resultado = lado * lado;
		System.out.println("Area do quadrado: " + resultado);
		
		return resultado;
		
	}
	

}
