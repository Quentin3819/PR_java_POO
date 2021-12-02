
public class Creature implements Espece{
	protected String firstName;
	protected String lastName;
	protected int birthDate;
	protected double height;
	protected double weight;
	
	@Override
	public String getEspece() {
		return "La creature est de l'espèce : " + this.getClass().getSimpleName();
	}
}