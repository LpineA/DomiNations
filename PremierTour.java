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
	
	
	static Scanner scan = new Scanner(System.in);

	
	
	public static void main(String[] args) {
		piocheRoi3Joueurs();
		
		
	}
	
	public static void piocheRoi3Joueurs () {
		System.out.println("Nous allons commencer !! \n");
		System.out.println("Comme nous jouons avec uniquement 3 joueurs nous extrayons 3 cartes de la pioches ");
		System.out.println("...........");
		System.out.println("Les cartes que vous avez piochées sont : ");
		
		Card.tirageCarte(3);
		
		System.out.println("A " + pseudoJoueur1 + " de jouer ! ");
		
		
	}
	
	public static void choixCarte (ArrayList <Integer> tirage, int nbJoueurs, ArrayList <String> listeJoueurs) {
		String gestion_joueur [] = {""}; //à créer afin de gérer le nombre de joueurs 
		int  choixCarte = 0;
        int random = (int) (Math.random() * (nbJoueurs));
        int randomChoixJoueurs = (int) (Math.random()*3);

		while (listeJoueurs.size() <= 1) {
			int i = nbJoueurs;
			
			if (nbJoueurs == 2) {
				System.out.println("Les quatre cartes picohées sont : ");
				Card.tirageCarte(4);
			}
			
			else {
				System.out.println("Les " + nbJoueurs + " cartes picohées sont : ");
				Card.tirageCarte(nbJoueurs);
			}
			
			while (mémoire.size() == 0) {
			
				System.out.println("Nous allons commencer avec " + gestion_joueur[random]);
				System.out.println("Quelle est la numéro de la carte sur laquelle voulez vous poser votre carte ? ");
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
					mémoire.remove(choixCarte);
				}
			
			
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
			System.out.println("Veuillez choisir un numéro de carte indiquée ci-dessus");
			choixCarte3Players(mémoire);
		}
		
		if (mémoire.contains(numéroCarte) == false) {
			System.out.println("Le numéro de la carte indiquée n'est pas présent dans les cartes qui sont sorties ");
		}
		
		else {
			mémoire.remove(mémoire.indexOf(numéroCarte));
			Personn Joueur1 = Presentation.Joueur1;
			for (Card V : piocheJoueur) {
				if (V.getNumCards() == numéroCarte) {
					Joueur1.ajouterCarte(V);
				}
				else {
					Joueur1.ajouterCarte(V);
				}
			Joueur1.ajouterCarte(piocheJoueur.);
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
				System.out.println("Veuillez entrez un numéro de carte valable ");
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

		
	}


