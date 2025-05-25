package Abstraccion;

import java.util.HashSet;

public abstract class Publicacion {
	protected String DOI,titulo;
	protected DTFecha fecha;
	
	public Publicacion(String dOI, String titulo, DTFecha fecha) {
		super();
		DOI = dOI;
		this.titulo = titulo;
		this.fecha = fecha;
	}
	public DTRefer getDT() {
		return new DTRefer(DOI, titulo, fecha, new HashSet<>());
	}
	
	public abstract boolean contienePalabra(String palabra);
}
