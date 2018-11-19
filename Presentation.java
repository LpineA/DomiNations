package com.sdz.test;
import java.util.*;

public class Presentation {
	
	
	static int nbJoueurs;
	static String pseudoJoueur1;
	static String pseudoJoueur2;
	static String pseudoJoueur3;
	static String pseudoJoueur4;
	
	static HashMap<Integer, String> jeu = JeuDeCarte.jeu;

	public static void main(String[] args) {
		preparation();
	}
	
	public static void preparation () {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("#----------------------------------------------#" + "\n" );
		System.out.println("Bienvenue dans le jeu de DomiNations" + "\n" );
		System.out.println("#----------------------------------------------#" + "\n" );
		System.out.println("Commençons par définir le nombre de joueurs (2,3 ou 4) qui vont jouer durant cette partie ;) Combien seront nous ? ");
		try {
		nbJoueurs = scan.nextInt();
		}
		catch (Exception e ) {
			System.out.println("Veuillez entrer un nombre valide joueur ");
			preparation();
		}
		
		if (nbJoueurs <= 0) {
			System.out.println("Ce jeu ne ce joue qu'avec 2, 3 ou 4 joueurs ! Veuillez entrer au moins une de ces valeurs ");
			preparation();
		}
		
		if (nbJoueurs > 4) {
			System.out.println("Ce jeu ne ce joue qu'avec 2, 3 ou 4 joueurs ! Veuillez entrer au moins une de ces valeurs ");
			preparation();
		}
		
		if (nbJoueurs == 2) {
			System.out.println("Entrez le pseudo du premier joueur");
			pseudoJoueur1 =scan.next();
			System.out.println("Entrez le pseudo du second joueur");
			pseudoJoueur2 = scan.next();
			JeuDeCarte.removeCard(jeu, 24);

		}
		
		if (nbJoueurs == 3) {
			System.out.println("Entrez le pseudo du premier joueur");
			pseudoJoueur1 = scan.nextLine();
			System.out.println("Entrez le pseudo du second joueur");
			pseudoJoueur2 = scan.nextLine();
			System.out.println("Entrez le pseudo du troisième joueur");
			pseudoJoueur3 = scan.nextLine();	
			JeuDeCarte.removeCard(jeu, 12);

		}
		
		if (nbJoueurs == 4 ) {
			System.out.println("Entrez le pseudo du premier joueur");
			pseudoJoueur1 = scan.nextLine();
			System.out.println("Entrez le pseudo du second joueur");
			pseudoJoueur2 = scan.nextLine();
			System.out.println("Entrez le pseudo du troisième joueur");
			pseudoJoueur3 = scan.nextLine();
			System.out.println("Entrez le pseudo du quatrième joueur");
			pseudoJoueur4 = scan.nextLine();
		}
		

		

	}

}
