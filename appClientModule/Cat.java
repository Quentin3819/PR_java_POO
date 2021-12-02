
public class Cat extends Creature{
	protected String species;
	
	public Cat(String firstName, String lastName, String species, int birthDate, double height, double weight) {
		super(firstName, lastName, birthDate, height, weight);
		this.species = species;
	}
	
	public void getAll() {
		System.out.println("Prénom : " + this.firstName);
	    System.out.println("Nom : " + super.lastName);
	    System.out.println("Adresse : " + this.species);
	    System.out.println("Poids : " + super.weight);
	    System.out.println("Taille : " + super.height);
	    System.out.println("");
	   }
}
