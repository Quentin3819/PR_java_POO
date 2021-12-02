
public class Person extends Creature{
	protected String address;
	protected String email;
	
	protected Person( String firstName, String lastName, String address, String email, int birthDate, double height, double weight){
		super(firstName, lastName, birthDate, height, weight);
		this.address = address;
		this.email = email;
	}
	
	protected void getAll() {
		System.out.println("Prénom : " + super.firstName);
        System.out.println("Nom : " + super.lastName);
        System.out.println("Adresse : " + this.address);
        System.out.println("Email : " + this.email);
        System.out.println("Poids : " + super.weight);
        System.out.println("Taille : " + super.height);
        System.out.println("");
	   }
}
