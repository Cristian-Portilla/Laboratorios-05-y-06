package Abstraccion;

public class Cilindro extends Circulo_2 {
	protected int valor2;
	public Cilindro(int valor1,int valor2) {
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
