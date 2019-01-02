package com.sdz.test;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.*;
import java.awt.event.*;
import javax.swing.ImageIcon;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.*;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Graphics;
import javax.swing.JButton;



public class Fenetre extends JFrame implements KeyListener{
   JPanel container = new JPanel();
   public static int largeurFen =1500;
   public static int HauteurFen =900;   
   
     public Fenetre() {
	   
	   this.setTitle("DOMINATION");
	   this.setSize(largeurFen, HauteurFen);
	   
	   this.setResizable(false);
	   this.setLocationRelativeTo(null);
	   this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	   
  
	   container.setBackground(Color.DARK_GRAY);
	   //On lui donne un nombre de colonnes à afficher

		
	   this.addKeyListener(this);
	   this.setVisible(true);
	   this.setContentPane(container);
	//   anaconda =new Serpent (this.getGraphics(),4);
   }
   
   public void StartGame() {
	 //  anaconda.jouer();
   }
   
   
   
	   
		//...
	 
	
   
   
  @Override 
   public void keyPressed(KeyEvent arg0) {
	   
   }
  
  @Override 
  public void keyReleased(KeyEvent arg0) {
	   
  }
  
  @Override 
  public void keyTyped(KeyEvent arg0) {
	   
}
   
   
   
   
   
   
   
}
