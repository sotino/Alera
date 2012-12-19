/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.sotino.entity.combatant;

import be.sotino.entity.Ressource;

/**
 *
 * @author Simon
 */
public class Archer extends RangingUnit {

    public static final Ressource ARCHER_PRICE = new Ressource(30, 50, 15);
    public static final int TEMPS_CREATION = 18000;
    private static int life;
    private static int degat;
    private static int defense;
    private static int range;

    public Archer() {
        super(life);
    }

    @Override
    public int getRange() {
        return Archer.range;
    }

    @Override
    public void setRange(int range) {
        Archer.range = range;
    }

    @Override
    public int getDegat() {
        return Archer.degat;
    }

    @Override
    public void setDegat(int degat) {
        Archer.degat = degat;
    }

    @Override
    public int getDefence() {
        return Archer.defense;
    }

    @Override
    public void setDefence(int defence) {
        Archer.defense = defence;
    }

    @Override
    public int getTempsCreation() {
        return Archer.TEMPS_CREATION;
    }

    @Override
    public Ressource getPrice() {
        return ARCHER_PRICE;
    }
}
