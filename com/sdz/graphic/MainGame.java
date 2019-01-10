package com.sdz.graphic;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;



public class MainGame extends JPanel {
	static boolean continu= true;
	public static void main(String[] args) {
		
		
		Card.Openfile();
		ArrayList<Card> tableaux = Card.tableau;
		ArrayList<String> listeJoueurs = Presentation.listeJoueur;
		
		Fenetre fen = new Fenetre();
//		Jouer.Jouer();
//		Presentation.preparation();
//		while(continu==true) {
//			
//			continu=Presentation.continu;
//			if(continu= false ) {
//				System.out.println("the fuck ");
//				
//			}
//		}
		
		
	}
	}