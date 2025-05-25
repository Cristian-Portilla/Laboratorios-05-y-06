package Abstraccion;

public class Lobo extends Canino {
	
	public Lobo(String sonido, String alimentos, String habitat, String nombreCientifico) {
		super(sonido, alimentos, habitat, nombreCientifico);
	}

	public String getNombreCientifico() {
		return "Canis lupus";
	}

	@Override
	public String getSonido() {
		return "Aullido";
	}

	@Override
	public String getAlimentos() {
		return "Carnivoro";
	}

	@Override
	public String getHabitat() {
		return "Bosque";
	}
}
