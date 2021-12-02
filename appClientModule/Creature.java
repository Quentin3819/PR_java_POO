
abstract class Creature implements Espece{
	protected String firstName;
	protected String lastName;
	protected int birthDate;
	protected double height;
	protected double weight;
	
	protected Creature(String firstName, String lastName, int birthDate, double height, double weight) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.height = height;
		this.weight = weight;
	}
	
	@Override
	public String getEspece() {
		return "La creature est de l'espèce : " + this.getClass().getSimpleName();
	}
}