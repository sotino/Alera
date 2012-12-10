/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.sotino.entity;

/**
 *
 * @author g34771
 */
public class Centurion extends Contructor {
    private int nbPhalange;
    private int nbArcher;
    private int 

    public Centurion(int life) {
        super(life);
    }

    public void refreshFromDelta(long delta) {
        if (!isConstructing()) {
        } else {
            finishConstruction(delta);
        }
    }

    @Override
    public int getWorker() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
