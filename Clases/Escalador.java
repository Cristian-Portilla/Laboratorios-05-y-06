package Abstraccion;

public class Escalador extends Ciclista {
	private double aceleracionPromedio,gradoRampa;
	public Escalador(int identificador, String nombre, int tiempoAcumulado,double aceleracionPromedio,
			double gradoRampa) {
		super(identificador, nombre, tiempoAcumulado);
		this.aceleracionPromedio = aceleracionPromedio;
		this.gradoRampa = gradoRampa;
	}

	protected double getAceleracionPromedio() {
		return aceleracionPromedio;
	}


	protected void setAceleracionPromedio(double aceleracionPromedio) {
		this.aceleracionPromedio = aceleracionPromedio;
	}


	protected double getGradoRampa() {
		return gradoRampa;
	}


	protected void setGradoRampa(double gradoRampa) {
		this.gradoRampa = gradoRampa;
	}


	protected String imprimirTipo() {
		return "Es un escalador";
	}
	
	public void imprimir() {
		super.imprimir();
		System.out.println("Aceleracion Promedio: " + aceleracionPromedio);
		System.out.println("Grado Rampa: " + gradoRampa);
	}

}
