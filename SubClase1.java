package Abstraccion;

public class SubClase1 extends Super {

	@Override
	public void setNumero(int numero) {
		this.numero = numero;

	}

	@Override
	public int getNumero() {
		return numero;
	}
	
	public void visualizarOtraCadena() {
		System.out.println("Cadena de subclase 1 en visualizacionOtraCadena");
	}

	
	
	
}
