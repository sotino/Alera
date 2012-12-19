/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.sotino.entity.combatant;

/**
 *
 * @author Simon
 */
public abstract class RangingUnit extends Combatant {

    public RangingUnit(int life) {
        super(life);
    }
 
    public abstract int getRange();
    public abstract void setRange(int range);
}
