/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.sotino.entity;

/**
 *
 * @author g34771
 */
public abstract class Personnage {
    private int life;
    public Personnage(int life) {
        this.life = life;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public abstract Ressource getPrice();
    
    
}
