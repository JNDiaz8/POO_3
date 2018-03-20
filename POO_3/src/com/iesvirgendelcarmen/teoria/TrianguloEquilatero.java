package com.iesvirgendelcarmen.teoria;

public class TrianguloEquilatero extends Triangulo {
	private float lado;

	public TrianguloEquilatero(float lado) {
		super(TipoTriangulo.EQUILATERO, lado, lado, lado);
		this.lado = lado;
	}

	public float getLado() {
		return lado;
	}
	public float calcularArea() {
		return (float) (lado * Math.sqrt(3) / 2.0);
	}

	@Override
	public String toString() {
		return super.toString() + "\n" + "TrianguloEquilatero lado =" + lado ;
	}
	
}
