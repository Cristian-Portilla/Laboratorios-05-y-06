package Abstraccion;

public class Pediatra extends Medico {
	Tipologia2  tipologia;

	public Pediatra() {
	}

	public Pediatra(String nombre,Tipologia2 tipologia) {
		super(nombre);
		this.tipologia = tipologia;
	}

	public Tipologia2 getTipologia() {
		return tipologia;
	}

	public void setTipologia(Tipologia2 tipologia) {
		this.tipologia = tipologia;
	}
	
	
}
