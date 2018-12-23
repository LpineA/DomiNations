package com.sdz.test;
import java.util.*;


public class PremierTour extends Presentation{
	
	int nbJoueurs = Presentation.nbJoueurs;
	static String pseudoJoueur1 = Presentation.pseudoJoueur1;
	static String pseudoJoueur2 = Presentation.pseudoJoueur2;
	static String pseudoJoueur3 = Presentation.pseudoJoueur3;
	static String pseudoJoueur4 = Presentation.pseudoJoueur4;
	static HashMap<Integer, String> jeu = JeuDeCarte.jeu;
	static int randomPioche = JeuDeCarte.randomPioche;
	static int nbTirage = JeuDeCarte.nbTirage;	
	static ArrayList<String> listeJoueurs = Presentation.listeJoueur;
	static ArrayList<Integer> memoires = Card.memoire;
	static ArrayList<Card> tableau2 = Card.tableau2;
	
//	public ArrayList <String> currentPlayer  = new ArrayList <String>();
	
	static ArrayList <Card> piocheJoueur = Card.piocheJoueur;
	
	protected static ArrayList<Personn> nosJoueur= Presentation.nosJoueur;
	  Personn Joueur1 = Presentation.Joueur1;
	  Personn Joueur2 = Presentation.Joueur2;
	  Personn Joueur3 = Presentation.Joueur3;
	  Personn Joueur4 = Presentation.Joueur4;
	
	
	static Scanner scan = new Scanner(System.in);

	

	
	public static void piocheRoiJoueurs (int nbplayers) {
		System.out.println("Nous allons commencer !! \n");
		
		System.out.println("...........");
		
		switch(nbplayers) {
		   case 2 :
			   Card.tirageCarte(4);
		      break; // optional
		   
		   case 3 :
			   Card.tirageCarte(3);
		      break; // optional
		   case 4 :
			   Card.tirageCarte(4);
			      break; //
		   // You can have any number of case statements.
		
		}
		System.out.println("Les cartes que vous avez piochées sont : ");
		Collections.sort(memoires);   // ici on trie les carte par ordre croissant !!!  
		 for (int i =0;i< memoires.size();i++){    
			   System.out.println(memoires.get(i));
				}	
		  
	}
	
	public static void choixCarte (int nbJoueurs) {
		
		ArrayList<Integer> newliste = new ArrayList <Integer>();
		
		int  choixCarte = 0;
		int i = nbJoueurs;
		while (listeJoueurs.size() > 0) {
			 
		
				if(nbJoueurs==3 || nbJoueurs==4 || nbJoueurs ==2) {
					int random = (int) (Math.random() * (i));
					i--; 
					String currentPlayer = listeJoueurs.get(random);
					
					System.out.println("Nous allons jouer avec " + currentPlayer);
					System.out.println("Quelle est la numéro de la carte sur laquelle voulez vous poser votre roi ? ");
					try {	
						choixCarte = scan.nextInt();
					}
				
					catch (Exception e ) {
						System.out.println("Veuillez entrer un nom de carte valide");
					}
					
					if ((memoires.contains(choixCarte) == false) || (newliste.contains(choixCarte))){
						System.out.println("Le numéro de la carte que vous avez entré, n'est pas disponible ! Veuillez entrer un numéro de carte valide");
					}
					else {
						listeJoueurs.remove(random);
						Personn player= Personn.findPlayerByPseudo(currentPlayer);//il faut ces ligne pour que ce soit random et pas direct player 1
						System.out.println(choixCarte);
						System.out.println(Card.returnCard(choixCarte).getNumCards());
						player.ajouterCarte(Card.returnCard(choixCarte));
						 newliste.add(choixCarte);
						System.out.println((memoires.indexOf(choixCarte)+1));
						for(int mem : memoires) {
							System.out.println(mem);
						}
						
						player.setOrdreTour((memoires.indexOf(choixCarte))+1);// ici nous definissons ordre pour le prochain tour (+petite carte en 1er et grande joue en dernier) on fait plus 1 car index commence a 0
//						memoire2.remove(memoire2.indexOf(choixCarte));
						
						
						
					}
					
					
					
				
			}	
				
		}
		memoires.removeAll(memoires);
	}

	
	public static void choixCarte3Players (ArrayList <String> ordre, int nbJoueurs) {
		
		 
			int  choixCarte = 0;
			int i = nbJoueurs;
			while (memoires.size() > 0) {				
					if(nbJoueurs==3 || nbJoueurs==4 || nbJoueurs ==2) {
						int random = (int) (Math.random() * (i));
						i--; 
						String currentPlayer = listeJoueurs.get(random);
						listeJoueur.remove(random);
						System.out.println("Nous allons jouer avec " + currentPlayer);
						System.out.println("Quelle est la numéro de la carte sur laquelle voulez vous poser votre roi ? ");
						try {	
							choixCarte = scan.nextInt();
						}
					
						catch (Exception e ) {
							System.out.println("Veuillez entrer un nom de carte valide");
						}
						
						if (memoires.contains(choixCarte) == false){
							System.out.println("Le numéro de la carte que vous avez entré, n'est pas disponible ! Veuillez entrer un numéro de carte valide");
						}
						
						else {
							
							Personn player= Personn.findPlayerByPseudo(currentPlayer);  //il faut ces ligne pour que ce soit random et pas direct player 1
							player.ajouterCarte(Card.returnCard(choixCarte));
							memoires.remove(memoires.indexOf(choixCarte));
						}
						
						
						
					
				}
					else {
						System.out.println("le nombre de joueur est 2");
					}

					
					
			}
	}

		
}