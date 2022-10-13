package exemplo.poo.abstrato;

public class Triangulo extends Poligono {
	
	private double base;
	private double altura;
	
	public Triangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	public double CalcularArea() {
		
		double resultado = (base * altura) / 2;
		System.out.println("Area do triangulo: " + resultado);
		
		return resultado;
		
	}

}
