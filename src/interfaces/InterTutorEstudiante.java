/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author ing_a
 */
public class InterTutorEstudiante extends javax.swing.JFrame {

    /**
     * Creates new form EscolyTutorEstudiante
     */
    public InterTutorEstudiante() {
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

        jLabel1 = new javax.swing.JLabel();
        RegreTut = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        NomAlu = new javax.swing.JTextField();
        GrupoAlu = new javax.swing.JTextField();
        ApePatAlu = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ApeMatAlu = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        ProAlu = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(560, 240));
        setMaximumSize(new java.awt.Dimension(850, 480));
        setMinimumSize(new java.awt.Dimension(850, 480));
        setPreferredSize(new java.awt.Dimension(850, 480));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Rockwell", 2, 18)); // NOI18N
        jLabel1.setText("INFORMACION DEL ESTUDIANTE");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, -1, -1));

        RegreTut.setText("REGRESAR");
        RegreTut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegreTutMouseClicked(evt);
            }
        });
        getContentPane().add(RegreTut, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 20, -1, -1));

        jLabel2.setText("NOMBRE:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, -1, -1));

        jLabel3.setText("GRUPO:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, -1, -1));

        jLabel4.setText("APELLIDO PATERNO");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, -1, -1));

        NomAlu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomAluActionPerformed(evt);
            }
        });
        getContentPane().add(NomAlu, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 260, -1));

        GrupoAlu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GrupoAluActionPerformed(evt);
            }
        });
        getContentPane().add(GrupoAlu, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 270, 260, -1));

        ApePatAlu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApePatAluActionPerformed(evt);
            }
        });
        getContentPane().add(ApePatAlu, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, 260, -1));

        jLabel5.setText("APELLIDO MATERNO");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, -1, -1));

        ApeMatAlu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApeMatAluActionPerformed(evt);
            }
        });
        getContentPane().add(ApeMatAlu, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, 260, -1));

        jLabel6.setText("PROFESOR:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, -1, -1));

        ProAlu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProAluActionPerformed(evt);
            }
        });
        getContentPane().add(ProAlu, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, 260, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegreTutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegreTutMouseClicked
        InterTutor EsTut = new InterTutor();
        EsTut.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_RegreTutMouseClicked

    private void NomAluActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomAluActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomAluActionPerformed

    private void GrupoAluActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GrupoAluActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GrupoAluActionPerformed

    private void ApePatAluActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApePatAluActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ApePatAluActionPerformed

    private void ApeMatAluActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApeMatAluActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ApeMatAluActionPerformed

    private void ProAluActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProAluActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProAluActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ApeMatAlu;
    private javax.swing.JTextField ApePatAlu;
    private javax.swing.JTextField GrupoAlu;
    private javax.swing.JTextField NomAlu;
    private javax.swing.JTextField ProAlu;
    private javax.swing.JLabel RegreTut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
