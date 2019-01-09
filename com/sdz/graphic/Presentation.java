package com.sdz.test;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.util.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.Box;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;




public class Presentation extends JFrame implements ActionListener{
	private JButton btn1j = new JButton("1 joueur");
	private JButton btn2j = new JButton("2 joueurs");
	private JButton btn3j = new JButton("3 joueurs");
	private JButton btn4j = new JButton("4 joueurs");
	private JButton btnpl = new JButton("let's do it !!");
	
	private JTextField nom1 = new JTextField("Joueur 1");
	private JTextField nom2 = new JTextField("Joueur 2");
	private JTextField nom3 = new JTextField("Joueur 3");
	private JTextField nom4 = new JTextField("Joueur 4");
	  private JPanel container = new JPanel();
	  private JLabel label = new JLabel("Le Nombre de Joueur et les pseudo : ");

	  
	  public static Dimension fullScreen = Toolkit.getDefaultToolkit().getScreenSize();
	  public Box b4 = Box.createVerticalBox();
	  
	  static boolean continu=true;
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
		
		public  ArrayList<JButton> btnJoueurList = new ArrayList<JButton>();
		public  ArrayList<JTextField> textFieldlist = new ArrayList<JTextField>();
	  
		
		
		
		
		
	  public Box getB4() {
			return b4;
		}





		public void setB4(Box b4) {
			this.b4 = b4;
		}





	public Presentation(){
		  this.setTitle("DOMINATION");
		   
			this.setSize(fullScreen); //taille de la fenetre
		   
		   this.setResizable(false);
		   this.setLocationRelativeTo(null);
		   this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	   
		   
		   
		   
		   Box b1 = Box.createHorizontalBox();
		   Font police = new Font("Tahoma", Font.BOLD, 16);  
		    label.setFont(police);  
		    label.setForeground(Color.blue);  
		    label.setHorizontalAlignment(JLabel.CENTER);
		    b1.add(label);
		   
//	    container.setBackground(Color.white);
//	    container.setLayout(new BorderLayout());
	   b1.add(btn1j);
	    btnJoueurList.add(btn1j);
	    b1.add(btn2j);
	    btnJoueurList.add(btn2j);
	    b1.add(btn3j);
	    btnJoueurList.add(btn3j);
	    b1.add(btn4j);
	    btnJoueurList.add(btn4j);
	   
	    
	    nom1.setVisible(false);
	    nom2.setVisible(false);
	    nom3.setVisible(false);
	    nom4.setVisible(false);
	    
	    Box b2 = Box.createHorizontalBox();
	    b2.add(nom1);
	    b2.add(nom2);
	    b2.add(nom3);
	    b2.add(nom4);
	    textFieldlist.add(nom1);
	    textFieldlist.add(nom2);
	    textFieldlist.add(nom3);
	    textFieldlist.add(nom4);
		
	    
	    btnpl.setVisible(false);
	    Box b3 = Box.createHorizontalBox();
	    b3.add(btnpl);
	    
	    
	        
	    //Nous ajoutons notre fenêtre à la liste des auditeurs de notre bouton
	    btn1j.addActionListener(this);
	    btn2j.addActionListener(this);
	    btn3j.addActionListener(this);
	    btn4j.addActionListener(this);
	    btnpl.addActionListener(this);
	        
	    
	          
	    
	    
	    
	    b4.add(b1);
	    b4.add(b2);
	    b4.add(b3);
	    this.setContentPane(b4);
//	    this.setVisible(true);
	    
	  }
	      




public JTextField getNom1() {
	return nom1;
}



public void setNom1(JTextField nom1) {
	this.nom1 = nom1;
}



public JTextField getNom2() {
	return nom2;
}



public void setNom2(JTextField nom2) {
	this.nom2 = nom2;
}



public JTextField getNom3() {
	return nom3;
}



public void setNom3(JTextField nom3) {
	this.nom3 = nom3;
}



public JTextField getNom4() {
	return nom4;
}



public void setNom4(JTextField nom4) {
	this.nom4 = nom4;
}



public JButton getBtn1j() {
	return btn1j;
}



public void setBtn1j(JButton btn1j) {
	this.btn1j = btn1j;
}



public JButton getBtn2j() {
	return btn2j;
}



public void setBtn2j(JButton btn2j) {
	this.btn2j = btn2j;
}



public JButton getBtn3j() {
	return btn3j;
}



public void setBtn3j(JButton btn3j) {
	this.btn3j = btn3j;
}



public JButton getBtn4j() {
	return btn4j;
}



public void setBtn4j(JButton btn4j) {
	this.btn4j = btn4j;
}
	 
	   public void actionPerformed(ActionEvent arg0) {
	    //Lorsque l'on clique sur le bouton, on met à jour le JLabel
		   
		   if(arg0.getSource() == btn1j) {
			   label.setText((btn1j.getText().substring(0, 1)));
			   nbJoueurs=Integer.parseInt(btn1j.getText().substring(0, 1));
			  }
			  if(arg0.getSource() == btn2j) {
				  label.setText((btn2j.getText().substring(0, 1)));
				  nbJoueurs=Integer.parseInt(btn2j.getText().substring(0, 1));
				  
				  nom1.setVisible(true);
				    nom2.setVisible(true);
				    nom4.setVisible(false);
				    nom3.setVisible(false);
				    btnpl.setVisible(true);
//				
				  
				  
				  
			  }
			  if(arg0.getSource() == btn3j) {
				  label.setText((btn3j.getText().substring(0, 1)));
				  nbJoueurs=Integer.parseInt(btn3j.getText().substring(0, 1));
				  
				  
				  nom1.setVisible(true);
				    nom2.setVisible(true);
				    nom3.setVisible(true);
				    nom4.setVisible(false);
				    btnpl.setVisible(true);
//				  
				  
				  
				  }
			  if(arg0.getSource() == btn4j) {
				  label.setText((btn4j.getText().substring(0, 1)));
				  nbJoueurs=Integer.parseInt(btn4j.getText().substring(0, 1));
				  
				  nom1.setVisible(true);
				    nom2.setVisible(true);
				    nom3.setVisible(true);
				    nom4.setVisible(true);
				    btnpl.setVisible(true);
//				 
				  
				  
				  }
			  
			  
			  if(arg0.getSource() == btnpl) {
				  System.out.println(nbJoueurs);
				  System.out.println("We playing 1");
				  if (nbJoueurs == 2) {
					  System.out.println("We playing 2");
						Joueur1= new Personn();
						pseudoJoueur1=nom1.getText();
						System.out.println(pseudoJoueur1);
						
						Joueur1.setPseudo(pseudoJoueur1);
//						Joueur1.setPanelJoueur(.terrainJoueur());
						Joueur1.setButtonList(Test.buttonListp1);
						Joueur1.setPanelJoueur(Test.containerp1);
						
						
						Joueur2 = new Personn();
						
						pseudoJoueur2=nom2.getText();
						System.out.println(pseudoJoueur2);
						Joueur2.setPseudo(pseudoJoueur2);
						
						
						Joueur2.setButtonList(Test.buttonListp2);
						Joueur2.setPanelJoueur(Test.containerp2);
						
						
						Joueur1.settotalNumberPlayers(nbJoueurs);
						Joueur2.settotalNumberPlayers(nbJoueurs);
						
						nosJoueur.add(Joueur1);
						nosJoueur.add(Joueur2);
						
						listeJoueur.add(pseudoJoueur1);
						listeJoueur.add(pseudoJoueur2);
						listeJoueur.add(pseudoJoueur1);
						listeJoueur.add(pseudoJoueur2);
						
						
						
						
						Fenetre.bouton.setVisible(true);
						continu= false;
						//Jouer.Jouer();
						
						
						
					}
					
					if (nbJoueurs == 3) {
						System.out.println("We playing 2");
						Joueur1 = new Personn();
						pseudoJoueur1=nom1.getText();
						System.out.println(pseudoJoueur1);
						Joueur1.setPseudo(pseudoJoueur1);
						
						Joueur1.setButtonList(Test.buttonListp1);
						Joueur1.setPanelJoueur(Test.containerp1);
						
						
						
						Joueur2 = new Personn();
						pseudoJoueur2=nom2.getText();
						System.out.println(pseudoJoueur2);
						Joueur2.setPseudo(pseudoJoueur2);
						
						Joueur2.setButtonList(Test.buttonListp2);
						Joueur2.setPanelJoueur(Test.containerp2);
						
						Joueur3 = new Personn();
						pseudoJoueur3=nom3.getText();
						System.out.println(pseudoJoueur3);
						Joueur3.setPseudo(pseudoJoueur3);
						
						
						Joueur3.setButtonList(Test.buttonListp3);
						Joueur3.setPanelJoueur(Test.containerp3);
						
						
						
						Joueur1.settotalNumberPlayers(nbJoueurs);
						Joueur2.settotalNumberPlayers(nbJoueurs);
						Joueur3.settotalNumberPlayers(nbJoueurs);
						
						nosJoueur.add(Joueur1);
						nosJoueur.add(Joueur2);
						nosJoueur.add(Joueur3);
						
						listeJoueur.add(pseudoJoueur1);
						listeJoueur.add(pseudoJoueur2);
						listeJoueur.add(pseudoJoueur3);
						Fenetre.bouton.setVisible(true);
						continu= false;
						//Jouer.Jouer();
						
						

					}
					
					if (nbJoueurs == 4 ) {
						System.out.println("We playing 2");
						Joueur1 = new Personn();
						pseudoJoueur1=nom1.getText();
						System.out.println(pseudoJoueur1);
						Joueur1.setPseudo(pseudoJoueur1);
						
						Joueur1.setButtonList(Test.buttonListp1);
						Joueur1.setPanelJoueur(Test.containerp1);
						
						Joueur2 = new Personn();
						pseudoJoueur2=nom2.getText();
						System.out.println(pseudoJoueur2);
						Joueur2.setPseudo(pseudoJoueur2);
						
						Joueur2.setButtonList(Test.buttonListp2);
						Joueur2.setPanelJoueur(Test.containerp2);
						
						
						Joueur3 = new Personn();
						pseudoJoueur3=nom3.getText();
						System.out.println(pseudoJoueur3);
						Joueur3.setPseudo(pseudoJoueur3);
						
						Joueur3.setButtonList(Test.buttonListp3);
						Joueur3.setPanelJoueur(Test.containerp3);
						
						Joueur4 = new Personn();
						pseudoJoueur4=nom4.getText();
						System.out.println(pseudoJoueur4);
						Joueur4.setPseudo(pseudoJoueur4);
						
						Joueur4.setButtonList(Test.buttonListp4);
						Joueur4.setPanelJoueur(Test.containerp4);
						
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
						Fenetre.bouton.setVisible(true);
						continu= false;
						//Jouer.Jouer();
						
					}
				  
				  
				  
				  
				  
			  }
			  

	    
	  }    
	   
	   
	   public static void preparation() {
			
//		   Presentation hu= new Presentation();

	}
}
































