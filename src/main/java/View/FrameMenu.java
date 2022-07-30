/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

/**
 *
 * @author user
 */
public class FrameMenu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public FrameMenu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGestionarCandidato = new javax.swing.JButton();
        buttonInscripcionVotante = new javax.swing.JButton();
        buttonGestionarElecciones = new javax.swing.JButton();
        buttonVotar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        buttonResultados = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));

        buttonGestionarCandidato.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonGestionarCandidato.setText("Gestionar Candidatos");
        buttonGestionarCandidato.setName(""); // NOI18N
        buttonGestionarCandidato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGestionarCandidatoActionPerformed(evt);
            }
        });

        buttonInscripcionVotante.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonInscripcionVotante.setText("Inscripción Votantes");
        buttonInscripcionVotante.setName(""); // NOI18N
        buttonInscripcionVotante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonInscripcionVotanteActionPerformed(evt);
            }
        });

        buttonGestionarElecciones.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonGestionarElecciones.setText("Gestionar Elecciones");
        buttonGestionarElecciones.setName(""); // NOI18N
        buttonGestionarElecciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGestionarEleccionesActionPerformed(evt);
            }
        });

        buttonVotar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonVotar.setLabel("Votar");
        buttonVotar.setName(""); // NOI18N
        buttonVotar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVotarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Sistema de Elecciones Grupo 10");

        buttonResultados.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonResultados.setText("Resultados");
        buttonResultados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonResultadosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonGestionarCandidato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonGestionarElecciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonInscripcionVotante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonVotar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(59, 59, 59))
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonResultados, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(186, 186, 186))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonGestionarCandidato, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonInscripcionVotante, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonGestionarElecciones, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonVotar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(buttonResultados, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonGestionarCandidatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGestionarCandidatoActionPerformed
        // TODO add your handling code here:
        FrameGestionCandidato gestorCandidato = new FrameGestionCandidato();
        gestorCandidato.setLocationRelativeTo(this);
        gestorCandidato.setVisible(true);
    }//GEN-LAST:event_buttonGestionarCandidatoActionPerformed

    private void buttonInscripcionVotanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonInscripcionVotanteActionPerformed
        // TODO add your handling code here:
         FrameGestionVotantes gestorVotante = new FrameGestionVotantes();
        gestorVotante.setLocationRelativeTo(this);
        gestorVotante.setVisible(true);
    }//GEN-LAST:event_buttonInscripcionVotanteActionPerformed

    private void buttonGestionarEleccionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGestionarEleccionesActionPerformed
        // TODO add your handling code here:
        FrameGestionEleccion gestorEleccion = new FrameGestionEleccion();
        gestorEleccion.setLocationRelativeTo(this);
        gestorEleccion.setVisible(true);
    }//GEN-LAST:event_buttonGestionarEleccionesActionPerformed

    private void buttonVotarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVotarActionPerformed
        // TODO add your handling code here:
        FrameVotar Votar = new FrameVotar();
        Votar.setLocationRelativeTo(this);
        Votar.setVisible(true);
    }//GEN-LAST:event_buttonVotarActionPerformed

    private void buttonResultadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonResultadosActionPerformed
        // TODO add your handling code here:
        FrameResultados Resultados = new FrameResultados();
        Resultados.setLocationRelativeTo(this);
        Resultados.setVisible(true);
        
    }//GEN-LAST:event_buttonResultadosActionPerformed

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
            java.util.logging.Logger.getLogger(FrameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonGestionarCandidato;
    private javax.swing.JButton buttonGestionarElecciones;
    private javax.swing.JButton buttonInscripcionVotante;
    private javax.swing.JButton buttonResultados;
    private javax.swing.JButton buttonVotar;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
