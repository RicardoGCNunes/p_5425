/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package turnsform;

/**
 *
 * @author ART
 */
public class FTurnsInit extends javax.swing.JFrame {
    
    private String name;
    private String id;

    /**
     * Creates new form FTurnsInit
     */
    public FTurnsInit() {
        initComponents();
    }
    
    public FTurnsInit(String name, String id) {
        this.name = name;
        this.id = id;
        initComponents();
        this.labelID.setText(this.id);
        this.labelName.setText(this.name);
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
        jButtonInserir = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonListar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        labelID = new javax.swing.JLabel();
        labelName = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Gestão dos Turnos");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jButtonInserir.setText("Inserir Turno");
        getContentPane().add(jButtonInserir, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 120, -1));

        jButtonEliminar.setText("Eliminar Turno");
        getContentPane().add(jButtonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 120, -1));

        jButtonEditar.setText("Editar Turno");
        getContentPane().add(jButtonEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 120, -1));

        jButtonListar.setText("Listar Turno");
        getContentPane().add(jButtonListar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 120, -1));

        jLabel2.setText("Funcionário:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, -1, -1));

        jLabel3.setText("ID:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, -1, -1));

        labelID.setText("ID");
        getContentPane().add(labelID, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, -1, -1));

        labelName.setText("name");
        getContentPane().add(labelName, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonInserir;
    private javax.swing.JButton jButtonListar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel labelID;
    private javax.swing.JLabel labelName;
    // End of variables declaration//GEN-END:variables
}
