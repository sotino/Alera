/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.sotino.entity.combatant;

import be.sotino.entity.Personnage;
import be.sotino.entity.Ressource;

/**
 *
 * @author Simon
 */
public class Phalange extends Combatant{

    
    public static final Ressource PHALANGE_PRICE = new Ressource(0, 50, 35);
    public static final int TEMPS_CREATION= 15000;
    private static int life;
    private static int degat;
    private static int defense;
    
    public Phalange() {
        super(life);
    }

    @Override
    public int getDegat() {
        return Phalange.degat;
    }

    @Override
    public void setDegat(int degat) {
        Phalange.degat = degat;
    }

    @Override
    public int getDefence() {
        return Phalange.defense;
    }

    @Override
    public void setDefence(int defence) {
        Phalange.defense = defence;
    }

    @Override
    public int getTempsCreation() {
        return Phalange.TEMPS_CREATION;
    }

    @Override
    public Ressource getPrice() {
        return PHALANGE_PRICE;
    }

    
    
    
}
