package Abstraccion;

public abstract class Vehiculo {
	String marca,modelo;
	int anio;
	public Vehiculo(String marca, String modelo, int anio) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.anio = anio;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	
	void encender() {
		
	}
	
	void apagar() {
		
	}
	
	abstract void mover();
	
	public void mostrarInfo() {
		System.out.println("Marca: " + marca);
		System.out.println("Modelo: " + modelo);
		System.out.println("Año: " + anio);
	}
}
