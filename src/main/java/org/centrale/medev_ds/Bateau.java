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
    public void setPosition(int x_fin, int y_fin,int x_debut, int y_debut) {
        
       
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
