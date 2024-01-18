/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.centrale.medev_ds;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sacha
 */
public class Bateau {
    private int taille;
    private List<Coordonnee> coordenadas;
    
    public Bateau(int taille) {
        this.taille = taille;
        this.coordenadas = new ArrayList<>();
    }
    
    public void adicionarCoordenada(int x, int y) {
        Coordonnee coordenada = new Coordonnee(x, y);
        coordenadas.add(coordenada);
    }
    public void setPosition(int x_debut, int y_debut,int x_fin, int y_fin) {
        if (x_debut == x_fin) {
            // Barco na orientação vertical
            int minY = Math.min(y_debut, y_fin);
            int maxY = Math.max(y_debut, y_fin);

            for (int y = minY; y <= maxY; y++) {
                adicionarCoordenada(x_debut, y);
            }
        } else if (y_debut == y_fin) {
            // Barco na orientação horizontal
            int minX = Math.min(x_debut, x_fin);
            int maxX = Math.max(x_debut, x_fin);

            for (int x = minX; x <= maxX; x++) {
                adicionarCoordenada(x, y_debut);
            }
        } else {
            // position invalide
            System.out.println("le Bateau n'a pas une position valide");
        }
    }

    public int getTaille() {
        return taille;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }

    public List<Coordonnee> getCoordenadas() {
        return coordenadas;
    }

    public void setCoordenadas(List<Coordonnee> coordenadas) {
        this.coordenadas = coordenadas;
    }
    
    
        
}
    
     