/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.sotino.entity;

/**
 *
 * @author Simon
 */
public abstract class Contructor extends Personnage {

    private double timePassed;
    private long timeNeed;
    private boolean constructing;

    public Contructor(int life) {
        super(life);
        constructing=false;
    }

    public boolean isConstructing() {
        return constructing;
    }

    public boolean finishConstruction(long delta) {
        if (constructing) {
            timePassed += (delta * (1 + getWorker()));
            constructing =!( timePassed >= timeNeed);
        }
        return !constructing;
    }

    public void statConstruction(int timeNeed) {
        this.timeNeed = timeNeed;
        this.timePassed = 0;
        constructing = true;
    }

    public int getProgression() {
        if(constructing){
            return (int)((timePassed*100)/timeNeed);
        }
        return 100;
    }
    
    

    public abstract int getWorker();
}
