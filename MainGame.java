package com.sdz.test;

import java.util.ArrayList;

public class MainGame {

	public static void main(String[] args) {
		 Card.Openfile();
		 ArrayList<Card> tableaux=Card.tableau;
		
		ArrayList<Card> tableaux2 = Card.tableau2;
		tableaux2=Card.suprimerCartes(4);
		
		for(Card V : tableaux){
			System.out.println(V.getNomTerrain1());;
			System.out.println(V.getNomTerrain2());
			  System.out.println(V.decrisToi()+"\n");
			}
		for(Card N : tableaux2){
			
			  System.out.println(N.decrisToi()+"\n");
			}
		
		
	}
}
