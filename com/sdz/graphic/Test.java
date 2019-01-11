package com.sdz.graphic;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;

import snake.warningWindow;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.*;

  public class Test extends JFrame implements ActionListener{
	  
	  
	  
	  
	  
    static GridLayout grid  = new GridLayout(9, 9);
    static GridLayout grid2  = new GridLayout(1, 2);
    static GridLayout gridCarteAJouer  = new GridLayout(4, 2);
    static GridLayout gridDePioche  = new GridLayout(4, 2);
    
	int numeroCase;
	ArrayList <Integer> listeCase = new ArrayList <Integer>();
	ArrayList <String> typeOfCard = new ArrayList <String> (Arrays.asList("Champs", "Mer", "Mine","Montagne"));
	
	
	ArrayList  <JButton> buttonList = new ArrayList <JButton> ();
	
	//POur chaque joueur son propre jeux
	static ArrayList  <JButton> buttonListp1 = new ArrayList <JButton> ();
	static ArrayList  <JButton> buttonListp2 = new ArrayList <JButton> ();
	static ArrayList  <JButton> buttonListp3 = new ArrayList <JButton> ();
	static ArrayList  <JButton> buttonListp4 = new ArrayList <JButton> ();
	
	static JPanel containerp1 = new JPanel();
	static JPanel containerp2 = new JPanel();
	static JPanel containerp3 = new JPanel();
	static JPanel containerp4 = new JPanel();
	
	// ici le 2 c'est pour les cartes selec et 3 pour la pioche
	static ArrayList <JButton> buttonList2 = new ArrayList <JButton> ();
	static ArrayList <JButton> buttonList3 = new ArrayList <JButton> ();
	
	
	
	static JPanel container = new JPanel();
	JPanel container2 = new JPanel();
	JPanel containerCarteAJoueur = new JPanel();
	JPanel containerDePioche = new JPanel();
	Box b10 = Box.createHorizontalBox();
	public static Dimension fullScreen = Toolkit.getDefaultToolkit().getScreenSize();
	static JButton ProchainTour;
	
	// le truc de aymeric 

	ArrayList <Integer> clickMemoryTableau = new ArrayList<Integer>();	
	ArrayList <Integer> clickMemoryPioche = new ArrayList<Integer>();
	ArrayList <String> player = Presentation.listeJoueur;
	ArrayList <String> fieldChosen = new ArrayList <String>();
	
	Color defaultColor = new Color(238,238,238);
	
	// fin aymeric
	
	
	
	
	
	
//	  public JPanel getContainer() {
//		return container;
//	}
//
//	public void setContainer(JPanel container) {
//		this.container = container;
//	}

	public Box getB10() {
		return b10;
	}

	public void setB10(Box b10) {
		this.b10 = b10;
	}
	
	

	public Test(){
	    this.setTitle("Bouton");
	    this.setSize(fullScreen);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setLocationRelativeTo(null);
	    Box b4 = Box.createVerticalBox();
	    JLabel joueurN = new JLabel("joueur N");
  	    b4.add(joueurN);
  	    
  	    
	    //On définit le layout à utiliser sur le content pane
  	    
  	    
	    
  	  containerCarteAJoueur.setLayout(gridCarteAJouer);
  	containerDePioche.setLayout(gridDePioche);
  	  
	    container2.setLayout(grid2);
	    
	    Border border = container.getBorder();
	    Border margin = new EmptyBorder(50,100,50,50);
	    container.setBorder(new CompoundBorder(border, margin));
	    
	    Border border2 = container2.getBorder();
	    Border margin2 = new EmptyBorder(150,200,50,50);
	    container2.setBorder(new CompoundBorder(border, margin));

	    
	    
	    
	    
//	    container.setBounds(0, fullScreen.height/3, 200, 400);
//	    container2.setBounds(0, fullScreen.height/3, 200, 400);
	    
	    
	    //this.setButtonOnGrid();
	    
	    containerp1.setLayout(grid);
  	    for (int l = 1 ; l<82 ; l++) {
 	    
	    	JButton gridButton = new JButton(Integer.toString(l));
	    	gridButton.addActionListener(this);
	    	buttonListp1.add(gridButton);
	    	gridButton.setVisible(true);
	    	containerp1.add(gridButton);
//	    	JButton test = buttonListp1.get(40);
//	  	    test.setForeground(Color.WHITE);
//	  	    paintCase(test, Color.BLACK, "Castle");
	    }
  	  JButton test = buttonListp1.get(40);
	    test.setForeground(Color.WHITE);
	    paintCase(test, Color.BLACK, "PLayer1");
  	    
  	    
  	    
  	  containerp2.setLayout(grid);
	    for (int l = 1 ; l<82 ; l++) {
	    
	    	JButton gridButton = new JButton(Integer.toString(l));
	    	gridButton.addActionListener(this);
	    	buttonListp2.add(gridButton);
	    	gridButton.setVisible(true);
	    	containerp2.add(gridButton);
//	    	JButton test = buttonListp2.get(40);
//	  	    test.setForeground(Color.WHITE);
//	  	    paintCase(test, Color.BLACK, "Castle");
	    }
    	JButton test2 = buttonListp2.get(40);
  	    test2.setForeground(Color.WHITE);
  	    paintCase(test2, Color.BLACK, "Player2");
	    
	    
	    containerp3.setLayout(grid);
  	    for (int l = 1 ; l<82 ; l++) {
 	    
	    	JButton gridButton = new JButton(Integer.toString(l));
	    	gridButton.addActionListener(this);
	    	buttonListp3.add(gridButton);
	    	gridButton.setVisible(true);
	    	containerp3.add(gridButton);
//	    	JButton test = buttonListp3.get(40);
//	  	    test.setForeground(Color.WHITE);
//	  	    paintCase(test, Color.BLACK, "Castle");
	    }
  	  JButton test3 = buttonListp3.get(40);
	    test3.setForeground(Color.WHITE);
	    paintCase(test3, Color.BLACK, "Player3");
  	    
  	  containerp4.setLayout(grid);
	    for (int l = 1 ; l<82 ; l++) {
	    
	    	JButton gridButton = new JButton(Integer.toString(l));
	    	gridButton.addActionListener(this);
	    	buttonListp4.add(gridButton);
	    	gridButton.setVisible(true);
	    	containerp4.add(gridButton);
	    	
//	    	JButton test = buttonListp4.get(40);
//  	    test.setForeground(Color.WHITE);
//  	    paintCase(test, Color.BLACK, "Castle");
	    }
	    JButton test4 = buttonListp4.get(40);
	    test4.setForeground(Color.WHITE);
	    paintCase(test4, Color.BLACK, "PLayer4");
  	    
  	    
  	    
  	    
  	    
  	    
  	    
  	    
  	    
  	    b4.add(container);
  	    
  	  Box b6 = Box.createVerticalBox();
  	  
  	  
  	for (int l = 1 ; l<9 ; l++) {
    	JButton gridButton = new JButton(Integer.toString(l));
    	gridButton.addActionListener(this);
    	buttonList2.add(gridButton);
    	gridButton.setVisible(true);
    	containerCarteAJoueur.add(gridButton);
    }
  	for (int l = 1 ; l<9 ; l++) {
    	JButton gridButton = new JButton(Integer.toString(l));
    	gridButton.addActionListener(this);
    	buttonList3.add(gridButton);
    	gridButton.setVisible(true);
    	containerDePioche.add(gridButton);
    }
  	  
  container2.add(containerCarteAJoueur);
  container2.add(containerDePioche);
  	  
  	  b6.add(container2);
  	JLabel playerPlaying = new JLabel("c'est au tour de joueur N");
  	  b6.add(playerPlaying );
  	  
  	  
  	ProchainTour= new JButton("Prochain Tour !");
  	ProchainTour.addActionListener(this);
  	b6.add(ProchainTour);
  	  
//  	b4.setPreferredSize(new Dimension(300,300));
//    b6.setPreferredSize(new Dimension(200,400));
  	  
  	    
//  	Box b10 = Box.createHorizontalBox();
  	b10.add(b4);
  	b10.add(b6);
//  	ArrayList<Card> piocheJoueur= new ArrayList<Card>();
//  	Card card1=new Card(22, 1, 2, "Champs", "Mer");
//  	Card card2=new Card(33, 1, 2, "Mer", "Mer");
//  	Card card3=new Card(21, 1, 2, "Montagne", "Mine");
//  	Card card4=new Card(26, 1, 2, "Champs", "Mer");
//  	piocheJoueur.add(card1);
//  	piocheJoueur.add(card2);
//  	piocheJoueur.add(card3);
//  	piocheJoueur.add(card4);
//  	paintThePioche( piocheJoueur);
  	  
  	    this.getContentPane().add(b10);
//  	    
	  }
	  
	 int i = 0;
	 int j = 0;

  
  

    
    
    
    
    
	 public void actionPerformed(ActionEvent e) {
			i++;
//			for (int j = 1 ; j<82 ; j++) {
//				if (e.getSource() == buttonList.get(j)) {
//					if (alreadyClickedTableau(j) == false) {
//						
//						for (int g = 0 ; g<fieldChosen.size(); g++) {
//							paintCase(buttonList.get(j), getTheColorOfCard(typeOfCard.get(g)), Integer.toString(j+1));
//							clickMemoryTableau.add(j);
//							numeroCase = j;
//							listeCase.add(numeroCase);
//							i++;
//							
//							if (g==0) {
//								g=1;
//							}
//						}
//					} else {
//						warningWindow clickedAlready = new warningWindow("Attention vous avez déjà cliqué sur cette case !");
//						clickedAlready.setVisible(true);
//						break;
//					}
//					
//				}
//				
//				if (i>3) {
//					break;
//				}
//			}
			
//			player.add("Joueur1");
//			player.add("Joueur2");
//			player.add("Joueur3");
//			player.add("Joueur4");
			
			
			JoueurChoix ( e);
			ProchainTour(e);
	}
	
	 
	 
	 	public void JoueurChoix (ActionEvent e) {
	 		int iteration=0;
	 		for (int nb =0; nb<=Presentation.nbJoueurs ;nb++) {
	 		if (clickMemoryPioche.size() == 0) {
				choosePioche(e, setPlayerTurn(player, 0));
		}
		
		if (clickMemoryPioche.size() ==2) {
			choosePioche(e, setPlayerTurn(player, 1));
		}
		
		if (clickMemoryPioche.size() ==4) {
			choosePioche(e, setPlayerTurn(player, 2));
		}
		
		if (clickMemoryPioche.size() == 6) {
			choosePioche(e, setPlayerTurn(player, 3));
		}
	 	}
	 	}
	 
	 
		public String setPlayerTurn(ArrayList <String> nosJoueurs, int i ) {
			return nosJoueurs.get(i);
	}
	 
		//il me faut une fonction qui genere random les joueur pour le 1er tour que je vais appeler sur le boutton play de Fenetre...
	 
	
	 public void ProchainTour(ActionEvent e) {
		 if(e.getSource()==ProchainTour) {
		 int nbJoueurs= Presentation.nbJoueurs;
		 player=Jouer.ordrejeux( nbJoueurs);
		 }
		 
	 }
	
	
	//besoin de regarder un peu 
	 public void choosePioche(ActionEvent e , String pseudoPlayer) {
		 // ici je veux que ca attribue la carte au joueur (sa pioche perso)
			j++;
			for (int i =0 ; i<9 ; i++) {		
				if (e.getSource() == buttonList3.get(i)) {
					if (i != 1 && i != 3 && i!= 5 && i!=7 ) {
						if (i < 8){
							if (alreadyClickedPioche(i) == false) {
								buttonList3.get(i).setText(pseudoPlayer);
								buttonList3.get(i+1).setText(pseudoPlayer);
								buttonList3.get(i).setForeground(Color.white);
								buttonList3.get(i+1).setForeground(Color.white);
									clickMemoryPioche.add(i);
									clickMemoryPioche.add(i+1);
//									System.out.println(i);
								}
							
						
							if (alreadyClickedPioche(i) == true) {
								warningWindow alreadyClickedPioche = new warningWindow("Attention vous avez déjà cliqué sur cette case");
								alreadyClickedPioche.setVisible(true);
								break;
							}
						}
					
					else {
						warningWindow piocheTour1 = new warningWindow ("Pour le premier tour sélectionné uniquement \n des cartes dans la colonnes de droite");
						piocheTour1.setVisible(true);	
						break;
					}
					
				if(i == 2 && i == 3 && i == 6 && i == 7) {
					warningWindow checkPosition = new warningWindow("Veuillez sélectionner une carte valide dans la pioche");
					checkPosition.setVisible(true);
				}
	       }
	    }
			}
	}
	
	
	
	
	
	
	
	
  
	public static void paintCase (JButton bouton, Color c, String numberOfCrowns) {
		bouton.setBackground(c);
		bouton.setText(numberOfCrowns);
		bouton.setBorderPainted(false);
		bouton.setOpaque(true);
		bouton.setVisible(true);
		
	}
	
	
	
	  	  
	public static Color getTheColorOfCard(String Type) {
		if (Type.equals("Prairie")) {
			return Color.yellow;
		}

		else if (Type.equals("Foret")) {
			return Color.GREEN;
		}
		else if (Type.equals("Mer")) {
			return Color.BLUE;
		}
		else if (Type.equals("Champs")) {
			return Color.RED;
		}
		else if (Type.equals("Montagne")) {
			return Color.lightGray;
		} 
		else if (Type.equals("Mine")) {
			return Color.GRAY;
		}
		else {
			return  null;
		}
		
	}
	
	//retoucher ca un peu
	public static void paintThePioche(ArrayList<Card> piocheJoueur) {
		String numberOfCrowns;
		String numberOfCrowns2;
		Color c1;
		Color c2;
		int k =0;
		for (Card pioche: piocheJoueur) {
			JButton currentButton=buttonList3.get(k);
			JButton currentButton2=buttonList3.get(k+1);
			numberOfCrowns=Integer.toString(pioche.getNumC1());
			numberOfCrowns2=Integer.toString(pioche.getNumC2());
			c1=getTheColorOfCard(pioche.getNomTerrain1());
			System.out.println(c1);
			c2=getTheColorOfCard(pioche.getNomTerrain2());
			System.out.println(c2);
			
			paintCase ( currentButton,  c1,  numberOfCrowns);
			paintCase ( currentButton2,  c2,  numberOfCrowns2);

			k++;
			k++;
		}
		
	}
	
	//retoucher ca un peu
	public static void paintTheCardsToPLay(ArrayList<Card> piocheJoueur) {
		String numberOfCrowns;
		String numberOfCrowns2;
		Color c1;
		Color c2;
		int k =0;
		for (Card pioche: piocheJoueur) {
			JButton currentButton=buttonList2.get(k);
			JButton currentButton2=buttonList2.get(k+1);
			numberOfCrowns=Integer.toString(pioche.getNumC1());
			numberOfCrowns2=Integer.toString(pioche.getNumC2());
			c1=getTheColorOfCard(pioche.getNomTerrain1());
			System.out.println(c1);
			c2=getTheColorOfCard(pioche.getNomTerrain2());
			System.out.println(c2);
			
			paintCase ( currentButton,  c1,  numberOfCrowns);
			paintCase ( currentButton2,  c2,  numberOfCrowns2);

			k++;
			k++;
		}
		
	}
	
	
	

	
	public boolean alreadyClickedTableau(int a) {
		if (clickMemoryTableau.contains(a)) {
			new warningWindow("Attention vous avez déjà cliqué sur cette case");
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean alreadyClickedPioche(int a ) {
		if (clickMemoryPioche.contains(a)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	
	
	
	
	public String getFieldByColor(Color c) {
		if (c == Color.yellow) {
			return "Champs";
		}

		else if (c == Color.GREEN) {
			return "Prairie";
		}
		else if (c == Color.BLUE) {
			return "Mer";
		}
		else if (c == Color.lightGray) {
			return "Montagne";
		}
		else if (c ==Color.GRAY) {
			return "Mine";
		}
		else {
			return null;
		}
	}
	
	


public void getChosenCardbyPlayer() {
	Color  c = buttonList3.get(i).getBackground();
	String Terrain = getFieldByColor(c);
	fieldChosen.add(Terrain);
	
}

	
	
	

	
	
	
	
	

	

  }
  
  
  
  
  
  
  
  

  
  
  
  