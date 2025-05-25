package Abstraccion;

public class Ingeniero extends Empleado {

	public Ingeniero(String nombre, double salariobase) {
		super(nombre, salariobase);
	}

	public double calcularSalario() {
		return salariobase + 500;
	}

}
