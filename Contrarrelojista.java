package Abstraccion;

public class Contrarrelojista extends Ciclista {
	private double velocidadMaxima;
	public Contrarrelojista(int identificador, String nombre, int tiempoAcumulado, double velocidadMaxima) {
		super(identificador, nombre, tiempoAcumulado);
		this.velocidadMaxima = velocidadMaxima;
	}
	

	protected double getVelocidadMaxima() {
		return velocidadMaxima;
	}


	protected void setVelocidadMaxima(double velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}


	@Override
	protected String imprimirTipo() {
		return "Es un contrarrelojista";
	}
	
	public void imprimir() {
		super.imprimir();
		System.out.println("Velocidad Máxima: " + velocidadMaxima);
	}
}
