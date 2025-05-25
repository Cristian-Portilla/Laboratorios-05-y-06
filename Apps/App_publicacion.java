package Abstraccion;

import java.util.HashSet;
import java.util.Set;

public class App_publicacion {
	public static void main(String[] args) {
		DTFecha fecha1 = new DTFecha(15, 5, 2023);
		DTFecha fecha2 = new DTFecha(10, 2, 2024);
		ArticuloRevista art1 = new ArticuloRevista(
				"10.1234/abc123",
                "Fundamentos de POO",
                fecha1,
                "Programacion Avanzada",
                "Introduccion a los principios fundamentales de la programacion orientada a objetos, explicando sus conceptos clave como clases, objetos, herencia y polimorfismo.");
		ArticuloRevista art2 = new ArticuloRevista(
				"10.4567/jkl012",
                "Utilidad de diagramas UML",
                fecha2,
                "Modelado de Software",
                "Ejercicio empirico de como los diagramas UML pueden ayudar en el proceso y documentacion de software, cubriendo los tipos mas importantes utilizados, como clases.");
		DTFecha fechaLibro1 = new DTFecha(20, 8, 2022);
		DTFecha fechaLibro2 = new DTFecha(20, 8, 2022);
		Set<String> PC1 = new HashSet<>();
		PC1.add("Diseno");
		PC1.add("OOP");
		PC1.add("Class");
		Set<String> PC2 = new HashSet<>();
		PC2.add("Diagramas");
		PC2.add("UML");
		PC2.add("Software");
		PC2.add("Modelado");
		Libro libro1 = new Libro(
		        "10.2345/def456",
		        "Patrones de Diseno en c++",
		        fechaLibro1,
		        "Software Design",
		        PC1);
		Libro libro2 = new Libro(
		        "10.5678/mno345",
		        "Guia de UML",
		        fechaLibro2,
		        "IEEE",
		        PC2);
		DTFecha fechaWeb = new DTFecha(20, 10, 2024);
		PaginaWeb pgw1 = new PaginaWeb(
				"10.3456/ghi789",
				"Diagramas para Principiantes",
				fechaWeb,
				"www.umlparaprincipiantes.com",
				"En esta pagina web se presenta una guia completa sobre los diagramas UML, abordando los diagramas de casos de uso, de clases, de secuencias y de actividades");
		Investigador inv1 = new Investigador(
				"0000-0003-1234-5678",
				"Carla Oliveri",
				"Universidad de la Republica");
		Investigador inv2 = new Investigador(
				"0000-0001-8765-4321",
				"Alberto Santos",
				"Instituto Tecnico");	
		Set<Publicacion> publicaciones = new HashSet<>();
        publicaciones.add(art1);
        publicaciones.add(art2);
        publicaciones.add(libro1);
        publicaciones.add(libro2);
        publicaciones.add(pgw1);
        inv1.agregarPublicacion(pgw1);
        inv1.agregarPublicacion(art1);
        inv2.agregarPublicacion(libro2);
        inv2.agregarPublicacion(art2);
        inv2.agregarPublicacion(libro1);
        Set<Investigador> investigadores = new HashSet<>();
        investigadores.add(inv1);
        investigadores.add(inv2);
        System.out.println("=== Investigadores ===");
        for (Investigador inv : investigadores) {
            System.out.println(inv);
        }
        DTFecha fechaBusqueda = new DTFecha(1, 1, 2022);
        String palabraClave = "clases";

        System.out.println("\n=== Publicaciones desde " + fechaBusqueda.dia + "/" +
                fechaBusqueda.mes + "/" + fechaBusqueda.anio +
                " que contienen la palabra \"" + palabraClave + "\" ===");

        for (Investigador inv : investigadores) {
            Set<String> pubs = inv.listarPublicaciones(fechaBusqueda, palabraClave);
            if (!pubs.isEmpty()) {
                System.out.println("- " + inv.getNombre() + ":");
                for (String titulo : pubs) {
                    System.out.println("  * " + titulo);
                }
            }
        } 
	}
}

