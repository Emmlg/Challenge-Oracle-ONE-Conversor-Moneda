/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mx.conversor.GUI;

import java.awt.BorderLayout;



/**
 *
 * @author Emmanuel lopez
 */
public class RunMain extends javax.swing.JFrame {
    
    public RunMain() {
      initComponents();
      
        callCambio("moneda");
      
    }
    
    
    private void callCambio(String quien){
        
     ConversorUniversal panel1 = new ConversorUniversal(quien);
       
        contenedor.removeAll();
       // jp_Menu.setVisible(true);
        panel1.setVisible(true);
        contenedor.add(panel1);
        contenedor.add(jp_Menu,BorderLayout.SOUTH);
        contenedor.validate();
  
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedor = new javax.swing.JPanel();
        jp_Menu = new javax.swing.JPanel();
        bttn_moneda = new javax.swing.JButton();
        bttn_temperatura = new javax.swing.JButton();
        lb_linkedin = new javax.swing.JLabel();
        lb_github = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 675));

        contenedor.setBackground(new java.awt.Color(152, 175, 189));
        contenedor.setPreferredSize(new java.awt.Dimension(820, 700));
        contenedor.setLayout(new java.awt.BorderLayout());

        jp_Menu.setBackground(new java.awt.Color(43, 84, 115));

        bttn_moneda.setBackground(new java.awt.Color(255, 255, 255));
        bttn_moneda.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        bttn_moneda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Mx.Conversor.Img/camMon64x64.png"))); // NOI18N
        bttn_moneda.setText("Monedas");
        bttn_moneda.setBorderPainted(false);
        bttn_moneda.setHideActionText(true);
        bttn_moneda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttn_monedaActionPerformed(evt);
            }
        });

        bttn_temperatura.setBackground(new java.awt.Color(255, 255, 255));
        bttn_temperatura.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        bttn_temperatura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Mx.Conversor.Img/temperatura64x64.png"))); // NOI18N
        bttn_temperatura.setText("Temperatura");
        bttn_temperatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttn_temperaturaActionPerformed(evt);
            }
        });

        lb_linkedin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Mx.Conversor.Img/linkedin32x32.png"))); // NOI18N

        lb_github.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Mx.Conversor.Img/github32x32.png"))); // NOI18N

        javax.swing.GroupLayout jp_MenuLayout = new javax.swing.GroupLayout(jp_Menu);
        jp_Menu.setLayout(jp_MenuLayout);
        jp_MenuLayout.setHorizontalGroup(
            jp_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_MenuLayout.createSequentialGroup()
                .addContainerGap(103, Short.MAX_VALUE)
                .addComponent(bttn_moneda, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(bttn_temperatura, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(lb_linkedin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lb_github)
                .addGap(27, 27, 27))
        );
        jp_MenuLayout.setVerticalGroup(
            jp_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_MenuLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jp_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_MenuLayout.createSequentialGroup()
                        .addGroup(jp_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bttn_moneda)
                            .addComponent(bttn_temperatura))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_MenuLayout.createSequentialGroup()
                        .addGroup(jp_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_linkedin)
                            .addComponent(lb_github))
                        .addGap(23, 23, 23))))
        );

        contenedor.add(jp_Menu, java.awt.BorderLayout.PAGE_END);

        getContentPane().add(contenedor, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bttn_monedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttn_monedaActionPerformed

        callCambio("moneda");       
    }//GEN-LAST:event_bttn_monedaActionPerformed

    private void bttn_temperaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttn_temperaturaActionPerformed

        callCambio("temperatura");
    }//GEN-LAST:event_bttn_temperaturaActionPerformed

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
            java.util.logging.Logger.getLogger(RunMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RunMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RunMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RunMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RunMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttn_moneda;
    private javax.swing.JButton bttn_temperatura;
    private javax.swing.JPanel contenedor;
    private javax.swing.JPanel jp_Menu;
    private javax.swing.JLabel lb_github;
    private javax.swing.JLabel lb_linkedin;
    // End of variables declaration//GEN-END:variables
}
