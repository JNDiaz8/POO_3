package com.iesvirgendelcarmen.teoria;

public class TestTriangulo {

	public static void main(String[] args) {
		TrianguloEquilatero  triangulo1 = new TrianguloEquilatero(3);
		System.out.println(triangulo1.toString());
		System.out.printf("�rea: %.2f per�metro: %.2f%n",
				triangulo1.calcularArea(), triangulo1.calcularPerimetro());
		
		TrianguloRectangulo  triangulo2 = new TrianguloRectangulo(3, 3);
		System.out.println(triangulo2);
		System.out.printf("�rea: %.2f per�metro: %.2f%n",
				triangulo2.calcularArea(), triangulo2.calcularPerimetro());
	}

}
