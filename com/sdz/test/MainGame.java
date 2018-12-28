package com.sdz.test;

import java.util.ArrayList;
import java.util.Collections;



public class MainGame {
	
	/*

	public static void main(String[] args) {
		Card.Openfile();
		ArrayList<Card> tableaux = Card.tableau;
		ArrayList<String> listeJoueurs = Presentation.listeJoueur;

		
		Presentation.preparation();
		int nbjoueur= Presentation.nbJoueurs;
		System.out.println("Il y a bien "+ nbjoueur +" joueurs");
		
		switch(nbjoueur) {
		   case 2 :
			   Card.suprimerCartes(24);
		      break; // optional
		   
		   case 3 :
			  Card.suprimerCartes(36);
		      break; // optional
		   case 4 :
			  Card.tableau2 = Card.tableau;
			      break; //
			      
		   // You can have any number of case statements.
		}
		
		//ArrayList<Card> tableaux2 = Card.tableau2;
		System.out.println(Card.tableau2.size());
		
//		System.out.println(Card.returnCard(22));
	
		//Card.tirageCarte(nbjoueur);
		PremierTour.piocheRoiJoueurs (nbjoueur);		
//		ArrayList<Integer> memoire= Card.memoire;
		 // ici on fais une pioche de carte 
		PremierTour.choixCarte(nbjoueur);
		
		ArrayList<Personn> nosJoueurs= Presentation.nosJoueur;
		for(Personn joueurs: nosJoueurs) {
			System.out.println(joueurs.getPseudo());	
			System.out.println(joueurs.getPiocheJoueur().get(0).getNumCards());
			System.out.println(joueurs.getOrdreTour()+"\n");
		
			
			String currentPlayer = Tour.getTheOrderOfPlaying(1);
		
			System.out.println(Personn.findPlayerByPseudo(currentPlayer).getPseudo());
			System.out.println("@-------Fin de l'affichage de la liste listeJoueurs--------------@");
		    System.out.println("Ici nous avons finis le premier tour du jeu, nous alons donc continuer, et pour faire ceci nous allons rechoisir des cartes ! ");
			PremierTour.piocheRoiJoueurs(nbjoueur);///////////
		
		System.out.println(joueurs.getPseudo());	
		
		
		if (nbjoueur==3 || nbjoueur==4) {
		System.out.println(joueurs.getPiocheJoueur().get(0).getNumCards());
		System.out.println(joueurs.getOrdreTour().get(0)+"\n");
		
		}
		else if (nbjoueur==2) {
			System.out.println(joueurs.getPiocheJoueur().get(0).getNumCards());
			System.out.println(joueurs.getPiocheJoueur().get(1).getNumCards());
			Collections.sort(joueurs.getOrdreTour()); 
			System.out.println(joueurs.getOrdreTour().get(0)+"\n");
			System.out.println(joueurs.getOrdreTour().get(1)+"\n");
			
			}		
		}
	}
		
		
/* ici on a juste un switch case pour recuperer le bon nombre de cartes.
		
		
		
		
		
		

		for (Card V : tableaux) {
			System.out.println(V.getNomTerrain1());
		System.out.println(V.getNomTerrain2());
			System.out.println(V.decrisToi() + "\n");
		}
		for (Card N : tableaux2) {

			System.out.println(N.decrisToi() + "\n");
		}
		
		
		
		 ici on aura notre boucle qui continue jusqua ce qu'on ai poser toutes les cartes :
		
	
	*/
	
	public static void main(String[] args) {
	
	Personn Joueur1 = new Personn();
	
	
	System.out.println("test");
	
	String Carte1[] = {"Champs", "2"};
	String Carte2[] = {"Champs", "0"};
	String Carte3[] = {"Champs", "0"};
	String Carte4[] = {"Mine", "2"};
	String Carte5[] = {"Champs", "1"};
	String Carte6[] = {"Champs", "0"};
	String Carte7[] = {"Champs", "0"};
	String Carte8[] = {"Mine", "0"};
	String Carte9[] = {"Mine", "0"};
	String Carte10[] = {"Mine","0"};
	
	Joueur1.Terrain.put(3, Carte1);
	Joueur1.Terrain.put(4, Carte2);
	Joueur1.Terrain.put(13, Carte3);
	Joueur1.Terrain.put(15, Carte4);
	Joueur1.Terrain.put(14, Carte5);
	Joueur1.Terrain.put(9, Carte6);
	Joueur1.Terrain.put(23, Carte7);
	Joueur1.Terrain.put(68, Carte8);
	Joueur1.Terrain.put(67, Carte9);
	Joueur1.Terrain.put(79, Carte10);
	

	System.out.println("test2");

	Joueur1.displayTerrain();
	Joueur1.deleteSimpleElements();
	Joueur1.displayTerrain();
	Joueur1.displayTerrain();
	Joueur1.displayTerrainWithKings();
	Joueur1.comptedespoints();
	
	}
	}

