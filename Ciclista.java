package Abstraccion;

public abstract class Ciclista {
	private int identificador;
	private String nombre;
	private int tiempoAcumulado = 0;
	public Ciclista(int identificador, String nombre, int tiempoAcumulado) {
		super();
		this.identificador = identificador;
		this.nombre = nombre;
		this.tiempoAcumulado = tiempoAcumulado;
	}
	protected int getIdentificador() {
		return identificador;
	}
	protected void setIdentificador(int identificador) {
		this.identificador = identificador;
	}
	protected String getNombre() {
		return nombre;
	}
	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}
	protected int getTiempoAcumulado() {
		return tiempoAcumulado;
	}
	protected void setTiempoAcumulado(int tiempoAcumulado) {
		this.tiempoAcumulado = tiempoAcumulado;
	}
	
	protected abstract String imprimirTipo();
	
	public void imprimir() {
		System.out.println("Identificador: " + identificador);
		System.out.println("Nombre: " + nombre);
		System.out.println("Tiempo acumulado: " + tiempoAcumulado);
	}
}

