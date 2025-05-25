package Abstraccion;

public class Gerente extends Empleado {

	public Gerente(String nombre, double salariobase) {
		super(nombre, salariobase);
	}

	public double calcularSalario() {
		return salariobase + 1000;
	}

}
