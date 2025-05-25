package Abstraccion;


public class AppAnimal_2 {

	public static void main(String[] args) {
		Animal_2[] animales = new Animal_2[4];
		animales[0] = new Gato("Maulla","Ratones","Dómestico","Felis silvestrus catus");
		animales[1] = new Perro_2("Ladrido","Carnivoro","Dómestico","Canis lupus familiaris");
		animales[2] = new Lobo("Aullido","Carnivoro","Bosque","Canis lupus");
		animales[3] = new Leon("Rugido","Carnivoro","Praderas","Phantera leo");
		
		for(int i = 0; i < animales.length; i++) {
			System.out.println("Nombre Cientifico: " + animales[i].getNombreCientifico());
			System.out.println("Sonido: " + animales[i].getSonido());
			System.out.println("Alimentos: " + animales[i].getAlimentos());
			System.out.println("Habitat: " + animales[i].getHabitat());
			System.out.println();
		}
		
	}

}
