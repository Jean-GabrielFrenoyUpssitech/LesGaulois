package personnages;

public class Gaulois {
	private String nom;
	private int force;

	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	private String getNom() {
		return nom;
	}

	public int getForce(int force) {
		return force;
	}
	public String parler(String text) {
		return "Les gaulois " + nom + ": << Bonjour à tous >>"; 
	}
	public  static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix", 8);
		System.out.println(asterix.parler(asterix.getNom()));
	}
}
