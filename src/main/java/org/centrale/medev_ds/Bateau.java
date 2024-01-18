package org.centrale.medev_ds;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe représentant un bateau dans le jeu de la Bataille Navale.
 * Chaque bateau a une taille, des coordonnées et des méthodes pour ajouter des coordonnées et définir sa position.
 * 
 * @author sacha
 */
public class Bateau {
    private int taille;
    private List<Coordonnee> coordenadas;

    /**
     * Constructeur de la classe Bateau.
     * Initialise un bateau avec une taille spécifiée et une liste vide de coordonnées.
     * 
     * @param taille Taille du bateau.
     */
    public Bateau(int taille) {
        this.taille = taille;
        this.coordenadas = new ArrayList<>();
    }

    /**
     * Ajoute une coordonnée à la liste de coordonnées du bateau.
     * 
     * @param x Coordonnée X.
     * @param y Coordonnée Y.
     */
    public void adicionarCoordenada(int x, int y) {
        Coordonnee c = new Coordonnee(x, y);
        this.coordenadas.add(c);
    }

    /**
     * Définit la position du bateau en fonction des coordonnées initiales et finales.
     * Les coordonnées sont ajoutées à la liste du bateau en fonction de l'orientation (verticale ou horizontale).
     * 
     * @param x_debut Coordonnée X du début.
     * @param y_debut Coordonnée Y du début.
     * @param x_fin Coordonnée X de la fin.
     * @param y_fin Coordonnée Y de la fin.
     */
    public void setPosition(int x_debut, int y_debut, int x_fin, int y_fin) {
        if (x_debut == x_fin) {
            // Bateau orienté verticalement
            int minY = Math.min(y_debut, y_fin);
            int maxY = Math.max(y_debut, y_fin);

            for (int y = minY; y <= maxY; y++) {
                adicionarCoordenada(x_debut, y);
            }
        } else if (y_debut == y_fin) {
            // Bateau orienté horizontalement
            int minX = Math.min(x_debut, x_fin);
            int maxX = Math.max(x_debut, x_fin);

            for (int x = minX; x <= maxX; x++) {
                adicionarCoordenada(x, y_debut);
            }
        } else {
            // Position invalide
            System.out.println("Le bateau n'a pas une position valide");
        }
    }
    
    public boolean bonTir(Coordonnee coordonnee) {
        return this.coordenadas.contains(coordonnee);
    }

    public void removeCoordonnee(Coordonnee coordonnee) {
        coordenadas.remove(coordonnee);
    }
    
    /**
     * Obtient la taille du bateau.
     * 
     * @return Taille du bateau.
     */
    public int getTaille() {
        return taille;
    }

    /**
     * Définit la taille du bateau.
     * 
     * @param taille Nouvelle taille du bateau.
     */
    public void setTaille(int taille) {
        this.taille = taille;
    }

    /**
     * Obtient la liste des coordonnées du bateau.
     * 
     * @return Liste des coordonnées du bateau.
     */
    public List<Coordonnee> getCoordenadas() {
        return coordenadas;
    }

    /**
     * Définit la liste des coordonnées du bateau.
     * 
     * @param coordenadas Nouvelle liste des coordonnées du bateau.
     */
    public void setCoordenadas(List<Coordonnee> coordenadas) {
        this.coordenadas = coordenadas;
    }
}
