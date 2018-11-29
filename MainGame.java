package com.sdz.test;

public class MainGame {

	public static void main(String[] args) {
		 Card.Openfile();
		Card tableaux[]=Card.tableau;
		for(Card V : tableaux){
			System.out.println(V.getNomTerrain1());;
			System.out.println(V.getNomTerrain2());
			  System.out.println(V.decrisToi()+"\n");
			}
	}
}
