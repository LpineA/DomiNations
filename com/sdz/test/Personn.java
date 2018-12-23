package com.sdz.test;
import java.util.*;

public class Personn {
	String pseudo;
		int nbreRois;
		ArrayList<Integer> ordreTour= new ArrayList<Integer>();///  on rajoute ce caracteristique car il nous permet de savoir quelle joueur pose en premier
		 
//		ArrayList<String><Integer> terrainComplet =new ArrayList <String><Integer>(Collections.nCopies(81, null),Collections.nCopies(81, null) );
		
		//  pour le moment juste un tableau vide  et on initalize la carte du centre a center
	int totalnbrePlayers; 
	public ArrayList <Card> piocheJoueur  = new ArrayList <Card>();
	protected static ArrayList<Personn> nosJoueur= Presentation.nosJoueur;
	
	
	
	
	
	
	

	

//	public ArrayList<String> getTerrainComplet() {
//		terrainComplet.add(45,"hello");
//		return terrainComplet;
//	}
//
//	public void setTerrainComplet(int index, String nomTer ) {
//		terrainComplet.add(45,"hello");
//		this.terrainComplet.add(index , nomTer);
//	}

	

	public ArrayList<Card> getPiocheJoueur() {
		return piocheJoueur;
	}

	public ArrayList<Integer> getOrdreTour() {
		return ordreTour;
	}

	public void setOrdreTour(int ordreTour) {
		this.ordreTour.add(ordreTour);
	}

	public void setPiocheJoueur(ArrayList<Card> piocheJoueur) {
		this.piocheJoueur = piocheJoueur;
	}

	
	
	
	public void setPseudo (String Pseudo) {
		pseudo = Pseudo;
	}
	
	public void setnbreRois(int totalNumberPlayers) {
		if(totalNumberPlayers == 2) {
			nbreRois = 2;
		}
		if (totalNumberPlayers == 3 || totalNumberPlayers == 4) {
			nbreRois = 1;
		}
		
	}

	public void settotalNumberPlayers (int totalNumberPlayer) {
		totalnbrePlayers = totalNumberPlayer;
	}
	
	public String getPseudo() {
		return pseudo;
	}
	
	public int getnbreRois(){
		return nbreRois;
	}
	
	public int gettotalnbrePlayer () {
		return totalnbrePlayers;
	}
	
	public void ajouterCarte (Card tirage) {
		this.piocheJoueur.add(tirage);
	}
	
	public void getCard () {
		System.out.println(piocheJoueur.get(0).getNumCards());
	}
	
	public static Personn findPlayerByPseudo(String pseudo) {
		
		Personn h = null;
		for (int i = 0; i < nosJoueur.size(); i++) {
			if (nosJoueur.get(i).getPseudo() == pseudo) {
				h = (nosJoueur.get(i));
			}
			
		}
		
		return h;
		
	}
public static Personn findPlayerByOrder(String pseudo) {
		
		Personn h = null;
		for (int i = 0; i < nosJoueur.size(); i++) {
			if (nosJoueur.get(i).getPseudo() == pseudo) {
				h = (nosJoueur.get(i));
			}
			
		}
		
		return h;
		
	}
	
}
