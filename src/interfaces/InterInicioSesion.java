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
public class InterInicioSesion extends javax.swing.JFrame {

    /**
     * Creates new form EscolyInicioSesion
     */
    public InterInicioSesion() {
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

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        IngreDirec = new javax.swing.JLabel();
        IngreTut = new javax.swing.JLabel();
        IngreProf = new javax.swing.JLabel();
        RegreMain = new javax.swing.JLabel();
        Olvido = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(560, 240));
        setMaximumSize(new java.awt.Dimension(850, 480));
        setMinimumSize(new java.awt.Dimension(850, 480));
        setPreferredSize(new java.awt.Dimension(850, 480));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Rockwell", 2, 24)); // NOI18N
        jLabel1.setText("INICIO DE SESION");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, -1, -1));

        jLabel2.setFont(new java.awt.Font("Rockwell", 2, 18)); // NOI18N
        jLabel2.setText("FAVOR DE INGRESAR TUS DATOS");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, -1, -1));

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 270, -1));

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, 270, -1));

        jLabel3.setText("CORREO");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 170, -1, -1));

        jLabel4.setText("CONTRASEÑA");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, -1, -1));

        IngreDirec.setFont(new java.awt.Font("Rockwell", 2, 14)); // NOI18N
        IngreDirec.setText("INGRESAR COMO DIRECCION");
        IngreDirec.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IngreDirecMouseClicked(evt);
            }
        });
        getContentPane().add(IngreDirec, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, -1, -1));

        IngreTut.setFont(new java.awt.Font("Rockwell", 2, 14)); // NOI18N
        IngreTut.setText("INGRESAR COMO TUTOR");
        IngreTut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IngreTutMouseClicked(evt);
            }
        });
        getContentPane().add(IngreTut, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 380, -1, -1));

        IngreProf.setFont(new java.awt.Font("Rockwell", 2, 14)); // NOI18N
        IngreProf.setText("INGRESAR COMO PROFESOR");
        IngreProf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IngreProfMouseClicked(evt);
            }
        });
        getContentPane().add(IngreProf, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 380, -1, -1));

        RegreMain.setFont(new java.awt.Font("Rockwell", 2, 14)); // NOI18N
        RegreMain.setText("REGRESAR");
        RegreMain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegreMainMouseClicked(evt);
            }
        });
        getContentPane().add(RegreMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 20, -1, -1));

        Olvido.setText("OLVIDÉ CONTRASEÑA");
        Olvido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OlvidoMouseClicked(evt);
            }
        });
        getContentPane().add(Olvido, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void IngreDirecMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IngreDirecMouseClicked
        InterDireccion EsDir = new InterDireccion();
        EsDir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_IngreDirecMouseClicked

    private void IngreTutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IngreTutMouseClicked
        InterTutor EsTut = new InterTutor();
        EsTut.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_IngreTutMouseClicked

    private void IngreProfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IngreProfMouseClicked
        InterProfesor EsPro = new InterProfesor();
        EsPro.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_IngreProfMouseClicked

    private void RegreMainMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegreMainMouseClicked
        InterMain EsInter = new InterMain();
        EsInter.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_RegreMainMouseClicked

    private void OlvidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OlvidoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_OlvidoMouseClicked

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IngreDirec;
    private javax.swing.JLabel IngreProf;
    private javax.swing.JLabel IngreTut;
    private javax.swing.JLabel Olvido;
    private javax.swing.JLabel RegreMain;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
