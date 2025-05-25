package Abstraccion;

public class Rectangulo extends Figura {
	double largo, ancho;
	
	public Rectangulo() {

	}
	
	public Rectangulo(double largo, double ancho) {
		this.ancho = ancho;
		this.largo = largo;
	}

	public double getLargo() {
		return largo;
	}

	public void setLargo(double largo) {
		this.largo = largo;
	}

	public double getAncho() {
		return ancho;
	}

	public void setAncho(double ancho) {
		this.ancho = ancho;
	}

	public double CalcularArea() {
		return largo * ancho;
	}
	
	public void imprimir() {
		System.out.println("El area del rectangulo es: " + CalcularArea());
	}

}
