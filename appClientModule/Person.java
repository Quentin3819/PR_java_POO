
public class Person extends Creature{
	protected String address;
	protected String email;
	
	public Person( String firstName, String lastName, String address, String email, int birthDate, double height, double weight){
		this.firstName= firstName;
		this.lastName = lastName;
		this.address = address;
		this.email = email;
		this.birthDate = birthDate;
		this.height = height;
		this.weight = weight;
	}
	
	public void getAll() {
		System.out.println("Prénom : " + this.firstName);
        System.out.println("Nom : " + this.lastName);
        System.out.println("Adresse : " + this.address);
        System.out.println("Email : " + this.email);
        System.out.println("Poids : " + this.weight);
        System.out.println("Taille : " + this.height);
        System.out.println("");
	   }
}
