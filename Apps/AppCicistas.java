package Abstraccion;

public class AppCicistas {

	public static void main(String[] args) {
		Equipo E1 = new Equipo("Pitufines","Ecuador");
		Velocista v = new Velocista(1, "Mark Cavendish", 450, 68.2, 110);
        Escalador e = new Escalador(2, "Nairo Quintana", 140,5.3,15.3);
        Contrarrelojista c = new Contrarrelojista(3, "Tom Dumoulin", 110,60.0);
        E1.añadirciclista(v);
        E1.añadirciclista(e);
        E1.añadirciclista(c);
        E1.listarEquipo();
        System.out.println();
        E1.buscarciclista(1);
        System.out.println();
        E1.buscarciclista(4);
        System.out.println();
        E1.CalcularTotalTiempo(); 
        E1.imprimir();
	}

}
