package Abstraccion;

public class Smartphone extends MobilePhone {

	public Smartphone(String brand, String model) {
		super(brand, model);
	}

	void makecall(String number) {
		System.out.println("Llamando a " + number + " desde Smartphone....");
	}
	
	void browseInternet(){
		System.out.println("Navengando en intenet desde: " + model);
	}

}
