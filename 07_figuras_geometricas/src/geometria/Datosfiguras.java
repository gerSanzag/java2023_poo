package geometria;

public class Datosfiguras {

	public static void main(String[] args) {
			
		Triangulo miTriangulo = new Triangulo("amarillo",2,5);
		System.out.println(miTriangulo.getColor());
		System.out.println(miTriangulo.superficie());
		
		Circulo miCirculo = new Circulo("Rojo",5);
		System.out.println(miCirculo.getColor());
		System.out.println(miCirculo.superficie());
		System.out.println(miCirculo.getClass().getClasses());
		
	}

}
