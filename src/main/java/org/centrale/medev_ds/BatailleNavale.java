package org.centrale.medev_ds;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Classe principale représentant le jeu de la Bataille Navale.
 * Permet aux joueurs de placer leurs navires sur une grille, puis initie un jeu au tour par tour jusqu'à ce qu'un joueur gagne.
 * Utilise une interface console pour l'interaction.
 * 
 * @author sacha
 */
public class BatailleNavale {

    private int tailleGrille;
    private Joueur j1;
    private Joueur j2;

    /**
     * Constructeur pour le jeu de la Bataille Navale.
     * Demande aux utilisateurs de saisir la taille de la grille et initialise deux joueurs.
     */
    public BatailleNavale() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choisissez la taille de la grille :");
        tailleGrille = sc.nextInt();
        j1 = new Joueur();
        j1.setEst1(true);
        j2 = new Joueur();
        j2.setEst1(false);
    }
    
    /**
     * Initialise le jeu avant le début des tours
     * - placement des navires pour les deux joueurs
     * - lancement du jeu (boucle while qui s'arrête quand un des deux joueurs demande à arreter le jeu, fonctionnalité à ajouter plus tard)
     */
    public void init(){
        placementNavires(j1);
        System.out.println("Tour du Joueur 2");
        placementNavires(j2);
        boolean jeu = true;
        boolean jeu1, jeu2;
        while (jeu) {
            System.out.println("Tour du Joueur 1");
            jeu1 = tourDeJeu(j1);
            System.out.println("Tour du Joueur 2");
            jeu2 = tourDeJeu(j2);
            jeu = jeu1 || jeu2;
        }
    }

    /**
     * Initialise le jeu en plaçant les navires pour les deux joueurs.
     * Les navires sont placés en demandant à chaque joueur d'entrer les coordonnées initiales et finales correspondant aux deux extrémités du bateau.
     * Un bateau ne peut être placé qu'en position verticale ou horizontale.
     * @param j Joueur qui doit placer ses navires
     */
    public void placementNavires(Joueur j) {
        System.out.println("Placement des navires");
        ArrayList<Bateau> bateauxPlacer = new ArrayList();
        bateauxPlacer.add(new Cuirasse());
        bateauxPlacer.add(new PorteAvions());
        bateauxPlacer.add(new Destroyer());
        int posx;
        int posy;
        for (Bateau b: bateauxPlacer){
            System.out.println("Placer le "+ b.getClass().getSimpleName());
            System.out.println("Taille : "+b.getTaille());
            System.out.println("Vous devrez inscrire les coordonnées initiales et finales correspondant aux deux bouts du bateau\nUn bateau ne peut être que en position verticale ou horizontale\n");
            boolean valide = false;
            while (!valide) {
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
                if ((debutX == finX || debutY == finY) && tailleCalculee == b.getTaille()) {
                    b.setPosition(debutX, debutY, finX, finY);
                    valide = true;
                    j.getListeBateau().add(b);
                } else {
                    System.out.println("Placement invalide. Veuillez entrer des coordonnées valides pour un bateau de taille " + b.getTaille());
                }
            }
        }
    }
 /**
     * Effectue un tour de jeu pour un joueur donné.
     * @param j Le joueur pour lequel effectuer le tour.
     * @return true si le jeu doit continuer, false sinon.
     */
    public boolean tourDeJeu(Joueur j) {
        boolean valide = false;
        while (!valide) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Coordonnée en X où vous voulez tirer:");
            int tirX = sc.nextInt();
            System.out.println("Coordonnée en Y où vous voulez tirer:");
            int tirY = sc.nextInt();

            Coordonnee coordonneeAtaque = new Coordonnee(tirX, tirY);
            ArrayList<Bateau> listeBateauEnnemi;
            if (j.getEst1()){
                listeBateauEnnemi = this.j2.getListeBateau();
            }
            else {
                listeBateauEnnemi = this.j1.getListeBateau();  
            }
            for (Bateau bateau: listeBateauEnnemi){

            if (bateau.bonTir(coordonneeAtaque)) {
                System.out.println("Attaque réussi");
                bateau.removeCoordonnee(coordonneeAtaque);
            } else {
                System.out.println("Attaque rateé");
            }

        }
            
        }
        return true;
    }

    
    /**
     * Affiche la grille avec les positions des bateaux pour un joueur donné.
     * Les positions des bateaux sont marquées par 'O' dans la grille.
     * 
     * @param j Le joueur pour lequel afficher la grille.
     * @param tailleGrille La taille de la grille.
     */
    public void afficheGrilleBateau(Joueur j, int tailleGrille) {
        char[][] grille = new char[tailleGrille][tailleGrille];
        for (char[] row : grille) {
            Arrays.fill(row, '.');
        }
        for (Bateau b : j.getListeBateau()) {
            for (Coordonnee c : b.getCoordenadas()) { 
                grille[c.getX()][c.getY()] = 'O'; 
            }
        }
        System.out.print(" ");
        for (int i = 0; i < tailleGrille; i++) {
            System.out.print(" " + i);
        }
        System.out.println();
        for (int i = 0; i < tailleGrille; i++) {
            System.out.print(i + " ");
            for (int k = 0; k < tailleGrille; k++) {
                System.out.print(grille[i][k] + " ");
            }
            System.out.println();
        }
        System.out.println(); 
    }
    
    public int getTailleGrille() {
        return tailleGrille;
    }

    public void setTailleGrille(int tailleGrille) {
        this.tailleGrille = tailleGrille;
    }

    public Joueur getJ1() {
        return j1;
    }

    public void setJ1(Joueur j1) {
        this.j1 = j1;
    }

    public Joueur getJ2() {
        return j2;
    }

    public void setJ2(Joueur j2) {
        this.j2 = j2;
    }
    
  
}