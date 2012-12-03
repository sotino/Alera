/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.sotino;

import be.sotino.busness.moteur;
import be.sotino.entity.Player;
import be.sotino.view.PlayerView;

/**
 *
 * @author g34771
 */
public class Alera {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Player me = new Player();
        PlayerView fr = new PlayerView(me);
        moteur m = new moteur(fr);
        while(m.t.isAlive());
        System.out.println("death");
        
    }
}

        /*
        int max;
        for (int i = 1; i < 5; i++) {
            max = isFullCollon(i, i);
            double nbExploitation = 60. / max;
            Ressource p = new Ressource(0, 0, 0);
            double tot = 0;
            if (i == 1) {
                 p = new Ressource(100 * nbExploitation, 25 * nbExploitation, 0 * nbExploitation);
                 tot = 100 * nbExploitation+ 25 * nbExploitation+ 0 * nbExploitation;
            } else if (i == 2) {
                 p = new Ressource(175 * nbExploitation, 40 * nbExploitation, 25 * nbExploitation);
                 tot = (175 * nbExploitation+ 40 * nbExploitation+ 25 * nbExploitation);
            } else if (i == 3) {
                 p = new Ressource(350 * nbExploitation, 100 * nbExploitation, 50 * nbExploitation);
                 tot = (350 * nbExploitation+ 100 * nbExploitation+ 50 * nbExploitation);
            } else if (i == 4) {
                 p = new Ressource(625 * nbExploitation, 150 * nbExploitation, 45 * nbExploitation);
                 tot = (625 * nbExploitation+ 150 * nbExploitation+ 45 * nbExploitation);
            }
            //multiplier les prix par l'indice d'augmentation de vitesse de recolte
            System.out.println("lvl =" + i + " - max=" + max + " - nbExpl=" + nbExploitation + " - Price=" + p+" - tot="+tot);
        }
    }
    // TODO code application logic here

    private static int isFullCollon(int lvl, double taux) {
        int max = 5;
        if (lvl != 1) {
            max = 5 * (int) (lvl * taux) / 2;
        }
        return max;
    }
}
*/