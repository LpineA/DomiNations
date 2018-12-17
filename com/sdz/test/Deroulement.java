package com.sdz.test;
import java.util.*;

public class Deroulement {
	
	static HashMap<Integer, String> jeu = JeuDeCarte.jeu;

	public static void main(String[] args) {
		Presentation.main(args);
		JeuDeCarte.creationCarte();
		JeuDeCarte.creationJeu(jeu);
		PremierTour.piocheRoi2Joueur();
	}

}
