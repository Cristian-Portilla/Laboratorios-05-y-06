package Abstraccion;

public class ArticuloRevista extends Publicacion {
	private String revista,extracto;
	public ArticuloRevista(String dOI, String titulo, DTFecha fecha,String revista, String extracto) {
		super(dOI, titulo, fecha);
		this.revista = revista;
		this.extracto = extracto;
	}

	@Override
	public boolean contienePalabra(String palabra) {
		return extracto.contains(palabra);
	}

}
