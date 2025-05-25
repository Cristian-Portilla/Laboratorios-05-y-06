package Abstraccion;

public class Velocista extends Ciclista {
	private double potenciaPromedio,velocidadPromedio;
	
	public Velocista(int identificador, String nombre, int tiempoAcumulado,double potenciaPromedio
			,double velocidadPromedio) {
		super(identificador, nombre, tiempoAcumulado);
		this.potenciaPromedio = potenciaPromedio;
		this.velocidadPromedio = velocidadPromedio;
	}

	protected double getPotenciaPromedio() {
		return potenciaPromedio;
	}

	protected void setPotenciaPromedio(double potenciaPromedio) {
		this.potenciaPromedio = potenciaPromedio;
	}

	protected double getVelocidadPromedio() {
		return velocidadPromedio;
	}

	protected void setVelocidadPromedio(double velocidadPromedio) {
		this.velocidadPromedio = velocidadPromedio;
	}

	@Override
	protected String imprimirTipo() {
		return "Es un velocista";
	}
	
	public void imprimir() {
		super.imprimir();
		System.out.println("Potencia Promedio: " + potenciaPromedio);
		System.out.println("Velocidad Promedio: " + velocidadPromedio);
	}
}
