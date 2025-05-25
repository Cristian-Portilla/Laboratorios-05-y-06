package Abstraccion;

public class CamionDiesel extends Vehiculo {

	public CamionDiesel(String marca, String modelo, int anio) {
		super(marca, modelo, anio);
	}

	@Override
	void mover() {
		System.out.println("Funcionando con motor diesel.....");
	}
	
	public void mostrarInfo() {
		super.mostrarInfo();
	}

}
