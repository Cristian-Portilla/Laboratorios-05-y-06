package Abstraccion;

public abstract class Felino extends Animal_2 {

	public Felino(String sonido, String alimentos, String habitat, String nombreCientifico) {
		super(sonido, alimentos, habitat, nombreCientifico);
		// TODO Auto-generated constructor stub
	}

	@Override
	public abstract String getNombreCientifico();

	@Override
	public abstract String getSonido();

	@Override
	public abstract String getAlimentos();

	@Override
	public abstract String getHabitat();

}
