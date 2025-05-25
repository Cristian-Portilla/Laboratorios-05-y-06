package Abstraccion;

public class Ortopedista extends Medico {
	Tipologia tipo;

	public Ortopedista() {
	}

	public Ortopedista(String nombre,Tipologia tipo) {
		super(nombre);
		this.tipo = tipo;
	}

	public Tipologia getTipo() {
		return tipo;
	}

	public void setTipo(Tipologia tipo) {
		this.tipo = tipo;
	}
	
	
}
