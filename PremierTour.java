package com.sdz.test;
import java.util.*;


public class PremierTour {
	
	int nbJoueurs = Presentation.nbJoueurs;
	static String pseudoJoueur1 = Presentation.pseudoJoueur1;
	static String pseudoJoueur2 = Presentation.pseudoJoueur2;
	static String pseudoJoueur3 = Presentation.pseudoJoueur3;
	static String pseudoJoueur4 = Presentation.pseudoJoueur4;
	static HashMap<Integer, String> jeu = JeuDeCarte.jeu;
	static int randomPioche = JeuDeCarte.randomPioche;
	static int nbTirage = JeuDeCarte.nbTirage;


	public static void main(String[] args) {
		piocheRoi2Joueur();
	}
	
	public static void piocheRoi2Joueur () {
		System.out.println("Nous allons commencer avec " + pseudoJoueur1 + "\n");
		System.out.println("Comme nous jouons avec uniquement 2 joueurs " + pseudoJoueur1 + " va piocher 4 cartes");
		
		System.out.println("Les cartes que vous avez piochées comporte les nuémros : ");
		
		for (int i = 0 ; i < 4 ; i++) {
			System.out.println(JeuDeCarte.tirageNumber(jeu, randomPioche, nbTirage)); 
		}
		

		
	}

}
