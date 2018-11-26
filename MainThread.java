package com.sdz.test;
import java.util.*;

public class MainThread {
	
	static HashMap<Integer, String> game = cardGame.game;

	public static void main(String[] args) {
		presentation.main(args);
		cardGame.cardCreation();
		cardGame.gameCreation(game);
		firstTurn.pickKing2Players();


	}

}
