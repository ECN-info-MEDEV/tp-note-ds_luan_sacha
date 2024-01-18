package org.centrale.medev_ds;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author sacha
 */
public class BatailleNavale {
    private int tailleGrille;
    Joueur j1;
    Joueur j2;
    
    public BatailleNavale(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Choisissez la taille de la grille :");
        tailleGrille = sc.nextInt();
        Joueur j1 = new Joueur();
        Joueur j2 = new Joueur();
    }

    public void init(){
        placementNavires(j1);
        placementNavires(j2);
        boolean jeu = true;
        boolean jeu1, jeu2;
        while (jeu) {
            jeu1 = tourDeJeu(j1);
            jeu2 = tourDeJeu(j2);
            jeu = jeu1 || jeu2;
        }
    }
    
    public static void placementNavires(Joueur j){
        System.out.println("Placement des navires");
        ArrayList<Bateau> bateauxPlacer = new ArrayList();
        bateauxPlacer.add(new Cuirasse());
        bateauxPlacer.add(new PorteAvions());
        bateauxPlacer.add(new Destroyer());
        int posx;
        int posy;
        for (Bateau b: bateauxPlacer){
            System.out.println("Placer le "+ b.getNom());
            System.out.println("Taille : "+b.getTaille());
            System.out.println("Vous devrez inscrire les coordonnées initiales et finales correspondant aux deux bouts du bateau\nUn bateau ne peut être que en position verticale ou horizontale\n");
            boolean valide = false;
            while(!valide) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Coordonnée initiale en X ?");
                int debutX = sc.nextInt();
                System.out.println("Coordonnées initiale en Y ?");
                int debutY = sc.nextInt();
                System.out.println("Coordonnée finale en X ?");
                int finX = sc.nextInt();
                System.out.println("Coordonnées finale en Y ?");
                int finY = sc.nextInt();

                int tailleCalculee = Math.abs(finX - debutX) + Math.abs(finY - debutY) + 1;
                if((debutX == finX || debutY == finY) && tailleCalculee == b.getTaille()) {
                    b.setPosition(debutX, debutY, finX, finY); 
                    valide = true;
                } else {
                    System.out.println("Placement invalide. Veuillez entrer des coordonnées valides pour un bateau de taille " + b.getTaille());
                }
            }
            
        }
        j.setListeBateau(bateauxPlacer);
    }
    
    
    public static boolean tourDeJeu(Joueur j){
        
        return true;
    }
}
