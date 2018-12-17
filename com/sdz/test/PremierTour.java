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
	static ArrayList<Integer> mémoire = Card.mémoire;
	static ArrayList <Card> piocheJoueur = Card.piocheJoueur;
	protected static ArrayList<Personn> nosJoueur= Presentation.nosJoueur;
	 static Personn Joueur1 = Presentation.Joueur1;
	 static Personn Joueur2 = Presentation.Joueur2;
	 static Personn Joueur3 = Presentation.Joueur3;
	 static Personn Joueur4 = Presentation.Joueur4;
	
	
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
		
		 for (int i =0;i< mémoire.size();i++){    
			   System.out.println(mémoire.get(i));
				}	
	}
	
	public static void choixCarte (int nbJoueurs) {
		 
		int  choixCarte = 0;
		int i = nbJoueurs;
		while (mémoire.size() > 0) {				
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
					
					if (mémoire.contains(choixCarte) == false){
						System.out.println("Le numéro de la carte que vous avez entré, n'est pas disponible ! Veuillez entrer un numéro de carte valide");
					}
					
					else {
						
						Personn player= Personn.findPlayerByPseudo(currentPlayer);  //il faut ces ligne pour que ce soit random et pas direct player 1
						player.ajouterCarte(Card.returnCard(choixCarte));
						mémoire.remove(mémoire.indexOf(choixCarte));
					}
					
				
			}
				else {
					System.out.println("le nombre de joueur est 2");
				}

				
				
		}
	}

	
	public static void choixCarte3Players (ArrayList <Integer> mémoire) {
		
		int numéroCarte = 0; 

		
		try {
			System.out.println("Quelle est la carte sur laquelle voulez vous poser votre roi ? ");
			numéroCarte = scan.nextInt();
		}
		
		catch (Exception e ) {
			System.out.println("Veuillez choisir un num�ro de carte indiqu�e ci-dessus");
			choixCarte3Players(mémoire);
		}
		
		if (mémoire.contains(numéroCarte) == false) {
			System.out.println("Le num�ro de la carte indiqu�e n'est pas pr�sent dans les cartes qui sont sorties ");
		}
		
		else {
			mémoire.remove(mémoire.indexOf(numéroCarte));
			Personn Joueur1 = Presentation.Joueur1;
			
			Joueur1.ajouterCarte(Card.returnCard(numéroCarte));
			}
			
			System.out.println("Merci " + pseudoJoueur1 + " au tour de " + pseudoJoueur2 + " ! ");
			System.out.print("Les cartes disponibles sont ");
			for (int i = 0 ; i < mémoire.size() ; i++) {
				System.out.print(mémoire.get(i) + " , ");
			}
			
			System.out.println(pseudoJoueur2 + " veuilliez choisir une carte ");
			try {
				numéroCarte = scan.nextInt();
			}
			
			catch (Exception e) {
				System.out.println("Veuillez entrez un num�ro de carte valable ");
			}
			
			if (mémoire.contains(numéroCarte) == false) {
				System.out.println("Le numéro de la carte que vous venez de rentrer n'est pas dans la liste");
				// faire un fonction avec boucle 
			}
			
			else {
				mémoire.remove(mémoire.indexOf(numéroCarte));
				System.out.println("Merci " + pseudoJoueur2 + ", au tour de " + pseudoJoueur3);
				System.out.println("Malheurseuement il ne reste qu'une carte, "+ pseudoJoueur3 + " votre carte sera donc " + mémoire.get(0));
				System.out.println("Nous allons maintenant à la dispositon des cartes sur vos plateaux respectifs");
			}
			
			
			
		}
	}

		
	


