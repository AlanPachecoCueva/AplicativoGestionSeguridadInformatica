/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

import Clases.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author josue
 */
public class Listar extends javax.swing.JFrame {

    /**
     * Creates new form Listar
     */
    public Listar() {
        initComponents();
        
        DefaultTableModel modeloTabla = new DefaultTableModel();
        
        ArrayList<Object> columnasModel = new ArrayList<Object>();
        
        columnasModel.add("Nombre");
        columnasModel.add("Código Activo");
        columnasModel.add("Tipo");
        columnasModel.add("Tipo Tag");
        columnasModel.add("Tag");
        columnasModel.add("Disponibilidad");
        columnasModel.add("Integridad");
        columnasModel.add("Condifencialidad");
        columnasModel.add("Valoración");
        
        for(Object columna : columnasModel){
            modeloTabla.addColumn(columna);
        }
        
        
        
        List<Activo> activosGuardados = GuardadoDatos.getActivos();
        
        ArrayList<List<String>> activosParaMostrar = new ArrayList<List<String>>(); 
        
        /*String nombreActivo, TipoDeActivo tipoActivo, Tag tagActivo, ValoracionCorta disponibilidad, ValoracionCorta integridad, ValoracionLarga confidencialidad*/
        
        for(Activo activo : activosGuardados){
            List<String> nuevo = new ArrayList<String>();
            nuevo.add(activo.getNombreActivo());
            nuevo.add(activo.getCodigoActivo());
            nuevo.add(activo.getTipoActivo().toString());
            nuevo.add(activo.getTagActivo().returnTypeOfTag());
            nuevo.add(activo.getTagActivo().getTag());
            nuevo.add(activo.getDisponibilidad().toString());
            nuevo.add(activo.getIntegridad().toString());
            nuevo.add(activo.getConfidencialidad().toString());
            nuevo.add(String.valueOf(activo.calcularValoracion()));
            
            
            activosParaMostrar.add(nuevo);
        }
        
        for(List<String> lista : activosParaMostrar){
            Object[] ingreso = lista.toArray();
            
           modeloTabla.addRow(ingreso);
        }
        
        this.tablaActivos.setModel(modeloTabla);
        tablaActivos.setAutoCreateRowSorter(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaActivos = new javax.swing.JTable();
        btnRegresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 551));
        setPreferredSize(new java.awt.Dimension(1000, 588));
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 588));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaActivos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablaActivos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 64, 860, 460));

        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/atras.png"))); // NOI18N
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 46, -1));

        jLabel1.setText("Activos Registrados");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        Inicio inicio = new Inicio();

        inicio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

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
            java.util.logging.Logger.getLogger(Listar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Listar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Listar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Listar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Listar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaActivos;
    // End of variables declaration//GEN-END:variables
}
