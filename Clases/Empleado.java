package Abstraccion;

public abstract class Empleado {
	String nombre;
	double salariobase;
	public Empleado(String nombre, double salariobase) {
		this.nombre = nombre;
		this.salariobase = salariobase;
	}
	
	public abstract double calcularSalario();
	
	void mostrarInfo() {
		System.out.println(nombre + " gana $ " + calcularSalario());
	}
	
}
