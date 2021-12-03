package GestionVehicules;

//Définissez une classe Voiture , héritant de la classe Vehicule...→
public class Voiture extends Vehicule {
//→et ayant les attributs supplémentaires suivants :
//private pour respecter l'encapsulation
	private double cylindree;
	private int nbPortes;
	private double puissance;
	private double kilometrage;
	
	
	
	
	public double getCylindree() {
		return cylindree;
	}
	public void setCylindree(double cylindree) {
		this.cylindree = cylindree;
	}
	public int getNbPortes() {
		return nbPortes;
	}
	public void setNbPortes(int nbPortes) {
		this.nbPortes = nbPortes;
	}
	public double getPuissance() {
		return puissance;
	}
	public void setPuissance(double puissance) {
		this.puissance = puissance;
	}
	public double getKilometrage() {
		return kilometrage;
	}
	public void setKilometrage(double kilometrage) {
		this.kilometrage = kilometrage;
	}
	//Définissez un constructeur permettant l'initialisation explicite de l'ensemble des attributs
	
	public Voiture(String marque, int dateAchat, double prixAchat, double cylindree, int nbPortes, double cv,
			double km) {
		super(marque, dateAchat, prixAchat);
		this.cylindree = cylindree;
		this.nbPortes = nbPortes;
		this.puissance = cv;
		this.kilometrage = km;
	}
//méthode toString
	@Override
	public String toString() {
		return "Voiture [cylindree=" + cylindree + ", nbPortes=" + nbPortes + ", puissance=" + puissance
				+ ", kilometrage=" + kilometrage + "]";
	}
//Constructeurs et méthodes d'affichage devront utiliser les méthodes appropriées de la classe parente !
	public void affiche() {
		System.out.println("La  Voiture : ");
		super.affiche();
		System.out.println(this.cylindree + " litres, "
		+ this.nbPortes + " portes, "
		+ this.puissance + " CV, "
		+ this.kilometrage + " km.");
		}
	
//Redéfinissez cette méthode dans les deux sous-classes Voiture et Avion de sorte à calculer le prix courant
//en fonction de certains critères, et mettre à jour l'attribut correspondant au prix courant :

	public void calculePrix(int anneActuelle) {
		double argus = (anneActuelle - getDateAchat()) * .02;
		argus += 0.05 * (int)(kilometrage / 10000);
		if ((this.getMarque() == "Fiat") || (this.getMarque() == "Renault")) {
			argus += 0.1;
		} else if ((this.getMarque() == "Ferrari") || (this.getMarque() == "Porsche")) {
		argus -= 0.2;
		}
		double prixArgus = (1.0 - argus) * this.getPrixAchat();
		setPrixCourant(this.round2Digits(this.maximum(0.0, prixArgus)));
		}
	
	
	
}
