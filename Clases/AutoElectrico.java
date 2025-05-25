package Abstraccion;

public class AutoElectrico extends Vehiculo {

	public AutoElectrico(String marca, String modelo, int anio) {
		super(marca, modelo, anio);
	}

	@Override
	void mover() {
		System.out.println("Moviendose en electrico....");
	}
	
	public void mostrarInfo() {
		super.mostrarInfo();
	}
	
}
