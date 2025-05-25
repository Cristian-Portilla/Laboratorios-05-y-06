package Abstraccion;

import java.util.HashSet;
import java.util.Set;

public class Investigador {
	    private String ORCID;
	    private String nombre;
	    private String institucion;
	    private Set<Publicacion> publicaciones;

	    public Investigador(String ORCID, String nombre, String institucion) {
	        this.ORCID = ORCID;
	        this.nombre = nombre;
	        this.institucion = institucion;
	        this.publicaciones = new HashSet<>();
	    }
	    
	    

	    public String getORCID() {
			return ORCID;
		}



		public void setORCID(String oRCID) {
			ORCID = oRCID;
		}



		public String getNombre() {
			return nombre;
		}



		public void setNombre(String nombre) {
			this.nombre = nombre;
		}



		public String getInstitucion() {
			return institucion;
		}



		public void setInstitucion(String institucion) {
			this.institucion = institucion;
		}



		public Set<Publicacion> getPublicaciones() {
			return publicaciones;
		}



		public void setPublicaciones(Set<Publicacion> publicaciones) {
			this.publicaciones = publicaciones;
		}



		public void agregarPublicacion(Publicacion pub) {
	        publicaciones.add(pub);
	    }

	    public String toString() {
	        return nombre + " (" + ORCID + ") - " + institucion;
	    }

	    public Set<String> listarPublicaciones(DTFecha desde, String palabra) {
	        Set<String> resultados = new HashSet<>();
	        for (Publicacion pub : publicaciones) {
	            if (pub.contienePalabra(palabra) && compararFechas(pub.fecha, desde) >= 0) {
	                resultados.add(pub.titulo);
	            }
	        }
	        return resultados;
	    }

	    private int compararFechas(DTFecha f1, DTFecha f2) {
	        if (f1.anio != f2.anio) return Integer.compare(f1.anio, f2.anio);
	        if (f1.mes != f2.mes) return Integer.compare(f1.mes, f2.mes);
	        return Integer.compare(f1.dia, f2.dia);
	    }

	}

