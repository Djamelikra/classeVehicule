package GestionVehicules;

////Définissez une classe Avion , héritant de la classe Vehicule...→
public class Avion extends Vehicule {
//→et ayant les attributs supplémentaires suivants :
//private pour respecter l'encapsulation
	private String type;
	private double nbHeuresVol;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getNbHeuresVol() {
		return nbHeuresVol;
	}
	public void setNbHeuresVol(int nbHeuresVol) {
		this.nbHeuresVol = nbHeuresVol;
	}
	
	//Définissez un constructeur permettant l'initialisation explicite de l'ensemble des attributs
	
	public Avion(String marque, int dateAchat, double prixAchat, String type, int nbHeuresVol) {
		super(marque, dateAchat, prixAchat);
		this.type = type;
		this.nbHeuresVol = nbHeuresVol;
		}
	@Override
	public String toString() {
		return "Avion [type=" + type + ", nbHeuresVol=" + nbHeuresVol + "]";
	}
	
//Constructeurs et méthodes d'affichage devront utiliser les méthodes appropriées de la classe parente !
	public void affiche() {
		System.out.println(this.getMarque() +  " : c'est un avion à  " + this.type + " ");
		super.affiche();
		System.out.println( " heures de vol :"  + this.nbHeuresVol + " H.");
		}
	
//Redéfinissez cette méthode dans les deux sous-classes Voiture et Avion de sorte à calculer le prix courant
//en fonction de certains critères, et mettre à jour l'attribut correspondant au prix courant :

		public void calculePrix() {
			double argus = 0 ;
			if (type == "reaction") {
				argus = 0.1 * (nbHeuresVol / 1000) ;
			} else if (type == "helices") {
				argus = 0.1 * (nbHeuresVol / 100) ;
			}
			double prixArgus = (1.0 - argus) * getPrixAchat();
			setPrixCourant(this.round2Digits(this.maximum(0.0, prixArgus)));
			}
	
	
}
