/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.sotino.entity;

import be.sotino.entity.construction.Exploitant;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author g34771
 */
public class Player extends Personnage {

    private Ressource ressource;
    private List<Exploitant> exploitants;

    public Player() {
        super(250);
        ressource = new Ressource(200, 200, 0);
        exploitants = new ArrayList<Exploitant>();
    }

    public Ressource getRessource() {
        return ressource;
    }
    
    public void buyExploitant(){
        if (ressource.pay(Exploitant.EXPLOITANT_PRICE)) {
            exploitants.add(new Exploitant(ressource));
        }
    }

    public List<Exploitant> getExploitants() {
        return exploitants;
    }

    @Override
    public Ressource getPrice() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    
}
