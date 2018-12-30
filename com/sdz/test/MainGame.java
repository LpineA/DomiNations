package com.sdz.test;

import java.util.ArrayList;
import java.util.Collections;



public class MainGame {
	
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
		System.out.println("apres le 1er tirage il reste donc :");
		System.out.println(Card.tableau2.size()+"cartes");
//		ArrayList<Integer> memoire= Card.memoire;
		 // ici on fais une pioche de carte 
		PremierTour.choixCarte(nbjoueur);
		 
		ArrayList<Personn> nosJoueur= Presentation.nosJoueur;
		
					
		

		
		
		// poser premieres cartes
		// notre fontion qui pose des cartes 
		
		
		ArrayList <String> ordre= new ArrayList <String>();
		ordre=ordrejeux(nbjoueur);
		
			for(String currentPlayer: ordre) {

		Personn joueurs= Personn.findPlayerByPseudo(currentPlayer);	
			
		System.out.println(joueurs.getPseudo());	
		
		
		if (nbjoueur==3 || nbjoueur==4) {
		System.out.println(joueurs.getPiocheJoueur().get(0).getNumCards());
		System.out.println(joueurs.getOrdreTour().get(0)+"\n");
		System.out.println("Pose de aymeric");
		joueurs.setPositionofDominos(joueurs.getPiocheJoueur().get(0));
		}
		else if (nbjoueur==2) {
			System.out.println(joueurs.getPiocheJoueur().get(0).getNumCards());
			System.out.println(joueurs.getPiocheJoueur().get(1).getNumCards());
			Collections.sort(joueurs.getOrdreTour()); 
			System.out.println(joueurs.getOrdreTour().get(0)+"\n");
			System.out.println(joueurs.getOrdreTour().get(1)+"\n");
			System.out.println("Pose de aymeric");
			joueurs.setPositionofDominos(joueurs.getPiocheJoueur().get(0));
			joueurs.setPositionofDominos(joueurs.getPiocheJoueur().get(1));
			}
		
		
	}
			
			
			
		
			int i=1;
			if(nbjoueur==2) {
				i++;
			}
			
			do {
				// recuperer nouvelle cartes
				
				
				
				PremierTour.piocheRoiJoueurs (nbjoueur);	
				System.out.println("apres le n'eme tirage il reste donc :");
				System.out.println(Card.tableau2.size()+"cartes");
//				ArrayList <String> ordre= new ArrayList <String>();
				ordre=ordrejeux(nbjoueur);
//				for(String o: ordre) {
//					System.out.println(o);
//				}
				for(Personn joueurs: nosJoueur) {	
					joueurs.reSetOrdreTour();   // pour reset lordre de jeux a chaque tour car sinon ca devient le bordel
				}
				PremierTour.tourSuivant(ordre, nbjoueur);
				//
				for(String currentPlayer: ordre) {

					Personn joueurs= Personn.findPlayerByPseudo(currentPlayer);	
					
					System.out.println(joueurs.getPseudo());	
					
					
					if (nbjoueur==3 || nbjoueur==4) {
					System.out.println(joueurs.getPiocheJoueur().get(i).getNumCards());
					System.out.println(joueurs.getOrdreTour().get(0)+"\n");
					System.out.println("Pose de aymeric");
					joueurs.setPositionofDominos(joueurs.getPiocheJoueur().get(i));
					
					}
					else if (nbjoueur==2) {
						System.out.println(joueurs.getPiocheJoueur().get(i).getNumCards());
						System.out.println(joueurs.getPiocheJoueur().get(i+1).getNumCards());
						Collections.sort(joueurs.getOrdreTour()); 
						System.out.println(joueurs.getOrdreTour().get(0)+"\n");
						System.out.println(joueurs.getOrdreTour().get(1)+"\n");
						
						System.out.println("Pose de aymeric");
						joueurs.setPositionofDominos(joueurs.getPiocheJoueur().get(i));
						joueurs.setPositionofDominos(joueurs.getPiocheJoueur().get(i+1));
						
						}
					
					
				}
				
				
				// ici il faut poser les cartes avant de reset lordre 
				
				if (nbjoueur==2) {
				i++;
				}
				
				
				i++;
				
			} while (Card.tableau2.size()>0);
			
			
			
			
		
			
			
			
			
			
			
			
			
			
//			Personn Joueur1 = new Personn();
//			
//			
//			System.out.println("test");
//			
//			String Carte1[] = {"Champs", "2"};
//			String Carte2[] = {"Champs", "0"};
//			String Carte3[] = {"Champs", "0"};
//			String Carte4[] = {"Mine", "2"};
//			String Carte5[] = {"Champs", "1"};
//			String Carte6[] = {"Champs", "0"};
//			String Carte7[] = {"Champs", "0"};
//			String Carte8[] = {"Mine", "0"};
//			String Carte9[] = {"Mine", "0"};
//			String Carte10[] = {"Mine","0"};
//			String Carte11[] = {"Champs", "0"};
//			String Carte12[] = {"Champs", "0"};
//			String Carte13[] = {"Foret", "1"};
//			String Carte14[] = {"Foret", "2"};
//			String Carte15[] = {"Foret", "1"};
//			String Carte16[] = {"Foret", "0"};
//			String Carte17[] = {"Mer", "1"};
//			String Carte18[] = {"Mer", "1"};
//			String Carte19[] = {"Mer", "1"};
//			String Carte20[] = {"Prairie", "0"};
//			String Carte21[] = {"Prairie", "0"};
//
//			
//			
//			Joueur1.Terrain.put(3, Carte1);
//			Joueur1.Terrain.put(4, Carte2);
//			Joueur1.Terrain.put(13, Carte3);
//			Joueur1.Terrain.put(15, Carte4);
//			Joueur1.Terrain.put(14, Carte5);
//			Joueur1.Terrain.put(9, Carte6);
//			Joueur1.Terrain.put(23, Carte7);
//			Joueur1.Terrain.put(68, Carte8);
//			Joueur1.Terrain.put(67, Carte9);
//			Joueur1.Terrain.put(79, Carte10);
//			Joueur1.Terrain.put(12, Carte11);
//			Joueur1.Terrain.put(37, Carte13);
//			Joueur1.Terrain.put(38, Carte14);
//			Joueur1.Terrain.put(39, Carte16);
//			Joueur1.Terrain.put(47, Carte15);
//			Joueur1.Terrain.put(59, Carte17);
//			Joueur1.Terrain.put(60, Carte18);
//			Joueur1.Terrain.put(61, Carte19);
//			Joueur1.Terrain.put(25, Carte20);
//			Joueur1.Terrain.put(34, Carte21);
			for(Personn player: nosJoueur) {
			System.out.println("test2");
			
			player.displayTerrain();

			for (int j = 0; j<81 ; j++) {
				player.counter(j);
			}
			
			player.displayTerrainWithKings();
			System.out.println(player.counter);
			player.displayTerrain();
			System.out.println(player.Terrain.get(3)[1]);
			System.out.println(player.nbOfKing);
			
			
			
			}
			
			
			
			
		
	}
		
		
		
		
		
		
		
		

		
	
	
	//ici cet fonction nous sert a faire un arraylist des joueur dans lordre pour le tour a venir....
	public static ArrayList<String> ordrejeux(int nbJoueurs){
		System.out.println("hello");
		if (nbJoueurs==2) {
		ArrayList <String> ordre = new ArrayList <String>();
		for(int i=0;i<(nbJoueurs*2);i++) {
			ordre.add(null);
		}
		for(Personn joueur: Presentation.nosJoueur ) {
			System.out.println(joueur.getPseudo());
			for (int elem: joueur.getOrdreTour()) {
			System.out.println(elem);	
			ordre.set((elem-1), joueur.getPseudo());
			
			}
		}
		
		
		for (String or: ordre) {
			System.out.println(or);
		}
		
		return ordre;
		}
		else  {
			ArrayList <String> ordre = new ArrayList <String>();
			for(int i=0;i<(nbJoueurs);i++) {
				ordre.add(null);
			}
			for(Personn joueur: Presentation.nosJoueur ) {
				System.out.println(joueur.getPseudo());
				for (int elem: joueur.getOrdreTour()) {
				System.out.println(elem);	
				ordre.set((elem-1), joueur.getPseudo());
				
				}
			}
			
			
			
			for (String or: ordre) {
				System.out.println(or);
			}
			
			
			return ordre;
			}	
	} 
		
}
