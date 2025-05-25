package Abstraccion;

import java.util.Vector;

public class AppVehiculos {

	public static void main(String[] args) {
		Vector<Vehiculo> vehiculos = new Vector<>();
		AutoElectrico Ae = new AutoElectrico("KIA","Sedanes",2021);
		MotoHibrida Mh = new MotoHibrida("YAMAHA","F5 V5",2023);
		CamionDiesel Cd = new CamionDiesel("FORD","F-250",2020);
		vehiculos.add(Ae);
		vehiculos.add(Mh);
		vehiculos.add(Cd);
		for(Vehiculo i:vehiculos) {
			i.mover();
			i.mostrarInfo();
			System.out.println();
		}
	}

}
