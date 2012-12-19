/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.sotino.entity.construction;

import be.sotino.entity.Ressource;
import be.sotino.entity.combatant.Archer;
import be.sotino.entity.combatant.Combatant;
import be.sotino.entity.combatant.Phalange;
import com.sun.jmx.remote.internal.ArrayQueue;
import java.util.AbstractQueue;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import sun.misc.Queue;

/**
 *
 * @author g34771
 */
public class Centurion extends Contructor {

    private static final int COMBATANT_MAX = 5;
    public static final Ressource CENTURION_PRICE = new Ressource(110, 50, 15);
    private List<Phalange> phalanges;
    private List<Archer> archers;
    private AbstractQueue<Combatant> aCreer;
    private Ressource playerRessource;
    private boolean creerUnit;
    private double timePassed;
    private long timeNeed;

    public Centurion(Ressource playerRessource) {
        super(10);
        this.playerRessource = playerRessource;
        phalanges = new ArrayList<Phalange>();
        archers = new ArrayList<Archer>();
        aCreer = new ArrayBlockingQueue<Combatant>(20);
        creerUnit = false;
    }

    public void refreshFromDelta(long delta) {
        if (isConstructing()) {
            finishConstruction(delta);
        } else {
            if (creerUnit) {
                timePassed += delta;
                if (timePassed >= timeNeed) {
                    Combatant recrue = aCreer.remove();
                    if (recrue instanceof Phalange) {
                        phalanges.add((Phalange) recrue);
                    } else if (recrue instanceof Archer) {
                        archers.add((Archer) recrue);
                    }
                    timePassed -= timeNeed;
                    creerUnit = false;
                }
            } else if (!aCreer.isEmpty()) {
                creerUnit = true;
                timeNeed = aCreer.element().getTempsCreation();
            }else{
                timePassed = 0;
            }
        }
    }

    public int getMaxCombatant() {
        int max;
        if (getConstructionLvl() == 1) {
            max = COMBATANT_MAX;
        } else {
            max = COMBATANT_MAX * (int) (getConstructionLvl() * getConstructionLvl()) / 2;
        }
        return max;
    }

    public int getNbCombatant() {
        return phalanges.size() + archers.size();
    }

    private boolean isFull() {
        return getNbCombatant() >= getMaxCombatant();
    }

    public void buyPhalange() {
        if (!isFull()) {
            if (playerRessource.pay(Phalange.PHALANGE_PRICE)) {
                aCreer.add(new Phalange());
            }
        }
    }

    public void buyArcher() {
        if (!isFull()) {
            if (playerRessource.pay(Archer.ARCHER_PRICE)) {
                aCreer.add(new Archer());
            }
        }
    }

    @Override
    public Ressource getPrice() {
        return CENTURION_PRICE;
    }
    
    
}
