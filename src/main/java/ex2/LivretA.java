package ex2;

public class LivretA extends CompteBancaire {

	private double tauxRemuneration;

	public LivretA(double solde, double tauxRemuneration) {
		super(solde, 0);
		this.tauxRemuneration = tauxRemuneration;
	}

	/** 
	 * @Override
	 *  
	 * Débite un montant au solde
	 * 
	 * @param montant
	 */
	public void debiterMontant(double montant){

		if (getSolde() - montant > 0){
			setSolde(getSolde() - montant);
		} 
	}

	public void appliquerRemuAnnuelle(){

		setSolde(getSolde() + getSolde() * tauxRemuneration/100);
	}

	/** Getter for tauxRemuneration
	 * @return the tauxRemuneration
	 */
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}

	/** Setter
	 * @param tauxRemuneration the tauxRemuneration to set
	 */
	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}
}
