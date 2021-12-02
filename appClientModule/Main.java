import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("0.Un Chat ");
		System.out.println("1.Une Personne ");
		System.out.printf("Tapez 0 ou 1 : ");
        int choix = scanner.nextInt();
        System.out.println("");
        while (choix < 0 || choix > 1 ) {
        	if (choix < 0) {
        		System.out.println("0.Un Chat ");
        		System.out.println("1.Une Personne ");
        		System.out.printf("Votre réponse doit etre supérieur ou egal a 0 : ");
                choix = scanner.nextInt();
                System.out.println("");
        	}else {
        		System.out.println("0.Un Chat ");
        		System.out.println("1.Une Personne ");
        		System.out.printf("Votre réponse doit inferieur ou egal a 1 : ");
                choix = scanner.nextInt();
                System.out.println("");
        	}
        }
  
		if (choix == 0) {
			Scanner scanner0 = new Scanner(System.in);
			System.out.printf("Entrez sont prenom : ");
	        String prenom = scanner0.nextLine();
	        System.out.printf("Entrez sont nom : ");
	        String nom = scanner0.nextLine();
	        System.out.printf("Entrez la race du chat : ");
	        String race = scanner0.nextLine();
	        System.out.printf("Entrez sont poids : ");
	        double poids = scanner0.nextDouble();
	        System.out.printf("Entrez sa taille : ");
	        double taille = scanner0.nextDouble();
	        System.out.println("");
	        System.out.printf("Récapitulatif : ");
	        scanner0.close();
			Cat chat = new Cat(prenom, nom, race, 0, poids, taille);
			chat.getAll();
			System.out.println(chat.getClass());
		}
		else if (choix == 1) {
			Scanner scanner1 = new Scanner(System.in);
			System.out.printf("Entrez sont prenom : ");
	        String prenom = scanner1.nextLine();
	        System.out.printf("Entrez sont nom : ");
	        String nom = scanner1.nextLine();
	        System.out.printf("Entrez sont email : ");
	        String email = scanner1.nextLine();
	        System.out.printf("Entrez sont adresse postale : ");
	        String adresse = scanner1.nextLine();
	        System.out.printf("Entrez sont poids : ");
	        double poids = scanner1.nextDouble();
	        System.out.printf("Entrez sa taille : ");
	        double taille = scanner1.nextDouble();
	        System.out.println("");
	        System.out.println("Récapitulatif : ");
	        scanner1.close();
			Person personne = new Person(prenom, nom, email,adresse, 0, poids, taille);
			personne.getAll();
			personne.getClass();
			System.out.println(personne.getEspece());
		}
	}


	/* (non-Java-doc)
	 * @see java.lang.Object#Object()
	 */
	public Main() {
		super();
	}

}