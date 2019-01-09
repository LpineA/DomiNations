package com.sdz.test;
import java.util.*;
import javax.swing.*;

public class Personn {
		String pseudo;
		int nbreRois;
		ArrayList<Integer> ordreTour= new ArrayList<Integer>();///  on rajoute ce caracteristique car il nous permet de savoir quelle joueur pose en premier
		Hashtable<Integer, String[]> Terrain = new Hashtable< Integer, String[] >();
		
		// chaque joueur a son panel avec son buttonList
		JPanel panelJoueur = new JPanel();
		ArrayList  <JButton> buttonList = new ArrayList <JButton> ();
		
		
		 
		
		//  pour le moment juste un tableau vide  et on initalize la carte du centre a center
		
		int totalnbrePlayers; 
		public ArrayList <Card> piocheJoueur  = new ArrayList <Card>();
		protected static ArrayList<Personn> nosJoueur= Presentation.nosJoueur;
	
		Scanner scan = new Scanner(System.in);



		
		
		
		
	
	public ArrayList<JButton> getButtonList() {
			return buttonList;
		}

		public void setButtonList(ArrayList<JButton> buttonList) {
			this.buttonList = buttonList;
		}

	public JPanel getPanelJoueur() {
			return panelJoueur;
		}

		public void setPanelJoueur(JPanel panelJoueur) {
			this.panelJoueur = panelJoueur;
		}

		
		
		
		
		
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
			
			System.out.println("debug 1");
			typeDominoFace1 = Card.getNomTerrain1();
			typeDominoFace2 = Card.getNomTerrain2();
			nbOFKingDominoFace1 = String.valueOf(Card.getNumC1()); 
			nbOfKingDominoFace2 = String.valueOf(Card.getNumC2());
			
			System.out.println("debug 2");
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
			
			
	//----------------------Vérification du bon positionnement des dominos dans un tableau de 5 par 5------------------------//
			
			
									//---------------------Lignes du haut-------------------//
			
			for (int i = 0 ; i<9 ; i++) {
				if (Terrain.get(i)[0] != null && caseFace1 > 45 || Terrain.get(i)[0] != null && caseFace2 > 45) {
					System.out.println("Votre terrain ne doit pas dépasser une taille de 5 x 5, veuillez donc réésayer de positionner votre domino ! ");
				}
			}
			
			boolean checkIfElementInLine = false;
			
			for (int l = 0 ; l<9 ; l++) {
				if (Terrain.get(l)[0] != null) {
					checkIfElementInLine = true;
				}
			}
				
			for (int j = 9 ; j < 18 ; j++) {
				if(Terrain.get(j)[0] != null && caseFace1 > 54  && checkIfElementInLine == false|| Terrain.get(j)[0] != null && caseFace2 > 54 && checkIfElementInLine == false) {
					System.out.println("Votre terrain ne doit pas dépasser une taille de 5 x 5, veuillez donc réésayer de positionner votre domino ! ");
				}
			}
			
										//---------------------Lignes du bas-------------------//

			
			for (int i = 72 ; i<81 ; i++) {
				if (Terrain.get(i)[0] != null && caseFace1 < 36 || Terrain.get(i)[0] != null && caseFace2 < 36) {
					System.out.println("Votre terrain ne doit pas dépasser une taille de 5 x 5, veuillez donc réésayer de positionner votre domino ! ");
				}
			}
			
			checkIfElementInLine = false;
			
			for (int l = 71 ; l<81 ; l++) {
				if (Terrain.get(l)[0] != null) {
					checkIfElementInLine = true;
				}
			}
			
			for (int j = 63 ; j < 72 ; j++) {
				if(Terrain.get(j)[0] != null && caseFace1 < 27  && checkIfElementInLine == false|| Terrain.get(j)[0] != null && caseFace2 < 27 && checkIfElementInLine == false) {
					System.out.println("Votre terrain ne doit pas dépasser une taille de 5 x 5, veuillez donc réésayer de positionner votre domino ! ");
				}
			}
			
			
			
											//---------------------Lignes à gauche-------------------//
			
			ArrayList <Integer> positionToDeleteRight = new ArrayList <Integer>();
			positionToDeleteRight.addAll(Arrays.asList(5,6,7,8,14,15,16,17,23,24,25,26,32,33,34,35,41,42,43,44,50,51,52,53,59,60,61,62,63,68,69,70,71,80));
			
			for (int k = 0 ; k< 81 ; k = k+9) {
				if (Terrain.get(k)[0] != null && positionToDeleteRight.contains(caseFace1) == true || Terrain.get(k)[0] != null && (positionToDeleteRight.contains(caseFace2) == true)) {
					System.out.println("Votre terrain ne doit pas dépasser une taille de 5 x 5, veuillez donc réésayer de positionner votre domino ! ");
				}
			}
			
			boolean checkIfElementInColumnn = false;
			positionToDeleteRight.remove(0);
			positionToDeleteRight.remove(4);
			positionToDeleteRight.remove(8);
			positionToDeleteRight.remove(12);
			positionToDeleteRight.remove(16);
			positionToDeleteRight.remove(20);
			positionToDeleteRight.remove(24);
			positionToDeleteRight.remove(28);
			positionToDeleteRight.remove(32);
			positionToDeleteRight.remove(36);


			
			for (int l = 1 ; l<81 ; l = l+9) {
				if (Terrain.get(l)[0] != null) {
					checkIfElementInColumnn = true;
				}
			}
			
			
			for (int j = 1 ; j < 81 ; j = j+9) {
				if(Terrain.get(j)[0] != null &&  positionToDeleteRight.contains(caseFace1) ==  true && checkIfElementInLine == false|| Terrain.get(j)[0] != null &&  positionToDeleteRight.contains(caseFace1) ==  true  && checkIfElementInLine == false) {
					System.out.println("Votre terrain ne doit pas dépasser une taille de 5 x 5, veuillez donc réésayer de positionner votre domino ! ");
				}
			}
			
										//---------------------Lignes à droite-------------------//
		
			ArrayList <Integer> positionToDeleteLeft = new ArrayList <Integer>();
			positionToDeleteLeft.addAll(Arrays.asList(0,1,2,3,9,10,11,12,18,19,20,21,27,28,29,30,36,37,38,39,45,46,47,48,54,55,56,57,63,64,65,66,72,73,74,75));
			
			for (int k = 8 ; k< 81 ; k = k+9) {
				if (Terrain.get(k)[0] != null && positionToDeleteLeft.contains(caseFace1) == true || Terrain.get(k)[0] != null && (positionToDeleteLeft.contains(caseFace2) == true)) {
					System.out.println("Votre terrain ne doit pas dépasser une taille de 5 x 5, veuillez donc réésayer de positionner votre domino ! ");
				}
			}
			
			checkIfElementInColumnn = false;
			positionToDeleteLeft.remove(0);
			positionToDeleteLeft.remove(4);
			positionToDeleteLeft.remove(8);
			positionToDeleteLeft.remove(12);
			positionToDeleteLeft.remove(16);
			positionToDeleteLeft.remove(20);
			positionToDeleteLeft.remove(24);
			positionToDeleteLeft.remove(28);
			positionToDeleteLeft.remove(32);
			positionToDeleteLeft.remove(36);


			
			for (int l = 8 ; l<81 ; l = l+9) {
				if (Terrain.get(l)[0] != null) {
					checkIfElementInColumnn = true;
				}
			}
			
			
			for (int j = 8 ; j < 81 ; j = j+9) {
				if(Terrain.get(j)[0] != null &&  positionToDeleteLeft.contains(caseFace1) ==  true && checkIfElementInLine == false|| Terrain.get(j)[0] != null &&  positionToDeleteLeft.contains(caseFace1) ==  true  && checkIfElementInLine == false) {
					System.out.println("Votre terrain ne doit pas dépasser une taille de 5 x 5, veuillez donc réésayer de positionner votre domino ! ");
				}
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
			
		/*public Integer result (int i ) {
			
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
					
					
					
			}
			}
		}
		
		catch (NullPointerException e ) {
			
		}
		}*/
				

		int counter;
		int nbOfKing;
		public Integer counter(int i ) {			
				try {
					
					
					
					if ((Terrain.get(i)[0] == Terrain.get(i+1)[0] || (Terrain.get(i)[0] == Terrain.get(i+9)[0]) )== true) {
						 if (Terrain.get(i)[0] == Terrain.get(i+1)[0] == true) {
							counter++;
							nbOfKing =+ Integer.parseInt(Terrain.get(i)[1]);
							Terrain.remove(i);
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
							Terrain.remove(i);
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

		public void setPositionOfCastle() {
			
			int castlePosition = 0 ;
			
			System.out.println("Avant de commencer à jouer vous allez devoir placer votre château ! ");
			System.out.println("Veuillez donc rentrer le numéro de la case où vous voulez placer ce château ! ");

			try {
				castlePosition = scan.nextInt();			}
			
			catch (Exception e ) {
				System.out.println("Vous ne pouvez entrer seulement des nombres, veuillez réessayer ! ");
				setPositionOfCastle();
			}
			
			
			if (Terrain.get(castlePosition) != null ) {
				System.out.println("Vous ne pouvez pas entre votre château ici, car la case n'est pas disponible ! ");
			}
			else if(Integer.parseInt(Terrain.get(castlePosition)[0]) > 81 || Integer.parseInt(Terrain.get(castlePosition)[0]) < 0) {
				 System.out.println("Veuillez entrer un numéro de case valide !");
			 }
			 
			else {
				System.out.println("Le placement de votre château a bien été enregistré ! ");
			}
		}
}

