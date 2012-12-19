/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.sotino.entity.combatant;

import be.sotino.entity.Personnage;

/**
 *
 * @author Simon
 */
public abstract class Combatant extends Personnage {

    public Combatant(int life) {
        super(life);
    }

    public abstract int getDegat();

    public abstract void setDegat(int degat);

    public abstract int getDefence();

    public abstract void setDefence(int defence);
    
    public abstract int getTempsCreation();
}
