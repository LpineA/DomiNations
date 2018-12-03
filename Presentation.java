package com.sdz.test;
import java.util.*;

public class Presentation {
	
	static int nbJoueurs;
	static String pseudoJoueur1;
	static String pseudoJoueur2;
	static String pseudoJoueur3;
	static String pseudoJoueur4;
	static Personn Joueur1;
	static Personn Joueur2;
	static Personn Joueur3;
	static Personn Joueur4; 
	public static ArrayList< String> listeJoueur = new ArrayList ();


	
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
			Personn Joueur1= new Personn();
			System.out.println("Entrez le pseudo du premier joueur");
			pseudoJoueur1 =scan.next();
			Joueur1.setPseudo(pseudoJoueur1);
			
			Personn Joueur2 = new Personn();
			System.out.println("Entrez le pseudo du second joueur");
			pseudoJoueur2 = scan.next();
			Joueur2.setPseudo(pseudoJoueur2);
			
			JeuDeCarte.removeCard(jeu, 24);
			
			Joueur1.setnbreRois(nbJoueurs);
			Joueur2.setnbreRois(nbJoueurs);
			
			Joueur1.settotalNumberPlayers(nbJoueurs);
			Joueur2.settotalNumberPlayers(nbJoueurs);
			
			listeJoueur.add(pseudoJoueur1);
			listeJoueur.add(pseudoJoueur2);
		}
		
		if (nbJoueurs == 3) {
			Personn Joueur1 = new Personn();
			System.out.println("Entrez le pseudo du premier joueur");
			pseudoJoueur1 = scan.nextLine();
			Joueur1.setPseudo(pseudoJoueur1);
			
			Personn Joueur2 = new Personn();
			System.out.println("Entrez le pseudo du second joueur");
			pseudoJoueur2 = scan.nextLine();
			Joueur2.setPseudo(pseudoJoueur2);
			
			Personn Joueur3 = new Personn();
			System.out.println("Entrez le pseudo du troisième joueur");
			pseudoJoueur3 = scan.nextLine();
			Joueur3.setPseudo(pseudoJoueur3);
			
			JeuDeCarte.removeCard(jeu, 12);
			
			
			Joueur1.setnbreRois(nbJoueurs);
			Joueur2.setnbreRois(nbJoueurs);
			Joueur3.setnbreRois(nbJoueurs);
			
			Joueur1.settotalNumberPlayers(nbJoueurs);
			Joueur2.settotalNumberPlayers(nbJoueurs);
			Joueur3.settotalNumberPlayers(nbJoueurs);
			
			listeJoueur.add(pseudoJoueur1);
			listeJoueur.add(pseudoJoueur2);
			listeJoueur.add(pseudoJoueur3);
			

		}
		
		if (nbJoueurs == 4 ) {
			Personn Joueur1 = new Personn();
			System.out.println("Entrez le pseudo du premier joueur");
			pseudoJoueur1 = scan.nextLine();
			Joueur1.setPseudo(pseudoJoueur1);
			
			Personn Joueur2 = new Personn();
			System.out.println("Entrez le pseudo du second joueur");
			pseudoJoueur2 = scan.nextLine();
			Joueur2.setPseudo(pseudoJoueur2);
			
			Personn Joueur3 = new Personn();
			System.out.println("Entrez le pseudo du troisième joueur");
			pseudoJoueur3 = scan.nextLine();
			Joueur3.setPseudo(pseudoJoueur3);
			
			Personn Joueur4 = new Personn();
			System.out.println("Entrez le pseudo du quatrième joueur");
			pseudoJoueur4 = scan.nextLine();
			Joueur4.setPseudo(pseudoJoueur4);
			
			Joueur1.setnbreRois(nbJoueurs);
			Joueur2.setnbreRois(nbJoueurs);
			Joueur3.setnbreRois(nbJoueurs);
			Joueur4.setnbreRois(nbJoueurs);
			
			Joueur1.settotalNumberPlayers(nbJoueurs);
			Joueur2.settotalNumberPlayers(nbJoueurs);
			Joueur3.settotalNumberPlayers(nbJoueurs);
			Joueur4.settotalNumberPlayers(nbJoueurs);
			
			listeJoueur.add(pseudoJoueur1);
			listeJoueur.add(pseudoJoueur2);
			listeJoueur.add(pseudoJoueur3);
			listeJoueur.add(pseudoJoueur4);
		}
		

	}

}
