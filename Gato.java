package Abstraccion;

public class Gato extends Felino {

	public Gato(String sonido, String alimentos, String habitat, String nombreCientifico) {
		super(sonido, alimentos, habitat, nombreCientifico);
	}
	
	public String getNombreCientifico() {
		return "Felis silvestrus catus";
	}

	@Override
	public String getSonido() {
		return "Maullido";
	}

	@Override
	public String getAlimentos() {
		return "Ratones";
	}

	@Override
	public String getHabitat() {
		return "Dómestico";
	}
	
}
