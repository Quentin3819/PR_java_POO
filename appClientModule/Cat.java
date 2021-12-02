
public class Cat extends Creature{
	protected String species;
	
	public Cat(String firstName, String lastName, String species, int birthDate, double height, double weight) {
		this.firstName= firstName;
		this.lastName = lastName;
		this.species = species;
		this.birthDate = birthDate;
		this.height = height;
		this.weight = weight;
	}
	
	public void getAll() {
		System.out.println("Prénom : " + this.firstName);
	    System.out.println("Nom : " + this.lastName);
	    System.out.println("Adresse : " + this.species);
	    System.out.println("Poids : " + this.weight);
	    System.out.println("Taille : " + this.height);
	    System.out.println("");
	   }
}
