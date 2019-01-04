package com.sdz.test;
import java.util.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Graphics;
import java.awt.GridLayout;

public class Presentation {
	static String contenu;
	static boolean continu= true;
	static int nbJoueurs;
	static String pseudoJoueur1;
	static String pseudoJoueur2;
	static String pseudoJoueur3;
	static String pseudoJoueur4;
	static Personn Joueur1;
	static Personn Joueur2;
	static Personn Joueur3;
	static Personn Joueur4; 
	public static ArrayList< String> listeJoueur = new ArrayList<String> ();
	protected static ArrayList<Personn> nosJoueur = new ArrayList<Personn>();
   
	static Fenetre fen = PremierTour.fen;


	
	public static void preparation () {

		
//		GridLayout gl = new GridLayout();
//		gl.setColumns(2);
//		gl.setRows(3);
//		fen.setLayout(gl);
		
//		fen.getContentPane().add(new JButton("1"));
//	    fen.getContentPane().add(new JButton("2"));
//	    fen.getContentPane().add(new JButton("3"));
//	    fen.getContentPane().add(new JButton("4"));
//	    fen.getContentPane().add(new JButton("5"));

		JPanel panelInitialisation = new JPanel();
		 
		
		
		JLabel l = new JLabel("Bienvenue dans le jeu de DomiNations" + "\n");
		panelInitialisation.add(l);
	
	JLabel m = new JLabel("Commençons par définir le nombre de joueurs (2,3 ou 4) qui vont jouer durant cette partie ;) Combien seront nous ? ");
	panelInitialisation.add(m);
	
	JTextField textField = new JTextField();
	textField.setColumns(10);
panelInitialisation.add(textField);

JButton but= new JButton();
panelInitialisation.add(but);
	
		 
		fen.setContentPane(panelInitialisation);
	    fen.setVisible(true);
		
		
		
		Scanner scan = new Scanner(System.in);
		
//		System.out.println("#----------------------------------------------#" + "\n" );
//		System.out.println("Bienvenue dans le jeu de DomiNations" + "\n" );
//		System.out.println("#----------------------------------------------#" + "\n" );
//		System.out.println("Commençons par définir le nombre de joueurs (2,3 ou 4) qui vont jouer durant cette partie ;) Combien seront nous ? ");
		
		
		while(continu) {
		but.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
			  contenu = textField.getText();
			  
			     
		

		//--------------------------------------Variables Graphiques---------------------------------------------//
		
		JPanel panelInitialisation = new JPanel();
		JTextField textField = new JTextField();
		textField.setColumns(10);
		panelInitialisation.add(textField);
		
		Scanner scan = new Scanner(System.in);
		
		fen.setContentPane(panelInitialisation);
		fen.setVisible(true);
		
		//--------------------------------------------------------------------------------------------------------//

		System.out.println("#----------------------------------------------#" + "\n" );
		System.out.println("Bienvenue dans le jeu de DomiNations" + "\n" );
		System.out.println("#----------------------------------------------#" + "\n" );
		System.out.println("Commençons par définir le nombre de joueurs (2,3 ou 4) qui vont jouer durant cette partie ;) Combien seront nous ? ");

		try {
			nbJoueurs = Integer.parseInt(contenu);
		
		}
		catch (NumberFormatException ex ) {
			JLabel erreur = new JLabel("Veuillez entrer un nombre valide joueur ");
			panelInitialisation.add(erreur);
			fen.setVisible(true);
			preparation();
		}
		
		if (nbJoueurs <= 0) {
			JLabel erreur = new JLabel("Ce jeu ne ce joue qu'avec 2, 3 ou 4 joueurs ! Veuillez entrer au moins une de ces valeurs ");
			panelInitialisation.add(erreur);
			fen.setVisible(true);
			preparation();
		}
		
		if (nbJoueurs > 4) {
			JLabel erreur = new JLabel("Ce jeu ne ce joue qu'avec 2, 3 ou 4 joueurs ! Veuillez entrer au moins une de ces valeurs ");
			panelInitialisation.add(erreur);
			fen.setVisible(true);
			preparation();
		}
		
		if (nbJoueurs == 2) {
			Scanner scane = new Scanner(System.in);
			Joueur1= new Personn();
			System.out.println("Entrez le pseudo du premier joueur");
			pseudoJoueur1 =scane.next();
			Joueur1.setPseudo(pseudoJoueur1);
			
			Joueur2 = new Personn();
			System.out.println("Entrez le pseudo du second joueur");
			pseudoJoueur2 = scane.next();
			Joueur2.setPseudo(pseudoJoueur2);
			
			
			
			
			
			Joueur1.settotalNumberPlayers(nbJoueurs);
			Joueur2.settotalNumberPlayers(nbJoueurs);
			
			nosJoueur.add(Joueur1);
			nosJoueur.add(Joueur2);
			
			listeJoueur.add(pseudoJoueur1);
			listeJoueur.add(pseudoJoueur2);
			listeJoueur.add(pseudoJoueur1);
			listeJoueur.add(pseudoJoueur2);
			
			
			
			
		}
		
		if (nbJoueurs == 3) {
			Scanner scane = new Scanner(System.in);
			Joueur1 = new Personn();
			System.out.println("Entrez le pseudo du premier joueur");
			pseudoJoueur1 = scane.nextLine();
			Joueur1.setPseudo(pseudoJoueur1);
			
			Joueur2 = new Personn();
			System.out.println("Entrez le pseudo du second joueur");
			pseudoJoueur2 = scane.nextLine();
			Joueur2.setPseudo(pseudoJoueur2);
			
			Joueur3 = new Personn();
			System.out.println("Entrez le pseudo du troisième joueur");
			pseudoJoueur3 = scane.nextLine();
			Joueur3.setPseudo(pseudoJoueur3);
			
			
			
			
			
			
			Joueur1.settotalNumberPlayers(nbJoueurs);
			Joueur2.settotalNumberPlayers(nbJoueurs);
			Joueur3.settotalNumberPlayers(nbJoueurs);
			
			nosJoueur.add(Joueur1);
			nosJoueur.add(Joueur2);
			nosJoueur.add(Joueur3);
			
			listeJoueur.add(pseudoJoueur1);
			listeJoueur.add(pseudoJoueur2);
			listeJoueur.add(pseudoJoueur3);
			
			
			
			

		}
		
		if (nbJoueurs == 4 ) {
			Scanner scane = new Scanner(System.in);
			Joueur1 = new Personn();
			System.out.println("Entrez le pseudo du Premier joueur");
			pseudoJoueur1 = scane.nextLine();
			Joueur1.setPseudo(pseudoJoueur1);
			
			Joueur2 = new Personn();
			System.out.println("Entrez le pseudo du second joueur");
			pseudoJoueur2 = scane.nextLine();
			Joueur2.setPseudo(pseudoJoueur2);
			
			Joueur3 = new Personn();
			System.out.println("Entrez le pseudo du troisième joueur");
			pseudoJoueur3 = scane.nextLine();
			Joueur3.setPseudo(pseudoJoueur3);
			
			Joueur4 = new Personn();
			System.out.println("Entrez le pseudo du quatrième joueur");
			pseudoJoueur4 = scane.nextLine();
			Joueur4.setPseudo(pseudoJoueur4);
			
			
			
			Joueur1.settotalNumberPlayers(nbJoueurs);
			Joueur2.settotalNumberPlayers(nbJoueurs);
			Joueur3.settotalNumberPlayers(nbJoueurs);
			Joueur4.settotalNumberPlayers(nbJoueurs);
			
			nosJoueur.add(Joueur1);
			nosJoueur.add(Joueur2);
			nosJoueur.add(Joueur3);
			nosJoueur.add(Joueur4);
			
			
			listeJoueur.add(pseudoJoueur1);
			listeJoueur.add(pseudoJoueur2);
			listeJoueur.add(pseudoJoueur3);
			listeJoueur.add(pseudoJoueur4);
			
			
			
		}
		continu=false;
			   }  
			
	    }); 
	}

	}

}
