package com.sdz.test;

import java.util.ArrayList;

public class MainGame {

	public static void main(String[] args) {
		Card.Openfile();
		ArrayList<Card> tableaux = Card.tableau;

		
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
		
		}
		
		
		
		// ici on a juste un switch case pour recuperer le bon nombre de cartes.
		
		
		
		
		
		
//
//		for (Card V : tableaux) {
//			System.out.println(V.getNomTerrain1());
//			;
//			System.out.println(V.getNomTerrain2());
//			System.out.println(V.decrisToi() + "\n");
//		}
//		for (Card N : tableaux2) {
//
//			System.out.println(N.decrisToi() + "\n");
//		}
		
		
		
		// ici on aura notre boucle qui continue jusqua ce qu'on ai poser toutes les cartes :
		
	
	}
}
