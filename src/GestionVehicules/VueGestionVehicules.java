package GestionVehicules;

public class VueGestionVehicules {
	private final static int  thisYear = 2021;

	public static void main(String[] args) {
//Instanciation des classes filles en 2 tableaux d'objets
		Voiture[] car = new Voiture[5];
		Avion[] aircraft = new Avion[5];

//Remplissage des tableaux
		car[0]  = new Voiture("Renault",2020,15000,1.5,5,7,50000);
		car[1]  = new Voiture("Fiat",2021,25000,1,3,4 ,20000);
		car[2]  = new Voiture("Ferrari",2015,95000,4,2,25,70000);
		car[3]  = new Voiture("Porshe",2017,65000,3,2,20,60000);
		car[4]  = new Voiture("BMW",2019,65000,2.5,4,10,45000);
		
		
		
		aircraft[0]  = new Avion("Boeing",2015,50000000,"reaction",20000);
		aircraft[1]  = new Avion("Airbus",2016,45000000,"reaction",10000);
		aircraft[2]  = new Avion("Cessna",2019,300000,"helices",1500);
		aircraft[3]  = new Avion("Antonov",2015,40000000,"reaction",25000);
		aircraft[4]  = new Avion("Beechcraft",2018,250000,"helices",2000);
		
//Parcours des tableaux pour afficher, d'abord, le prix courant 
//et ensuite les caractéristiques des objets  
		
System.out.println("///////////////////// START OF VIEW ////////////////////////");
		for (int i = 0; i < car.length; i++) {
			car[i].calculePrix(VueGestionVehicules.thisYear);
			car[i].affiche();
			
		}
		
		for (int i = 0; i < aircraft.length; i++) {
			aircraft[i].calculePrix(i);
			aircraft[i].affiche();
		
		}
		
		
		
		System.out.println("///////////////////// END OF VIEW ////////////////////////");
		System.out.println("///////////////////// END OF PROGRAM ☺ ////////////////////////");

	}

}
