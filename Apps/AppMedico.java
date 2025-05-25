package Abstraccion;

import java.util.Vector;

public class AppMedico {

	public static void main(String[] args) {
		//Comparar diferentes objetos
		//generar un vector tipo Medicos
		Vector<Medico> listaMedicos = new Vector<>();
		Medico medico1 = new Medico();
		medico1.setNombre("Juan");
		listaMedicos.add(medico1);
		
		Ortopedista op1 = new Ortopedista();
		op1.setNombre("Pablo");
		op1.setTipo(Tipologia.MAXILOFACIAL);
		listaMedicos.add(op1);
		
		Pediatra p1 = new Pediatra();
		p1.setNombre("Maria");
		p1.setTipologia(Tipologia2.NEUROLOGO);
		listaMedicos.add(p1);
		
		//Proceso de comparacion entre estos objetos a ver si corresponden
		for(int i = 0; i<listaMedicos.size(); i++) {
			Medico a =(Medico) listaMedicos.elementAt(i);
			if(a instanceof Ortopedista) {
				System.out.println("El objeto en el indice " + i + " es Ortopedista");
				continue; //Sirve para continuar el programa si esuqe no se cumple la condicion	
			}
			if(a instanceof Pediatra) {
				System.out.println("El objeto en el indice " + i + " es Pediatra");
				continue;
		}
			if(a instanceof Medico) {
				System.out.println("El objeto en el indice " + i + " es Medico");
				continue;
	}

}
	}
}
