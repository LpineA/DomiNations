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
	static Scanner scan = new Scanner(System.in);

	
	
	public static void main(String[] args) {
		piocheRoi2Joueur();
	}
	
	public static void piocheRoi2Joueur () {
		System.out.println("Nous allons commencer !! \n");
		System.out.println("Comme nous jouons avec uniquement 2 joueurs nous extrayons 4 cartes de la pioches ");
		System.out.println("...........");
		System.out.println("Les cartes que vous avez piochées comporte les numéros : ");
		
		//Inclure fonction qui sort le numéro de quatres cartes au hasard 
		
		
		System.out.println("Nous retournons maintenant les cartes dont les terrains sont : ");
		
		
		// Inclure fonction qui affiche les cartes ainsi que leur terrain
		
		
		System.out.println("A " + pseudoJoueur1 + " de jouer ! ");
		
		
	}
	
	public static void choixCarte (ArrayList <Integer> storage, ) {
		t
		
	}
	
	public static void choixCarte3Players (int numéro_Carte1, int numéro_Carte2, int numéro_Carte3) {
		
		int numéroCarte = 0; 
		ArrayList <Integer> mémoire  = new ArrayList <Integer>();
		mémoire.add(numéro_Carte1);
		mémoire.add(numéro_Carte2);
		mémoire.add(numéro_Carte3);
		
		try {
			System.out.println("Quelle est la carte sur laquelle voulez vous poser votre roi ? ");
			numéroCarte = scan.nextInt();
		}
		
		catch (Exception e ) {
			System.out.println("Veuillez choisir un numéro de carte indiqué ci-dessus");
			choixCarte3Players( numéro_Carte1,  numéro_Carte2, numéro_Carte3);
		}
		
		if (numéroCarte != numéro_Carte1 && numéroCarte != numéro_Carte2 && numéroCarte != numéro_Carte3) {
			System.out.println("Le numéro de la carte indiquée n'est pas présent dans les cartes qui sont sorties ");
		}
		
		else {
			mémoire.remove(mémoire.indexOf(numéroCarte));
			System.out.println("Merci " + pseudoJoueur1 + " au tour de " + pseudoJoueur2 + " ! ");
			System.out.print("Les cartes disponibles sont ");
			for (int i = 0 ; i < mémoire.size() ; i++) {
				System.out.println(mémoire.get(i));
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
				System.out.println("Malheurseuement il ne reste qu'une carte, votre carte sera donc " + mémoire.get(0));
				System.out.println("Nous allons maintenant à la dispositon des cartes sur vos plateaux respectifs");
			}
			
			
			
		}
		
	}

}
