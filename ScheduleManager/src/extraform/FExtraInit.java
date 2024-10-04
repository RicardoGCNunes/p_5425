/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package extraform;

/**
 *
 * @author ART
 */
public class FExtraInit extends javax.swing.JFrame {
    
    private String name;
    private String id;
    
    /**
     * Creates new form FExtraInit
     */
    public FExtraInit() {
        initComponents();
    }
    
    public FExtraInit(String name, String id) {
        this.name = name;
        this.id = id;
        initComponents();
        labelName.setText(name);
        labelID.setText(id);
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
        btnInsert = new javax.swing.JButton();
        btnEliminate = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnList = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        labelID = new javax.swing.JLabel();
        labelName = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Gestão de Horas Extra");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        btnInsert.setText("Inserir Horas Extra");
        btnInsert.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInsertMouseClicked(evt);
            }
        });
        getContentPane().add(btnInsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 160, -1));

        btnEliminate.setText("Eliminar Horas Extra");
        btnEliminate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminateMouseClicked(evt);
            }
        });
        getContentPane().add(btnEliminate, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 160, -1));

        btnEdit.setText("Editar Horas Extra");
        btnEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditMouseClicked(evt);
            }
        });
        getContentPane().add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 160, -1));

        btnList.setText("Listar Horas Extra");
        btnList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnListMouseClicked(evt);
            }
        });
        getContentPane().add(btnList, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 160, -1));

        jLabel3.setText("ID:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, -1, -1));

        labelID.setText("ID");
        getContentPane().add(labelID, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, -1, -1));

        labelName.setText("name");
        getContentPane().add(labelName, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, -1, -1));

        jLabel2.setText("Funcionário:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInsertMouseClicked
        FExtraInsert fei = new FExtraInsert(name, id);
        fei.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnInsertMouseClicked

    private void btnEliminateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminateMouseClicked
        FExtraEliminate fee = new FExtraEliminate(name, id);
        fee.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnEliminateMouseClicked

    private void btnEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditMouseClicked
        FExtraEdit fee = new FExtraEdit(name, id);
        fee.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnEditMouseClicked

    private void btnListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnListMouseClicked
        FExtraList fel = new FExtraList(name, id);
        fel.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnListMouseClicked

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
            java.util.logging.Logger.getLogger(FExtraInit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FExtraInit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FExtraInit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FExtraInit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FExtraInit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnEliminate;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel labelID;
    private javax.swing.JLabel labelName;
    // End of variables declaration//GEN-END:variables
}
