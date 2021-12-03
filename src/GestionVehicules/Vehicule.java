package GestionVehicules;

public class Vehicule {
//définissez une classe Vehicule qui a pour attributs des
//informations valables pour tout type de véhicule
//protected au lieu de private pour respecter l'encapsulation et pour éviter d'invoquer les getters/setters 
//Dans les classes filles
    protected String marque;
    protected int dateAchat;
    protected double prixAchat;
    protected double prixCourant;
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public int getDateAchat() {
		return dateAchat;
	}
	public void setDateAchat(int dateAchat) {
		this.dateAchat = dateAchat;
	}
	public double getPrixAchat() {
		return prixAchat;
	}
	public void setPrixAchat(double prixAchat) {
		this.prixAchat = prixAchat;
	}
	public double getPrixCourant() {
		return prixCourant;
	}
	public void setPrixCourant(double prixCourant) {
		this.prixCourant = prixCourant;
	}
	//Définissez un constructeur prenant en paramètre les trois attributs correspondant à la
	//marque, la date d'achat et le prix d'achat.
	public Vehicule(String marque, int dateAchat, double prixAchat) {
		super();
		this.marque = marque;
		this.dateAchat = dateAchat;
		this.prixAchat = prixAchat;
	}
	
	//Définissez une méthode publique void affiche() qui affiche l'état de l'instance, c'est-à-dire la
	//valeur de ses attributs
	
	protected void affiche() {
		System.out.print("marque : " + marque +
		", date d'achat : " + this.dateAchat +
		", prix d'achat : " + this.prixAchat +
		", prix courant : " + this.prixCourant);
		}
    
//Ajoutez une méthode void calculePrix(int anneActuelle) dans la classe Vehicule qui, à ce
//niveau, fixe le prix courant au prix d'achat moins 1% par année (entre la date d'achat 
//et la date actuelle).
	
	
	protected double maximum(double x, double y) {
		return (x > y ? x : y);
	}
	
	protected double round2Digits(double number) {
		return Math.round(number*100.00)/100.00;
	}
	
	
	public void calculePrix(int anneActuelle) {
		double argus = (anneActuelle - dateAchat) * 0.01;
		double prixArgus = (1.0 - argus) * prixAchat;
//Le prix doit rester positif (donc s'il est négatif, on le met à 0).
		prixCourant = this.round2Digits(this.maximum(0.0, prixArgus));
		}
	
}
