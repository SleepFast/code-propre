package ex3;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

	private String nom;

	private final List<Animal> animaux = new ArrayList<Animal>();
	
	public Zoo(String nom){
		this.nom = nom;
	}
	
	/**
	 * Ajoute un nouvel animal au zoo
	 * 
	 * @param animal
	 */
	public void addAnimal(Animal animal){
		animaux.add(animal);
	}
	
	/**
	 * @return le nombre d'animaux dans le zoo
	 */
	public int getAnimalCount() {
		return animaux.size();
	}

	/**
	 * @return le nom du zoo suivi de la liste des animaux
	 */
	public String toString() {
		String animalList = "";

		for (int i = 0, l = animaux.size(); i < l; i++) {
			animalList += String.format("\n- %s", animaux.get(i));
		}

		return String.format("Zoo %s:%s", nom, animalList);
	}

	/** Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return nom du zoo
	 */
	public String getNom() {
		return nom;
	}
}
