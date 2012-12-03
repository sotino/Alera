/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.sotino.busness;

import be.sotino.view.PlayerView;

/**
 *
 * @author g34771
 */
public class moteur implements Runnable{
    private PlayerView playerView;
    public Thread t;

    public moteur(PlayerView playerView) {
        this.playerView = playerView;
        t = new Thread(this);
        t.setPriority(Thread.MAX_PRIORITY);
        t.start();
    }
    
    
    @Override
    public void run() {
        System.out.println("notify");
        playerView.notifyChange();
    }
    
}
