package sdz.com.test;
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




public class Fenetre extends JFrame implements KeyListener{
   JPanel container = new JPanel();
   public static int largeurFen =200;
   public static int HauteurFen =200;
   Serpent anaconda;
   
   
     public Fenetre() {
	   
	   this.setTitle("DOMINATION");
	   this.setSize(largeurFen, HauteurFen);
	   
	   this.setResizable(false);
	   this.setLocationRelativeTo(null);
	   this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	   
  
	   container.setBackground(Color.DARK_GRAY);
	   
	   this.addKeyListener(this);
	   this.setVisible(true);
	   this.setContentPane(container);
	   anaconda=new Serpent (this.getGraphics(),4);
   }
   
   public void StartGame() {
	   anaconda.jouer();
   }
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
