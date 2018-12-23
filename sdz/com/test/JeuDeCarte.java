package sdz.com.test;

import java.util.*;

public class JeuDeCarte {

    public static int nbrdepoints;
    public static HashMap<Integer, String> jeu = new HashMap<Integer, String>();
    public static int randomPioche = (int) (Math.random() * (48) + 0);
    public static int nbTirage;


    public static void main(String[] args) {

        creationJeu(jeu);
        tirage(jeu, randomPioche, nbTirage);
        jeuJoueur(jeu, 3);
    }


    public static String creationCarte() {

        String typeDomino[] = {"terre", "for�t", "mer", "sable"};

        int random = (int) (Math.random() * (3));
        int randombis = (int) (Math.random() * (3));
        String tirage = new String();
        tirage = typeDomino[random] + " " + typeDomino[randombis];
        return tirage;
        
    }

    public static void creationJeu(HashMap<Integer, String> jeu) {
        for (int i = 0; i < 48; i++) {
            String carte = creationCarte();
            jeu.put(i, carte);
        }
    }

    public static String tirage(HashMap<Integer, String> jeu, int randomPioche, int nbTirage) {

        int i = 0;
        while (i < nbTirage) {
            i++;
            return jeu.get(randomPioche);
        }

        return jeu.get(randomPioche);
    }

    public static int tirageNumber(HashMap<Integer, String> jeu, int randomPioche, int nbTirage) {

        for (int i = 0; i < nbTirage; i++) {
            System.out.println(randomPioche);
        }
        return  randomPioche;
    }

    public static void afficherMain(HashMap<Integer, String> jeu, ArrayList<String> toDisplay) {

        System.out.println("Voici les cartes que vous poss�dez dans vore jeu : ");
        for (int i = 0; i < toDisplay.size(); i++) {
            System.out.println("Une carte de " + toDisplay.get(i));
        }
    }

    public static ArrayList<String> jeuJoueur(HashMap<Integer, String> jeu, int nbdeCarte�Tirer) {

        ArrayList<String> main = new ArrayList<String>();

        for (int i = 0; i < nbdeCarte�Tirer; i++) {
            main.add(tirage(jeu, randomPioche, nbTirage));
        }
        afficherMain(jeu, main);
        return main;
    }

    public static void removeCard(HashMap<Integer, String> jeu, int nbrCarteASupprimer) {

        int numeroASupprimer = (int) (Math.random() * (48) + 0);

        for (int i = 0; i < nbrCarteASupprimer; i++) {
            jeu.remove(numeroASupprimer);
        }
    }

}

