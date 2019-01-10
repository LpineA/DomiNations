package com.sdz.graphic;

//import java.awt.BorderLayout;
//import java.awt.CardLayout;
//import java.awt.Color;
//import java.awt.Dimension;
//import java.awt.Toolkit;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JPanel;
//
//public class Fenetre extends JFrame{
//
//  CardLayout cl = new CardLayout();
//  JPanel content = new JPanel();
//  //Liste des noms de nos conteneurs pour la pile de cartes
//  String[] listContent = {"Intro", "TableauxDesJoueurs"};
//  int indice = 0;
//  public static Dimension fullScreen = Toolkit.getDefaultToolkit().getScreenSize();
//  
//  
//  public Fenetre(){
//    this.setTitle("CardLayout");
//    this.setSize(fullScreen);
//    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//    this.setLocationRelativeTo(null);
//        
//    //On crée trois conteneurs de couleur différente
//    Test fen = new Test();
//	Presentation hu= new Presentation();
//	hu.setVisible(true);
//	  fen.setVisible(true);
//
//    JPanel boutonPane = new JPanel();
//    JButton bouton = new JButton("Contenu suivant");
//    //Définition de l'action du bouton
//    bouton.addActionListener(new ActionListener(){
//      public void actionPerformed(ActionEvent event){
//        //Via cette instruction, on passe au prochain conteneur de la pile
//        cl.next(content);
//      }
//    });
//        
//    JButton bouton2 = new JButton("Contenu par indice");
//    //Définition de l'action du bouton2
//    bouton2.addActionListener(new ActionListener(){
//      public void actionPerformed(ActionEvent event){               
//        if(++indice > 2)
//          indice = 0;
//        //Via cette instruction, on passe au conteneur correspondant au nom fourni en paramètre
//        cl.show(content, listContent[indice]);
//      }
//    });
//        
//    boutonPane.add(bouton);
//    boutonPane.add(bouton2);
//    //On définit le layout
//    content.setLayout(cl);
//    //On ajoute les cartes à la pile avec un nom pour les retrouver
//    content.add(fen, listContent[0]);
//    content.add(hu, listContent[1]);
//    
//
//    this.getContentPane().add(boutonPane, BorderLayout.NORTH);
//    this.getContentPane().add(content, BorderLayout.CENTER);
//    this.setVisible(true);
//  } 
//}



import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Fenetre extends JFrame{

  CardLayout cl = new CardLayout();
  JPanel content = new JPanel();
  //Liste des noms de nos conteneurs pour la pile de cartes
  String[] listContent = {"CARD_1", "CARD_2"};
   
  int indice = 0;
  public static Dimension fullScreen = Toolkit.getDefaultToolkit().getScreenSize();
  public static JButton bouton = new JButton("PLay..");
  public Fenetre(){
    this.setTitle("CardLayout");
    this.setSize(fullScreen);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLocationRelativeTo(null);
		
    //On crée trois conteneurs de couleur différente
    
    JPanel card1 = new JPanel();
    card1.setBackground(Color.red);
    Presentation hu= new Presentation();
    card1.add(hu.getB4());
    
    JPanel card2 = new JPanel();
    card2.setBackground(Color.blue);
    Test fen = new Test();
    card2.add(fen.getB10());
   
    
	
   
	
	
	
	
    JPanel boutonPane = new JPanel();
    
    bouton.setVisible(false);
    //Définition de l'action du bouton
    bouton.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent event){
        //Via cette instruction, on passe au prochain conteneur de la pile   (pense a la decomenter.....)
    	  
//        cl.next(content);
//    	  int nbplayers= Presentation.nbJoueurs;
//    	  switch(nbplayers) {
//    	   case 2 :
//    		   Card.suprimerCartes(24);
//    	      break; // optional
//    	   
//    	   case 3 :
//    		  Card.suprimerCartes(36);
//    	      break; // optional
//    	   case 4 :
//    		  Card.tableau2 = Card.tableau;
//    		      break; //
//    		      
//    	   // You can have any number of case statements.
//    	}
//    	  PremierTour.piocheRoiJoueurs ( nbplayers);
      }
    });
		
    JButton bouton2 = new JButton("Contenu par indice");
    //Définition de l'action du bouton2
    bouton2.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent event){				
    	  cl.next(content);
      }
    });
		
    boutonPane.add(bouton);
    boutonPane.add(bouton2);
    //On définit le layout
    content.setLayout(cl);
    //On ajoute les cartes à la pile avec un nom pour les retrouver
    content.add(card1, listContent[0]);
    content.add(card2, listContent[1]);
    

    this.getContentPane().add(boutonPane, BorderLayout.NORTH);
    this.getContentPane().add(content, BorderLayout.CENTER);
    this.setVisible(true);
  }	
}