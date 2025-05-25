package Abstraccion;

public class Triangulo extends FiguraGeometrica {
	protected int valor2;
	public Triangulo(int valor1,int valor2) {
		super(valor1);
		this.valor2 = valor2;
	}
	public int getValor2() {
		return valor2;
	}
	public void setValor2(int valor2) {
		this.valor2 = valor2;
	}
	

}
