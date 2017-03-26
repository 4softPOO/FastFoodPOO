/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fastfood.vista;

/**
 *
 * @author Manuel
 */
public class pagos extends javax.swing.JFrame {

    /**
     * Creates new form pagos
     */
    public pagos() {
        initComponents();
        labelCuotas.setVisible(false);
        textCuotas.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        grupoTipoPago = new javax.swing.ButtonGroup();
        grupoPago = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        optCredito = new javax.swing.JRadioButton();
        optDebito = new javax.swing.JRadioButton();
        optEfectivo = new javax.swing.JRadioButton();
        textCuotas = new javax.swing.JTextField();
        labelCuotas = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("PAGAR");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 256, -1, -1));

        jButton3.setText("CANCELAR");
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 256, -1, -1));

        grupoPago.add(optCredito);
        optCredito.setText("Tarjeta de credito");
        optCredito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optCreditoActionPerformed(evt);
            }
        });
        getContentPane().add(optCredito, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        grupoPago.add(optDebito);
        optDebito.setText("Tarjeta debito");
        optDebito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optDebitoActionPerformed(evt);
            }
        });
        getContentPane().add(optDebito, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        grupoPago.add(optEfectivo);
        optEfectivo.setText("Efectivo");
        optEfectivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optEfectivoActionPerformed(evt);
            }
        });
        getContentPane().add(optEfectivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        textCuotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCuotasActionPerformed(evt);
            }
        });
        getContentPane().add(textCuotas, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 100, 90, -1));

        labelCuotas.setText("Numero de cuotas");
        getContentPane().add(labelCuotas, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 90, 20));

        jLabel1.setText("Seleccionar tipo de pago");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 26, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fastfood/imagenes/fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void optCreditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optCreditoActionPerformed
        if(optCredito.isSelected()){
            labelCuotas.setVisible(true);
            labelCuotas.setVisible(true);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_optCreditoActionPerformed

    private void textCuotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCuotasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textCuotasActionPerformed

    private void optDebitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optDebitoActionPerformed
        if(optDebito.isSelected()){
        labelCuotas.setVisible(false);
        textCuotas.setVisible(false);
        }
            
        // TODO add your handling code here:
    }//GEN-LAST:event_optDebitoActionPerformed

    private void optEfectivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optEfectivoActionPerformed
        if(optEfectivo.isSelected()){
            labelCuotas.setVisible(false);
        textCuotas.setVisible(false);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_optEfectivoActionPerformed

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
            java.util.logging.Logger.getLogger(pagos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pagos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pagos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pagos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pagos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup grupoPago;
    private javax.swing.ButtonGroup grupoTipoPago;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel labelCuotas;
    private javax.swing.JRadioButton optCredito;
    private javax.swing.JRadioButton optDebito;
    private javax.swing.JRadioButton optEfectivo;
    private javax.swing.JTextField textCuotas;
    // End of variables declaration//GEN-END:variables
}