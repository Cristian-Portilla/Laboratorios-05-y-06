package Abstraccion;

public class AppEmpleado {

	public static void main(String[] args) {
		Ingeniero ing1 = new Ingeniero("Cristian", 1000);
		ing1.mostrarInfo();
		Gerente g1 = new Gerente("Juan",2000);
		g1.mostrarInfo();
	}

}
