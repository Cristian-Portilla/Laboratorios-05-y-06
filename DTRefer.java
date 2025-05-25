package Abstraccion;

import java.util.Set;

public class DTRefer {
	String DOI,titulo;
	DTFecha fecha;
	Set<String> autores;
	public DTRefer(String dOI, String titulo, DTFecha fecha, Set<String> autores) {
		super();
		DOI = dOI;
		this.titulo = titulo;
		this.fecha = fecha;
		this.autores = autores;
	}
	
}
