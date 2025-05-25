package Abstraccion;

public class AppAbstraccion {

	public static void main(String[] args) {
		SubClase1 sb1 = new SubClase1();
		sb1.setNumero(80);
		System.out.println("Numero encapsulado en el sb1 mediante setNumero: " + sb1.getNumero());
		sb1.visualizacionCadena();
		sb1.visualizarOtraCadena();
		
		
		
	}

}
