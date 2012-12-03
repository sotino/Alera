/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.sotino.busness;

import be.sotino.view.PlayerView;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author g34771
 */
public class moteur implements Runnable {

    private PlayerView playerView;
    public Thread t;

    public moteur(PlayerView playerView) {
        this.playerView = playerView;
        t = new Thread(this);
        t.setPriority(Thread.MAX_PRIORITY);
        t.start();
        System.out.println(t.isAlive());
    }

    public void start() {
        t.start();
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("notify");
            playerView.notifyChange();
            try {
                t.sleep(10);
            } catch (InterruptedException ex) {
                Logger.getLogger(moteur.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
}
