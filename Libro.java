package Abstraccion;

import java.util.Set;

public class Libro extends Publicacion {
	private String editorial;
	private Set<String> palabrasdestacadas;
	public Libro(String dOI, String titulo, DTFecha fecha,String editorial, Set<String> palabrasdestacadas) {
		super(dOI, titulo, fecha);
		this.editorial = editorial;
		this.palabrasdestacadas = palabrasdestacadas;
	}

	@Override
	public boolean contienePalabra(String palabra) {
		return palabrasdestacadas.contains(palabra);
	}

}
