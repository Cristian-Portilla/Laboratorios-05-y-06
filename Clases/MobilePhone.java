package Abstraccion;

public abstract class MobilePhone {
	String brand,model;

	public MobilePhone(String brand, String model) {
		super();
		this.brand = brand;
		this.model = model;
	}
	
	abstract void makecall(String number);
	
	void powerOn() {
		System.out.println("Encendiendo" + brand + " " + model);
	}
}
