package com.sdz.test;
import java.util.*;

public class Deroulement {
	
	static HashMap<Integer, String> jeu = JeuDeCarte.jeu;

	static Hashtable<Integer, ArrayList<String>> TerrainTest= new Hashtable< Integer, ArrayList <String>>();

	public static void main(String[] args) {
		
		TerrainTest.get(0).add("gwendal");
		TerrainTest.get(0).get(0).add("gwendal");
		System.out.println(TerrainTest.get(0).get(0));
		System.out.println(TerrainTest.get(0).get(1));
	}
	
	try{		
		if (Terrain.get(i)[0] != null) {			
			if ( affirmation(i) == false ){
				result = Integer.parseInt(Terrain.get(i)[1]);
				Terrain.remove(i);
				return result++;
			}
			
			else if(affirmation(i) == true) {
				if (Terrain.get(i)[0] == Terrain.get(i+1)[0] == true) {
					result ++;
					Terrain.remove(i);
					result(i+1);
					return result;
				}
				
				if (Terrain.get(i)[0] == Terrain.get(i+9)[0] == true) {
					result++;
					Terrain.remove(i);
					Terrain.remove(i+9);
					result(i+9);
					return result;
				}
				if ((Terrain.get(i)[0] == Terrain.get(i+9)[0] && Terrain.get(i)[0] == Terrain.get(i+1)[0]) == true) {
					result = 2;
					Terrain.remove(i);
					Terrain.remove(i+1);
					Terrain.remove(i+9);
					result(i+1);
					return result;
				}
			}
		}
					
		return result;
		
	}
	catch (NullPointerException e){
		return 0;
	}
}
