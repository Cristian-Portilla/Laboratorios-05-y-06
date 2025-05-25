package Abstraccion;

public class Piramide extends Triangulo {
	protected int valor3;
	public Piramide(int valor1, int valor2,int valor3) {
		super(valor1, valor2);
		this.valor3 = valor3;
	}
	
	public int getValor3() {
		return valor3;
	}
	public void setValor3(int valor3) {
		this.valor3 = valor3;
	}
	
}
