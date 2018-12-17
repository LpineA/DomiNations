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
	public static ArrayList< String> listeJoueur = new ArrayList<String> ();
	protected static ArrayList<Personn> nosJoueur = new ArrayList<Personn>();
	


	
	public static void preparation () {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("#----------------------------------------------#" + "\n" );
		System.out.println("Bienvenue dans le jeu de DomiNations" + "\n" );
		System.out.println("#----------------------------------------------#" + "\n" );
		System.out.println("Commen�ons par d�finir le nombre de joueurs (2,3 ou 4) qui vont jouer durant cette partie ;) Combien seront nous ? ");
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
			Scanner scane = new Scanner(System.in);
			Personn Joueur1= new Personn();
			System.out.println("Entrez le pseudo du premier joueur");
			pseudoJoueur1 =scane.next();
			Joueur1.setPseudo(pseudoJoueur1);
			
			Personn Joueur2 = new Personn();
			System.out.println("Entrez le pseudo du second joueur");
			pseudoJoueur2 = scane.next();
			Joueur2.setPseudo(pseudoJoueur2);
			
			
			
			Joueur1.setnbreRois(nbJoueurs);
			Joueur2.setnbreRois(nbJoueurs);
			
			Joueur1.setnbreRois(nbJoueurs);
			Joueur2.setnbreRois(nbJoueurs);
			
			Joueur1.settotalNumberPlayers(nbJoueurs);
			Joueur2.settotalNumberPlayers(nbJoueurs);
			
			nosJoueur.add(Joueur1);
			nosJoueur.add(Joueur2);
			
			listeJoueur.add(pseudoJoueur1);
			listeJoueur.add(pseudoJoueur2);
			
			
			
			
		}
		
		if (nbJoueurs == 3) {
			Scanner scane = new Scanner(System.in);
			Joueur1 = new Personn();
			System.out.println("Entrez le pseudo du premier joueur");
			pseudoJoueur1 = scane.nextLine();
			Joueur1.setPseudo(pseudoJoueur1);
			
			Joueur2 = new Personn();
			System.out.println("Entrez le pseudo du second joueur");
			pseudoJoueur2 = scane.nextLine();
			Joueur2.setPseudo(pseudoJoueur2);
			
			Joueur3 = new Personn();
			System.out.println("Entrez le pseudo du troisi�me joueur");
			pseudoJoueur3 = scane.nextLine();
			Joueur3.setPseudo(pseudoJoueur3);
			
			
			
			
			Joueur1.setnbreRois(1);
			Joueur2.setnbreRois(1);
			Joueur3.setnbreRois(1);
			
			Joueur1.settotalNumberPlayers(nbJoueurs);
			Joueur2.settotalNumberPlayers(nbJoueurs);
			Joueur3.settotalNumberPlayers(nbJoueurs);
			
			nosJoueur.add(Joueur1);
			nosJoueur.add(Joueur2);
			nosJoueur.add(Joueur3);
			
			listeJoueur.add(pseudoJoueur1);
			listeJoueur.add(pseudoJoueur2);
			listeJoueur.add(pseudoJoueur3);
			
			
			
			

		}
		
		if (nbJoueurs == 4 ) {
			Scanner scane = new Scanner(System.in);
			Joueur1 = new Personn();
			System.out.println("Entrez le pseudo du Premier joueur");
			pseudoJoueur1 = scane.nextLine();
			Joueur1.setPseudo(pseudoJoueur1);
			
			Joueur2 = new Personn();
			System.out.println("Entrez le pseudo du second joueur");
			pseudoJoueur2 = scane.nextLine();
			Joueur2.setPseudo(pseudoJoueur2);
			
			Joueur3 = new Personn();
			System.out.println("Entrez le pseudo du troisi�me joueur");
			pseudoJoueur3 = scane.nextLine();
			Joueur3.setPseudo(pseudoJoueur3);
			
			Joueur4 = new Personn();
			System.out.println("Entrez le pseudo du quatri�me joueur");
			pseudoJoueur4 = scane.nextLine();
			Joueur4.setPseudo(pseudoJoueur4);
			
			Joueur1.setnbreRois(1);
			Joueur2.setnbreRois(1);
			Joueur3.setnbreRois(1);
			Joueur4.setnbreRois(1);
			
			Joueur1.settotalNumberPlayers(nbJoueurs);
			Joueur2.settotalNumberPlayers(nbJoueurs);
			Joueur3.settotalNumberPlayers(nbJoueurs);
			Joueur4.settotalNumberPlayers(nbJoueurs);
			
			nosJoueur.add(Joueur1);
			nosJoueur.add(Joueur2);
			nosJoueur.add(Joueur3);
			nosJoueur.add(Joueur4);
			
			
			listeJoueur.add(pseudoJoueur1);
			listeJoueur.add(pseudoJoueur2);
			listeJoueur.add(pseudoJoueur3);
			listeJoueur.add(pseudoJoueur4);
			
			
			
		}
		

	}

}
