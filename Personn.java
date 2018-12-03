package com.sdz.test;
import java.util.*;

public class Personn {
	String pseudo;
	int nbreRois;
	int totalnbrePlayers; 
	ArrayList <Card> piocheJoueur  = new ArrayList <Card>();

	
	
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
		piocheJoueur.add(tirage);
	}
	
	public void getCard () {
		System.out.println(piocheJoueur.get(0).getNumCards());
	}
	
}
