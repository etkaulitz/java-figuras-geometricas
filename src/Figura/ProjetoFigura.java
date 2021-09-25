package Figura;

public class ProjetoFigura {

	public static void main(String[] args) {
		
		Quadrado quadrado = new Quadrado();	
		quadrado.draw();
		
		Circulo circulo = new Circulo();	
		circulo.draw();
		
		Triangulo triangulo = new Triangulo();	
		triangulo.draw();
		
		passaParamentroPorHeranca(quadrado);
	}

	public static void passaParamentroPorHeranca(Figura figura) {
		figura.drawShape();
	}
	
}
