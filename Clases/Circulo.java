package Abstraccion;

public class Circulo extends Figura {
	double radio;

	public Circulo() {
	}
	
	public Circulo(double radio) {
		this.radio = radio;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public double CalcularArea() {
		return Math.PI * radio * radio;
	}
	
	public void imprimir() {
		System.out.println("El area del circulo es: " + CalcularArea());
	}
	
}
