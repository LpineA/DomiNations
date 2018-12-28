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
}
