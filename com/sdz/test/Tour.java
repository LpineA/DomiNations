package com.sdz.test;

import java.util.ArrayList;
import java.util.Scanner;


public class Tour {
	
	static ArrayList<String> listeJoueurs = Presentation.listeJoueur;
	static ArrayList<Integer> memoires = Card.memoire;
	static ArrayList<Card> tableau2 = Card.tableau2;
	static Scanner scan = new Scanner(System.in);

	
public static String getTheOrderOfPlaying(int i ) {
	
	String result = null;
	ArrayList<Personn> nosJoueurs= Presentation.nosJoueur;
	for(Personn joueurs: nosJoueurs) {
		if (joueurs.getOrdreTour() == i) {
			result = joueurs.getPseudo();
		}	
	}
	
	return result;

}
	
public static void choixCarte (int nbJoueurs) {
		
		ArrayList<Integer> newliste = new ArrayList <Integer>();
		
		int  choixCarte = 0;
		int i = nbJoueurs;
		

		
		while (listeJoueurs.size() > 0) {
			 
		
				if(nbJoueurs==3 || nbJoueurs==4 || nbJoueurs ==2) {
					int j = 1;
					String currentPlayer = getTheOrderOfPlaying(j);
					
					Personn.findPlayerByPseudo(currentPlayer).getTerrainComplet();
					
					System.out.println("Nous allons jouer avec " + currentPlayer+", dernier joueur à avoir choisi sa carte au tour précéde");
					
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
						Personn player= Personn.findPlayerByPseudo(currentPlayer);  //il faut ces ligne pour que ce soit random et pas direct player 1
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
}
