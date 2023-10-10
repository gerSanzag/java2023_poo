package geometria;

public class Triangulo extends Figura {
	
	private double base, altura;
	
	
	public Triangulo(String color, double base, double altura) {
		super(color);
		this.base = base;
		this.altura= altura;
	}

	@Override
	public double superficie() {
		
		return (base*altura)/(2);
	}

}
