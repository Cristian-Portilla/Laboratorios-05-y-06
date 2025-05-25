package Abstraccion;

public class AppFigura {

	public static void main(String[] args) {
		Circulo c1 = new Circulo();
		c1.setRadio(12.0);
		c1.imprimir();
		Rectangulo r1 = new Rectangulo();
		r1.setAncho(10);
		r1.setLargo(5.6);
		r1.imprimir();
	}

}
