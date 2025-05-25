package Abstraccion;

public class Rectangulo_2 extends FiguraGeometrica {
	protected int valor2;
	
	public Rectangulo_2(int valor1,int valor2) {
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
