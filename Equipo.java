package Abstraccion;

import java.util.Vector;

public class Equipo {
	private String nombre,pais;
	private static double totalTiempo;
	public Equipo(String nombre, String pais) {
		super();
		this.nombre = nombre;
		this.pais = pais;
	}
	Vector<Ciclista> ciclistas = new Vector<>();
	protected String getNombre() {
		return nombre;
	}
	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}
	protected String getPais() {
		return pais;
	}
	protected void setPais(String pais) {
		this.pais = pais;
	}
	
	protected void añadirciclista(Ciclista ciclista) {
		ciclistas.add(ciclista);
	}
	
	protected void listarEquipo() {
		for(Ciclista c: ciclistas) {
			System.out.println("- " + c.getNombre());
		}
	}
	
	protected void buscarciclista(int identificador) {
		boolean encontrado = false;
		for(Ciclista c: ciclistas) {
			if(identificador == c.getIdentificador()) {
				c.imprimir();
				System.out.println(c.imprimirTipo());
				encontrado = true;
			}	
		}
		if (encontrado != true) {
			System.out.println("No se ha encontrado a ningun ciclista");
		}
	}
	
	protected void CalcularTotalTiempo() {
		int suma = 0;
		for(Ciclista c : ciclistas) {
			suma += c.getTiempoAcumulado();
		}
		totalTiempo = suma;
	}
	
	public void imprimir() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Pais: " + pais);
		System.out.println("Tiempo Total: " + totalTiempo + " s");
	}
	
}
