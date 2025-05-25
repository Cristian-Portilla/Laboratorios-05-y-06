package Abstraccion;

public abstract class Animal_2 {
	protected String sonido,alimentos,habitat,nombreCientifico;

	public Animal_2(String sonido, String alimentos, String habitat, String nombreCientifico) {
		super();
		this.sonido = sonido;
		this.alimentos = alimentos;
		this.habitat = habitat;
		this.nombreCientifico = nombreCientifico;
	}
	
	public abstract String getNombreCientifico();
	public abstract String getSonido();
	public abstract String getAlimentos();
	public abstract String getHabitat();
	
}
