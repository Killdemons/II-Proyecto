/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ii.proyecto;

import javax.swing.JOptionPane;

/**
 *
 * @author bcamp
 */
public class piscina extends javax.swing.JFrame {

    public piscina() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblnada5 = new javax.swing.JLabel();
        lblnada4 = new javax.swing.JLabel();
        lblnada3 = new javax.swing.JLabel();
        lblnada2 = new javax.swing.JLabel();
        lblnada1 = new javax.swing.JLabel();
        lblPiscina = new javax.swing.JLabel();
        btnInicio = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        btnrepetir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtpPorcentaje = new javax.swing.JTextArea();
        player5CHK = new javax.swing.JCheckBox();
        player4CHK = new javax.swing.JCheckBox();
        player2CHK = new javax.swing.JCheckBox();
        player1CHK = new javax.swing.JCheckBox();
        player3CHK = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblnada5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ii/proyecto/eeee.jpg"))); // NOI18N
        getContentPane().add(lblnada5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 470, -1, -1));

        lblnada4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ii/proyecto/dddd.jpg"))); // NOI18N
        getContentPane().add(lblnada4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 470, -1, -1));

        lblnada3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ii/proyecto/cccc.jpg"))); // NOI18N
        getContentPane().add(lblnada3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 470, -1, -1));

        lblnada2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ii/proyecto/bbbb.jpg"))); // NOI18N
        getContentPane().add(lblnada2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, -1, -1));

        lblnada1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ii/proyecto/aaaa.jpg"))); // NOI18N
        getContentPane().add(lblnada1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 20, -1));

        lblPiscina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ii/proyecto/zzzz.jpg"))); // NOI18N
        getContentPane().add(lblPiscina, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, -1));

        btnInicio.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnInicio.setText("Inicar");
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });
        getContentPane().add(btnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 100, 40));

        btnAtras.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnAtras.setText("Atras");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 400, 120, 40));

        txtArea.setEditable(false);
        txtArea.setColumns(20);
        txtArea.setRows(5);
        jScrollPane1.setViewportView(txtArea);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 200, 140));

        btnrepetir.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnrepetir.setText("Repetir ");
        btnrepetir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrepetirActionPerformed(evt);
            }
        });
        getContentPane().add(btnrepetir, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, 120, 40));

        txtpPorcentaje.setColumns(20);
        txtpPorcentaje.setRows(5);
        jScrollPane2.setViewportView(txtpPorcentaje);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 200, 120));

        player5CHK.setText("Player5");
        getContentPane().add(player5CHK, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, -1, -1));

        player4CHK.setText("Player4");
        getContentPane().add(player4CHK, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 400, -1, -1));

        player2CHK.setText("Player2");
        getContentPane().add(player2CHK, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, -1, -1));

        player1CHK.setText("Player1");
        getContentPane().add(player1CHK, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, -1, -1));

        player3CHK.setText("Player3");
        getContentPane().add(player3CHK, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        btnInicio.setEnabled(false);
        btnrepetir.setEnabled(true);
        int ALTO = 504;
        int contJuegos=0;
        int cont1 = 0;
        int cont2 = 0;
        int cont3 = 0;
        int cont4 = 0;
        int cont5 = 0;
        System.out.println("****************PARTIDA"+contJuegos+++"***********************");
        comienzo_hilos nadador1_hilos = new comienzo_hilos(5, ALTO, lblnada1, txtArea);
        comienzo_hilos2 nadador2_hilos = new comienzo_hilos2(37, ALTO, lblnada2, txtArea);
        comienzo_hilos3 nadador3_hilos = new comienzo_hilos3(69, ALTO, lblnada3, txtArea);
        comienzo_hilos4 nadador4_hilos = new comienzo_hilos4(101, ALTO, lblnada4, txtArea);
        comienzo_hilos5 nadador5_hilos = new comienzo_hilos5(133, ALTO, lblnada5, txtArea);
        int jug1, jug2, jug3, jug4, jug5, opcion ;
        
//***********************************************************************************************************************************
//                                                      PLAYERS
        if (player1CHK.isSelected()){
            nadador1_hilos.start();            
        }
        if (player2CHK.isSelected()){
            nadador2_hilos.start();
        }
        if (player3CHK.isSelected()){
            nadador3_hilos.start();
        }
        if (player4CHK.isSelected()){
            nadador4_hilos.start();
        }
        if (player5CHK.isSelected()){
            nadador5_hilos.start();
        }
        
        
       if (comienzo_hilos.T1>(comienzo_hilos2.T2 || comienzo_hilos3.T3 || comienzo_hilos4.T4 || comienzo_hilos5.T5  )){
            cont1++;
       }
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        Menu obj = new Menu();
        obj.setVisible(true);           
        dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnrepetirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrepetirActionPerformed
        btnInicio.setEnabled(true);
        btnrepetir.setEnabled(false);
        
        
        
        
    }//GEN-LAST:event_btnrepetirActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(piscina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new piscina().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnrepetir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblPiscina;
    private javax.swing.JLabel lblnada1;
    private javax.swing.JLabel lblnada2;
    private javax.swing.JLabel lblnada3;
    private javax.swing.JLabel lblnada4;
    private javax.swing.JLabel lblnada5;
    private javax.swing.JCheckBox player1CHK;
    private javax.swing.JCheckBox player2CHK;
    private javax.swing.JCheckBox player3CHK;
    private javax.swing.JCheckBox player4CHK;
    private javax.swing.JCheckBox player5CHK;
    private javax.swing.JTextArea txtArea;
    private javax.swing.JTextArea txtpPorcentaje;
    // End of variables declaration//GEN-END:variables
}