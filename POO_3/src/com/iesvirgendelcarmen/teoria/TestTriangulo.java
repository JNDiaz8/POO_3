package com.iesvirgendelcarmen.teoria;

public class TestTriangulo {

	public static void main(String[] args) {
		TrianguloEquilatero triangulo1 = new TrianguloEquilatero(3);
		System.out.println(triangulo1.toString());
		System.out.printf("Area. %.2f%n" + "Perimetro. %.2f%n" , triangulo1.calcularArea(), triangulo1.calcularPerimetro());

	}

}
