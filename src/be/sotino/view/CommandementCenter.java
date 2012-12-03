/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.sotino.view;

import be.sotino.entity.Player;

/**
 *
 * @author Simon
 */
public class CommandementCenter extends javax.swing.JPanel {

    private Player player;

    /**
     * Creates new form CommandementCenter
     */
    public CommandementCenter() {
        initComponents();
    }

    public void setPlayer(Player player) {
        this.player = player;
        notifieChange();
    }

    public void notifieChange() {
        exploitantTf.setText("" + player.getExploitants().size());
        repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        exploitantTf = new javax.swing.JTextField();
        exploitantButton = new javax.swing.JButton();

        jLabel1.setText("Exploitant");

        exploitantTf.setText("999");

        exploitantButton.setText("Buy");
        exploitantButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exploitantButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addGap(16, 16, 16)
                .addComponent(exploitantTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exploitantButton)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(exploitantTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exploitantButton))
                .addContainerGap(31, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void exploitantButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exploitantButtonActionPerformed
        player.buyExploitant();
    }//GEN-LAST:event_exploitantButtonActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exploitantButton;
    private javax.swing.JTextField exploitantTf;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}