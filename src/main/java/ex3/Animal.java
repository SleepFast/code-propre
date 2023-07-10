package ex3;

public class Animal {
	private final String nom;
	private final String type;
	private final String comportement;

	public Animal(final String nom, final String type, final String comportement) {
		this.nom = nom;
		this.type = type;
		this.comportement = comportement;
	}

	public String toString() {
		return String.format("%s (%s): %s", nom, type, comportement);
	}
}