package sdz.com.test;

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
		
		
		
		
			for(Personn joueurs: nosJoueur) {

				
			
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
		
			int i=1;
			if(nbjoueur==2) {
				i++;
			}
			
			do {
				// recuperer nouvelle cartes
				
				
				
				PremierTour.piocheRoiJoueurs (nbjoueur);	
				System.out.println("apres le n'eme tirage il reste donc :");
				System.out.println(Card.tableau2.size()+"cartes");
				ArrayList <String> ordre= new ArrayList <String>();
				ordre=ordrejeux(nbjoueur);
//				for(String o: ordre) {
//					System.out.println(o);
//				}
				for(Personn joueurs: nosJoueur) {	
					joueurs.reSetOrdreTour();   // pour reset lordre de jeux a chaque tour car sinon ca devient le bordel
				}
				PremierTour.tourSuivant(ordre, nbjoueur);
				//
				for(Personn joueurs: nosJoueur) {

					
					
					System.out.println(joueurs.getPseudo());	
					
					
					if (nbjoueur==3 || nbjoueur==4) {
					System.out.println(joueurs.getPiocheJoueur().get(i).getNumCards());
					System.out.println(joueurs.getOrdreTour().get(0)+"\n");
					
					}
					else if (nbjoueur==2) {
						System.out.println(joueurs.getPiocheJoueur().get(i).getNumCards());
						System.out.println(joueurs.getPiocheJoueur().get(i+1).getNumCards());
						Collections.sort(joueurs.getOrdreTour()); 
						System.out.println(joueurs.getOrdreTour().get(0)+"\n");
						System.out.println(joueurs.getOrdreTour().get(1)+"\n");
						
						}
					
					
				}
				
				
				// ici il faut poser les cartes avant de reset lordre 
				
				if (nbjoueur==2) {
				i++;
				}
				
				
				i++;
				
			} while (Card.tableau2.size()>0);
		
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

