package GUI;

import kuusisto.tinysound.Music;
import kuusisto.tinysound.TinySound;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Smarty
 */
public class StartUpMenu extends javax.swing.JFrame {
	
    
        
    /**
     * Creates new form StartUpMenu
     */
    public StartUpMenu() {
        initComponents();
        this.setLocationRelativeTo(null);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        StartButton = new javax.swing.JButton();
        SettingButton = new javax.swing.JButton();
        CreditButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(800, 640));

        menuPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        menuPanel.setMinimumSize(new java.awt.Dimension(800, 640));
        menuPanel.setPreferredSize(new java.awt.Dimension(800, 640));
        menuPanel.setSize(new java.awt.Dimension(800, 640));
        menuPanel.setLayout(null);

        jLabel1.setFont(new java.awt.Font("VitaminTabletE", 0, 100)); // NOI18N
        jLabel1.setText("RabbyBana");
        menuPanel.add(jLabel1);
        jLabel1.setBounds(6, 6, 744, 100);

        jLabel4.setFont(new java.awt.Font("Marker Felt", 0, 24)); // NOI18N
        jLabel4.setText("The juker");
        menuPanel.add(jLabel4);
        jLabel4.setBounds(696, 118, 104, 27);

        jLabel3.setFont(new java.awt.Font("Wingdings 3", 3, 120)); // NOI18N
        jLabel3.setText("C");
        menuPanel.add(jLabel3);
        jLabel3.setBounds(322, 151, 107, 109);

        jLabel2.setFont(new java.awt.Font("Silom", 0, 48)); // NOI18N
        jLabel2.setText("hasing-game");
        menuPanel.add(jLabel2);
        jLabel2.setBounds(435, 202, 344, 62);

        StartButton.setFont(new java.awt.Font("Marker Felt", 0, 48)); // NOI18N
        StartButton.setText("Play");
        StartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartButtonActionPerformed(evt);
            }
        });
        menuPanel.add(StartButton);
        StartButton.setBounds(77, 312, 213, 64);

        SettingButton.setFont(new java.awt.Font("Marker Felt", 0, 48)); // NOI18N
        SettingButton.setText("Settings");
        SettingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SettingButtonActionPerformed(evt);
            }
        });
        menuPanel.add(SettingButton);
        SettingButton.setBounds(293, 382, 213, 64);

        CreditButton.setFont(new java.awt.Font("Marker Felt", 0, 48)); // NOI18N
        CreditButton.setText("Credit");
        CreditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreditButtonActionPerformed(evt);
            }
        });
        menuPanel.add(CreditButton);
        CreditButton.setBounds(508, 452, 213, 64);

        jLabel5.setIcon(new javax.swing.ImageIcon("/Users/Smarty/Desktop/startupmenu.gif")); // NOI18N
        jLabel5.setText("jLabel5");
        jLabel5.setBounds(new java.awt.Rectangle(0, 0, 800, 640));
        jLabel5.setMaximumSize(new java.awt.Dimension(800, 640));
        jLabel5.setMinimumSize(new java.awt.Dimension(800, 640));
        jLabel5.setPreferredSize(new java.awt.Dimension(800, 640));
        menuPanel.add(jLabel5);
        jLabel5.setBounds(0, 0, 800, 640);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void StartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartButtonActionPerformed
        new HowToPlay().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_StartButtonActionPerformed

    private void CreditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreditButtonActionPerformed
        new Credit().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CreditButtonActionPerformed

    private void SettingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SettingButtonActionPerformed
        new Settings().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SettingButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StartUpMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StartUpMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StartUpMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StartUpMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TinySound.init();
                new StartUpMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CreditButton;
    private javax.swing.JButton SettingButton;
    private javax.swing.JButton StartButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel menuPanel;
    // End of variables declaration//GEN-END:variables
}
