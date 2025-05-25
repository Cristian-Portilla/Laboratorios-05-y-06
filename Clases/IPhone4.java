package Abstraccion;

public class IPhone4 extends IPhone {

	public IPhone4(String model) {
		super("IPhone4");
	}

	void showLegacyInfo() {
		System.out.println("Este es un modelo antiguo: iPhone4");
	}
}
