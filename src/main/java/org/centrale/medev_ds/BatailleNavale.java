package org.centrale.medev_ds;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author sacha
 */
public class BatailleNavale {
    private ArrayList<Bateau> listeBateau1;
    private ArrayList<Bateau> listeBateau2;
    private int tailleGrille;

    public void init(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Choisissez la taille de la grille :");
        tailleGrille = sc.nextInt();
        
        Joueur j1 = new Joueur();
        Joueur j2 = new Joueur();
        placementNavire(j1);
        placementNavire(j2);
        boolean jeu = true;
        boolean jeu1, jeu2;
        while (jeu) {
            jeu1 = tourDeJeu(j1);
            jeu2 = tourDeJeu(j2);
            jeu = jeu1 || jeu2;
        }
    }
    
    public static void placementNavire(Joueur j){
        
    }
    
    
    public static boolean tourDeJeu(Joueur j){
        
        
        return true;
    }
}
