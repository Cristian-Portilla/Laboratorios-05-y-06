package Abstraccion;

public class MotoHibrida extends Vehiculo {

	public MotoHibrida(String marca, String modelo, int anio) {
		super(marca, modelo, anio);
	}

	@Override
	void mover() {
		System.out.println("Alternando entre motor y bateria...");
	}
	
	public void mostrarInfo() {
		super.mostrarInfo();
	}

}
