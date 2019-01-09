package com.sdz.test;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.*;

 
public class Window extends JFrame{
	  JPanel pan = new JPanel();
	  JButton bouton = new JButton ("Jouer !! ");
	  JLabel label = new JLabel("Bienvenue dans le jeu de DomiNations, pour jouer veuillez cliquer sur le bouton" + "\n" + "\n");

	  public Window(){
	    this.setTitle("DomiNations");
	    this.setSize(1200, 400);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setLocationRelativeTo(null);
	    this.setResizable(false);
	    bouton.setLayout(null);
	    bouton.setBounds(600, 200, 60, 60);
	    //Ajout du bouton à notre content pane
	    pan.add(label);
	    pan.add(bouton);
	    this.setContentPane(pan);
	    this.setVisible(true);


	  }
	  
	  public static void main(String[] args) {
		  Window Window = new Window();
		  Window.setLayout(null);
		  
	  }

}





