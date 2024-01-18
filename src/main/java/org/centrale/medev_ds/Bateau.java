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
    private List<Coordenada> coordenadas;
    
    public Bateau(int taille) {
        this.taille = taille;
        this.coordenadas = new ArrayList<>();
    }
    
    public void adicionarCoordenada(int x, int y) {
        Coordenada coordenada = new Coordenada(x, y);
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

    public List<Coordenada> getCoordenadas() {
        return coordenadas;
    }

    public void setCoordenadas(List<Coordenada> coordenadas) {
        this.coordenadas = coordenadas;
    }
    
    
        
}
    
      
class Coordenada {
    private int x;
    private int y;

    public Coordenada(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
