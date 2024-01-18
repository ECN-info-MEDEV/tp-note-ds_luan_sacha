/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.centrale.medev_ds;

import java.util.ArrayList;

/**
 *
 * @author sacha
 */
public class Joueur {
    private ArrayList<Bateau> listeBateau;
    private boolean est1;
    
    public Joueur(){
        listeBateau = new ArrayList();
    }

    public ArrayList<Bateau> getListeBateau() {
        return listeBateau;
    }

    public void setListeBateau(ArrayList<Bateau> listeBateau) {
        this.listeBateau = listeBateau;
    }

    public boolean isEst1() {
        return est1;
    }

    public void setEst1(boolean est1) {
        this.est1 = est1;
    }
    
    

}
