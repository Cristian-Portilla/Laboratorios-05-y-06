package Abstraccion;

public class Perro_2 extends Canino {

	public Perro_2(String sonido, String alimentos, String habitat, String nombreCientifico) {
		super(sonido, alimentos, habitat, nombreCientifico);
	}
	
	public String getSonido() {
		return "Ladrido";
	}
	
	public String getNombreCientifico() {
		return "Canis lupus familiaris";
	}

	@Override
	public String getAlimentos() {
		return "Carnivoro";
	}

	@Override
	public String getHabitat() {
		return "Doméstico";
	}
}
