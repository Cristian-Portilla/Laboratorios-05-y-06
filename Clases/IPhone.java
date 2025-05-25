package Abstraccion;

public class IPhone extends Smartphone {

	public IPhone(String model) {
		super("Apple", model);
	}
	
	void useFaceID() {
		System.out.println("Usando FaceID en " + model); 
	}

	void makecall(String number) {
		System.out.print("Llamando a " + number + " desde un IPhone");
	}
	
}
