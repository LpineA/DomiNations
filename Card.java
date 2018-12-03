package com.sdz.test;
import java.io.BufferedReader; 
import java.io.IOException;
import java.nio.charset.StandardCharsets; 
import java.nio.file.Files;
import java.nio.file.Path; 
import java.nio.file.Paths; 
import java.util.ArrayList; 
import java.util.List;



public class Card {
	protected static ArrayList<Card> tableau = new ArrayList<Card>();
	protected static ArrayList<Card> tableau2 = new ArrayList<Card>();
	protected int numberOnCard;
	protected int numberCrowns1;
	protected int numberCrowns2;
	String Terrain1;
	String Terrain2;

 	
	
	

    
    
    public static ArrayList<Card> Openfile() {
	Path pathToFile = Paths.get("C:\\Users\\Jean-Baptiste\\Desktop\\dominos.csv");
	
	try(
	BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.US_ASCII))
	{
		// read the first line from the text file
		String line = br.readLine();
		
		// loop until all lines are read
		while (line != null) {
			
			// use string.split to load a string array with the values from
			// each line of
			// the file, using a comma as the delimiter
			String[] attributes = line.split(",");
			
			Card card = createCard(attributes);
			// adding book into ArrayList books.add(book);
			// read next line before looping
			// if end of file reached, line would be null
			tableau.add(card);
			
			line = br.readLine();
		}
		return tableau;
	}catch(
	IOException ioe)
	{
		System.out.println("Try again r tard");
		ioe.printStackTrace();
	}
	return tableau;
    }
	private static Card createCard(String[] metadata){
		int crown1 = Integer.parseInt(metadata[0]); 
		String Ter1 = metadata[1];
//		System.out.println(Ter1);
		int crown2 = Integer.parseInt(metadata[2]); 
		
		String Ter2 = metadata[3];
//		System.out.println(Ter2);
		int numCard = Integer.parseInt(metadata[4]);
		// create and return book of this metadata 
		return new Card(numCard, crown1, crown2, Ter1, Ter2);
		}
    
   
// default    
// public Card(){
//	  numberOnCard=0;
//	  numberCrowns1=0;
//	  numberCrowns2=0;
//	  String Terrain1="";
//	  String Terrain2="";
//    }
    
  //avec param  
    public Card(int pnumoncard, int pnumbercrown1, int pnumbercrown2, String terrain1, String terrain2){
<<<<<<< HEAD
    	System.out.println("CrÃ©ation d'une ville avec des paramÃ©tres !");
    	String Terrain1 = terrain1;
    	System.out.println(Terrain1);
   	  	String Terrain2 = terrain2; 
   	  	System.out.println(Terrain2);
=======
    	System.out.println("Création d'une ville avec des paramètres !");
    	Terrain1=terrain1;
    	System.out.println(Terrain1);
   	  	Terrain2=terrain2; 
   	 System.out.println(Terrain2);
>>>>>>> 5ccbc484717dc8fdb8483a9d5139200d6ca8214e
    	numberOnCard=pnumoncard;
   	  	numberCrowns1 = pnumbercrown1;
   	  	numberCrowns2 = pnumbercrown2;
   	  
    	
    }
    
    public int getNumCards()
    {
      return numberOnCard;
    }
    
    public int getNumC1()
    {
      return numberCrowns1;
    }
    public int getNumC2()
    {
      return numberCrowns2;
    }
    
    public String getNomTerrain1()
    {
      return Terrain1;
    }
	

    public String getNomTerrain2()
    {
      return Terrain2;
    }
	

	  public String decrisToi(){
		    return "\t"+this.numberOnCard+" est une carte avec un terraim  de type "+ this.Terrain1 + ", elle comporte courone: "+this.numberCrowns1+" courones(s) => elle est donc de avec un seoncd cote : "+this.Terrain2+"contenant "+this.numberCrowns2+"courones" ;
		  }

	  public static ArrayList<Card> suprimerCartes(int number) {
		  int cards= number; 
		  int cardLeft=tableau.size();
		  while(cards>0) {
			  int random = (int) (Math.random()*(cardLeft-1));
			  tableau2.add(tableau.get(random));
			  tableau.remove(random);
			  cards--;
			  cardLeft--;
		  }
		  return tableau2;	
		}
	  
	  
}

	
