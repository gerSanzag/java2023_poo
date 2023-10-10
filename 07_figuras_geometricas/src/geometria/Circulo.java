package geometria;

public class Circulo extends Figura {
	
	private double radio;
	
	public Circulo(String color, double radio) {
		super(color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double superficie() {
		
		return Math.PI*radio*radio;
		
	}
	
	//-------------------------------
	
	public int convertir (Number num) {
		
		return num.intValue();
		
	}
}


