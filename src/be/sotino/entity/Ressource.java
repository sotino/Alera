/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.sotino.entity;

/**
 *
 * @author g34771
 */
public class Ressource {

    private double wood;
    private double meet;
    private double gold;

    public Ressource(double wood, double meet, double gold) {
        this.wood = wood;
        this.meet = meet;
        this.gold = gold;
    }

    public double getWood() {
        return wood;
    }

    public double getMeet() {
        return meet;
    }

    public double getGold() {
        return gold;
    }

    public boolean pay(Ressource price) {
        if (this.gold >= price.gold && this.meet >= price.meet && this.wood >= price.wood) {
            gold -= price.gold;
            wood -= price.wood;
            meet -= price.meet;
            return true;
        }
        return false;
    }

    public void sell(Ressource price) {
        gold += price.gold;
        wood += price.wood;
        meet += price.meet;
    }

    public void add(Ressource price) {
        if (price.gold >= 0 && price.meet >= 0 && price.wood >= 0) {
            gold += price.gold;
            wood += price.wood;
            meet += price.meet;
        }
    }

    @Override
    public String toString() {
        return "{wood=" + wood + ", meet=" + meet + ", gold=" + gold + '}';
    }
}
