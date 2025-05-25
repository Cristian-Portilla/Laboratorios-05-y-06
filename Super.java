package Abstraccion;

public abstract class Super {
	//atributos
	protected int numero;
	
	//metodos abstractos  -->   solo se declaran 
	public abstract void setNumero(int numero);
	public abstract int getNumero();
	
	//metodo concreto
	public void visualizacionCadena() {
		System.out.println("Cadena desde la clase super");
	}
	
	
	
}
