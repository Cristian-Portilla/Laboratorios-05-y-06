package Abstraccion;

public class PaginaWeb extends Publicacion {
	private String url,contenidoExtraido;
	public PaginaWeb(String dOI, String titulo, DTFecha fecha,String url, String contenidoExtraido) {
		super(dOI, titulo, fecha);
		this.url = url;
		this.contenidoExtraido = contenidoExtraido;
	}

	@Override
	public boolean contienePalabra(String palabra) { 
		return contenidoExtraido.contains(palabra);
	}

}
