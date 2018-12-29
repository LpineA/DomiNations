package com.sdz.test;
import java.util.*;

public class Personn {
	String pseudo;
		int nbreRois;
		ArrayList<Integer> ordreTour= new ArrayList<Integer>();///  on rajoute ce caracteristique car il nous permet de savoir quelle joueur pose en premier
		Hashtable<Integer, String[]> Terrain = new Hashtable< Integer, String[] >();
	
		//diplayTerrain[n][1] : retourne le type de terrain sur la case n 
		//displayTerrain[n][2] : retourne le nombre de rois de la case n 
		
		//  pour le moment juste un tableau vide  et on initalize la carte du centre a center
		
		int totalnbrePlayers; 
		public ArrayList <Card> piocheJoueur  = new ArrayList <Card>();
		protected static ArrayList<Personn> nosJoueur= Presentation.nosJoueur;
	
		Scanner scan = new Scanner(System.in);



	public void reSetOrdreTour() {
		this.ordreTour.removeAll(ordreTour);
	}

	public ArrayList<Card> getPiocheJoueur() {
		return piocheJoueur;
	}

	public ArrayList<Integer> getOrdreTour() {
		return ordreTour;
	}

	public void setOrdreTour(int ordreTour) {
		this.ordreTour.add(ordreTour);
	}

	public void setPiocheJoueur(ArrayList<Card> piocheJoueur) {
		this.piocheJoueur = piocheJoueur;
	}

	public void setPseudo (String Pseudo) {
		pseudo = Pseudo;
	}
	
	

	public void settotalNumberPlayers (int totalNumberPlayer) {
		totalnbrePlayers = totalNumberPlayer;
	}
	
	public String getPseudo() {
		return pseudo;
	}
	
	
	public int gettotalnbrePlayer () {
		return totalnbrePlayers;
	}
	
	public void ajouterCarte (Card tirage) {
		this.piocheJoueur.add(tirage);
	}
	
	public void getCard () {
		System.out.println(piocheJoueur.get(0).getNumCards());
	}
	
	public static Personn findPlayerByPseudo(String pseudo) {
		
		Personn h = null;
		for (int i = 0; i < nosJoueur.size(); i++) {
			if (nosJoueur.get(i).getPseudo() == pseudo) {
				h = (nosJoueur.get(i));
			}
			
		}
		
		return h;
		
	}
	
	public static Personn findPlayerByOrder(String pseudo) {
		
		Personn h = null;
		for (int i = 0; i < nosJoueur.size(); i++) {
			if (nosJoueur.get(i).getPseudo() == pseudo) {
				h = (nosJoueur.get(i));
			}
			
		}
		
		return h;
		
	}

	
	
	
	// Partie de Aymeric     
	
	
	
	
	
	
	
	
	
	
	
		public void getTerrain() {
		
		int caseVideRestante = 0;
		
		System.out.println("Les dominos que vous avez déjà placé sont : ");
		
		for (int i =0 ; i < 81 ; i++) {
			for (int j = 0 ; j<2 ; j++) {
				if (Terrain.get(i) == null) {
					caseVideRestante++;
				}
				
				else {
					System.out.println(" - Sur le numéro " + i + " et celle-ci comporte est de type :" + Terrain.get(i) +" ; et celle-ci comporte " + Terrain.get(i) + " rois ! ");
				}
			}
				
		}
		System.out.println("Il vous reste " + caseVideRestante + " cases vides que vous pouvez encore complétées.");
		}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		public void setTerrain(int index1, int index2, String nomTer1, String nomTer2, String nbreRois1, String nbreRois2 ) {
			
			String Carte1[] = {nomTer1, nbreRois1};
			String Carte2[] = {nomTer2, nbreRois2};
			
			Terrain.put(index1, Carte1);
			Terrain.put(index2, Carte2);
		}

	
	
	
		
		
		
		
		
		
		
		
		
		
		public void setPositionofDominos(Card Card) {
			
			String typeDominoFace1;
			String typeDominoFace2;
			String nbOFKingDominoFace1;
			String nbOfKingDominoFace2;
			
			
	//-----------------------Initilisation des variables de la carte------------------------//
			
			
			typeDominoFace1 = Card.getNomTerrain1();
			typeDominoFace2 = Card.getNomTerrain2();
			nbOFKingDominoFace1 = String.valueOf(Card.getNumC1()); 
			nbOfKingDominoFace2 = String.valueOf(Card.getNumC2());
			
			
	//----------------------Fin de l'initialisaton des variables de la carte------------------//
			
			int caseFace1 = 0;
			int caseFace2 = 0;
			
			System.out.println("Sur quelle case voulez vous poser la première partie du domino ? ");
				
			
			try {
				caseFace1 = scan.nextInt();
			}
			
			catch (Exception e ) {
				System.out.println("Vous ne pouvez entrer seulement des nombres, veuillez réessayer ! ");
				setPositionofDominos(Card);
			}
			
			System.out.println("Sur quelle case voulez vous poser la seconde face du domino ? ");
			try {
				caseFace2 = scan.nextInt();
			}
			
			catch (Exception e ) {
				System.out.println("Vous ne pouvez entrer seulement des nombres, veuillez réessayer ! ");
				setPositionofDominos(Card);
			}
			
	//---------------------------------Vérification bon positionnement des dominos----------------------------------------//
			
			if (caseFace1 == caseFace2+1 ||caseFace1 == caseFace2-1 || caseFace1 == caseFace2 + 9 || caseFace1 == caseFace2-9) {
				System.out.println("Vous ne pouvez positionner des dominos uniquement en diagonal ou en vertical");
				setPositionofDominos(Card);
			}
			
			else if (caseFace1 <0 || caseFace1 > 81 || caseFace2 <0 || caseFace2 > 81) {
				System.out.println("Veuillez entrer une case entre 1 et 81 correspondant au emplacement sur le plateau de jeu ! ");
				setPositionofDominos(Card);
			}
			
			else if (Terrain.get(caseFace1) != null || Terrain.get(caseFace2) != null) {
				System.out.println("Veuillez entrer une case où vous n'avez pas déjà positionné un domino");
			}
			
	//-------------------------------------------------------Traitement--------------------------------------------------//
			else {				
				String Carte1[] = {typeDominoFace1, nbOFKingDominoFace1};
				String Carte2[]= {typeDominoFace2, nbOfKingDominoFace2};
				
				Terrain.put(caseFace1, Carte1);
				Terrain.put(caseFace2, Carte2);
				System.out.println("Le placement de votre carte a bien été enregistré !");
			}
	//-------------------------------------------------------Fin du traitement--------------------------------------------//
			
		}
		
		
		
		
		
		
	
		public void displayTerrain() {
			
			System.out.println("______________________________________________________________________________");
			
			System.out.println("|                                                                            |");
			for (int i = 0 ; i < 81 ; i++) {
	
				if (i % 9 == 0) {
					System.out.println("");
				}
				
				System.out.print("__");
				try {
					System.out.print(Terrain.get(i)[0]);
				}
				
				catch(NullPointerException e) {
					System.out.print("null");
				}
				
				System.out.print("__");
			
			}
			
			System.out.println("______________________________________________________________________________");
			
		}
		
		
		
		
		
		
		
		
		
		public void displayTerrainWithKings() {
			System.out.println("______________________________________________________________________________");					
			System.out.println("|                                                                            |");
			for (int i = 0 ; i < 81 ; i++) {
	
				if (i % 9 == 0 && i != 0 ) {
					System.out.println("");
				}
				
				System.out.print("__");
				try {
					System.out.print("_" + Terrain.get(i)[1] +"__");
				}
				catch (NullPointerException e ) {
					System.out.print("null");
				}
				System.out.print("__");
			}
			
			System.out.println("______________________________________________________________________________");
			
		}

		
		
		
		
		
		
		
		
		
		
		
		public boolean affirmation ( int i) {  
			
			boolean condition;
			
			try {
				condition = ((Terrain.get(i))[0] == Terrain.get(i-1)[0] || Terrain.get(i)[0] == Terrain.get(i+1)[0] || Terrain.get(i)[0] == Terrain.get(i+9)[0]||Terrain.get(i)[0] == Terrain.get(i-9)[0]);
			}
			
			catch(NullPointerException e ) {
				return false;		
			}
			
			return condition;
		}

		
		
		
		
		
		
		
		
		
		
		public Integer result (int i ) {
			
		int result = 0; 
			
		try{		
			if (Terrain.get(i)[0] != null) {			
				if ( affirmation(i) == true && affirmation (i-1) == false && affirmation(i+1) == true ){
					result = 2;
					return result;
				}
				
				else if(affirmation(i) == true && affirmation(i+1) == false ) {
					result = 1;
					return result;
					
					
					
					

		int counter;
		int nbOfKing;
		public Integer counter(int i ) {			
				try {
					
					
					
					if ((Terrain.get(i)[0] == Terrain.get(i+1)[0] || (Terrain.get(i)[0] == Terrain.get(i+9)[0]) )== true) {
						 if (Terrain.get(i)[0] == Terrain.get(i+1)[0] == true) {
							counter++;
							nbOfKing =+ Integer.parseInt(Terrain.get(i)[1]);
							counter(i+1);
						 }
						 
						 
						 /*if ( (Terrain.get(i)[0] == Terrain.get(i-1)[0] ) && (Terrain.get(i)[0] != Terrain.get(i+1)[0]) && (Terrain.get(i)[0] != Terrain.get(i+9)[0]) ) {
							 nbOfKing =+ Integer.parseInt(Terrain.get(i)[1]);
								counter++;
							}*/
						 
						 /*if ((Terrain.get(i)[0] == Terrain.get(i+9)[0] ) && (Terrain.get(i)[0] != Terrain.get(i+1)[0]) && (Terrain.get(i)[0] != Terrain.get(i+10)[0])) {
							 counter++;
						 }
						 
						 if( (Terrain.get(i)[0] == Terrain.get(i+1)[0]) && (Terrain.get(i)[0] == Terrain.get(i+9)[0]) && Terrain.get(i)[0] != Terrain.get(i+10)[0]) {
							 counter++;
						 }*/
						
						if (Terrain.get(i)[0] == Terrain.get(i+9)[0] == true ){
							counter++;
							nbOfKing =+ Integer.parseInt(Terrain.get(i)[1]);
							counter (i+9);
						}
						
					}
					
					else {
						nbOfKing = 0;
					}
					
				return counter;

				}
				
				catch (NullPointerException e ) {
					return 0;
				}
		}
		

	
		/*List<Square> theZone = new ArrayList<Square>();
		
		public void scoreAZone(int x, int y) {

			findAZone(x, y);
			int numCrowns = 0;
			for (int i = 0; i < theZone.size(); i++) {
				numCrowns += theZone.get(i).getCrowns();
			}
			totalBoardScore += (theZone.size() * numCrowns);
			theZone = new ArrayList<Square>();
			// System.out.print(" " + numCrowns + " ");
			// System.out.print(theZone.size());

			// System.out.print("Scored");

		}

		public void scoreTheBoard() {

			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 9; j++) {
					scoreAZone(j, i);
				}
			}

			System.out.print(totalBoardScore);
		}*/
		
		
		
		
		
		
		
		
		
		
		public void deleteSimpleElements() {
				
				String typeOfField[] = {"Champs","Foret","Mer", "Montagne", "Prairie", "Mine"};
				
				for (int j = 0 ; j<6 ; j++) {
					String type = typeOfField[j];
					for (int i = 0 ; i<81 ; i++) {
						try {
							if (Terrain.get(i)[0] != Terrain.get(i-1)[0] && Terrain.get(i)[0] != Terrain.get(i+1)[0] && Terrain.get(i)[0] != Terrain.get(i+9)[0] && Terrain.get(i)[0] != Terrain.get(i-9)[0]) {
								//TO DO : Retourne le nombre de points liés au roi ! 
								Terrain.remove(i);
							}
						}					
						catch (NullPointerException e ) {
							
						}
					}
				}
			
			}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		public void comptedespoints() {
							
		int count = 0; 
			for (int i = 1 ; i<81 ; i++) {
					//count = count + result(i);
				}
		
				
			System.out.print(" Le nombre de est sont : ");
			System.out.println(count);
				
		}
}

