package Abstraccion;

public class Leon extends Felino {

	public Leon(String sonido, String alimentos, String habitat, String nombreCientifico) {
		super(sonido, alimentos, habitat, nombreCientifico);
	}
	
	public String getNombreCientifico() {
		return "Phantera leo";
	}

	@Override
	public String getSonido() {
		return "Rugido";
	}

	@Override
	public String getAlimentos() {
		return "Carnivoro";
	}

	@Override
	public String getHabitat() {
		return "Praderas";
	}

}
