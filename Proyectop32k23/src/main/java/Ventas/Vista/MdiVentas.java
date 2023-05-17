/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventas.Vista;

import java.awt.Dimension;
import javax.swing.JOptionPane;

/**
 *
 * @author visitante
 */
public class MdiVentas extends javax.swing.JFrame {

    /**
     * Creates new form MdiGeneral
     */
    public MdiVentas() {
        initComponents();
        setLocationRelativeTo(null);
        this.setExtendedState(MdiVentas.MAXIMIZED_BOTH);
        this.setTitle("Menu Gestión de Ventas");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1MdiVentas = new javax.swing.JMenuItem();
        jMenuItem2MdiVentas = new javax.swing.JMenuItem();
        jMenuItem4MdiVentas = new javax.swing.JMenuItem();
        jCheckBoxMenuItem1MdiVentas = new javax.swing.JCheckBoxMenuItem();
        jMenu1MdiVentas = new javax.swing.JMenu();
        jDesktopPaneVentas = new javax.swing.JDesktopPane();
        mnuGeneralVentas = new javax.swing.JMenuBar();
        mnuArchivoVentas = new javax.swing.JMenu();
        mnuSalirSistemaVentas = new javax.swing.JCheckBoxMenuItem();
        mnuCatalogosVentas = new javax.swing.JMenu();
        mnuCatalogosMantenimientosVentas = new javax.swing.JMenu();
        mantenimientoClientes = new javax.swing.JCheckBoxMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        mnuProcesosVentas = new javax.swing.JMenu();
        mnuConsultasVentas = new javax.swing.JMenu();
        mnuReportesVentas = new javax.swing.JMenu();
        mnuAyudasVentas = new javax.swing.JMenu();

        jMenuItem1MdiVentas.setText("jMenuItem1");

        jMenuItem2MdiVentas.setText("jMenuItem2");

        jMenuItem4MdiVentas.setText("jMenuItem4");

        jCheckBoxMenuItem1MdiVentas.setSelected(true);
        jCheckBoxMenuItem1MdiVentas.setText("jCheckBoxMenuItem1");

        jMenu1MdiVentas.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jDesktopPaneVentasLayout = new javax.swing.GroupLayout(jDesktopPaneVentas);
        jDesktopPaneVentas.setLayout(jDesktopPaneVentasLayout);
        jDesktopPaneVentasLayout.setHorizontalGroup(
            jDesktopPaneVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDesktopPaneVentasLayout.setVerticalGroup(
            jDesktopPaneVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        mnuArchivoVentas.setText("Archivo");
        mnuArchivoVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuArchivoVentasActionPerformed(evt);
            }
        });

        mnuSalirSistemaVentas.setSelected(true);
        mnuSalirSistemaVentas.setText("Salir del Sistema");
        mnuSalirSistemaVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSalirSistemaVentasActionPerformed(evt);
            }
        });
        mnuArchivoVentas.add(mnuSalirSistemaVentas);

        mnuGeneralVentas.add(mnuArchivoVentas);

        mnuCatalogosVentas.setText("Catalogos");

        mnuCatalogosMantenimientosVentas.setText("Mantenimientos");
        mnuCatalogosMantenimientosVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCatalogosMantenimientosVentasActionPerformed(evt);
            }
        });

        mantenimientoClientes.setSelected(true);
        mantenimientoClientes.setText("Mantenimiento Clientes");
        mantenimientoClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mantenimientoClientesActionPerformed(evt);
            }
        });
        mnuCatalogosMantenimientosVentas.add(mantenimientoClientes);

        jMenuItem3.setText("Mantenimineto tiendas");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        mnuCatalogosMantenimientosVentas.add(jMenuItem3);

        jMenuItem1.setText("Mantenimiento Vendedores");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        mnuCatalogosMantenimientosVentas.add(jMenuItem1);

        mnuCatalogosVentas.add(mnuCatalogosMantenimientosVentas);

        mnuGeneralVentas.add(mnuCatalogosVentas);

        mnuProcesosVentas.setText("Procesos");
        mnuGeneralVentas.add(mnuProcesosVentas);

        mnuConsultasVentas.setText("Consultas");
        mnuConsultasVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuConsultasVentasActionPerformed(evt);
            }
        });
        mnuGeneralVentas.add(mnuConsultasVentas);

        mnuReportesVentas.setText("Reportes");
        mnuGeneralVentas.add(mnuReportesVentas);

        mnuAyudasVentas.setText("Ayudas");
        mnuGeneralVentas.add(mnuAyudasVentas);

        setJMenuBar(mnuGeneralVentas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPaneVentas)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPaneVentas)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuCatalogosMantenimientosVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCatalogosMantenimientosVentasActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_mnuCatalogosMantenimientosVentasActionPerformed

    private void mnuArchivoVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuArchivoVentasActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_mnuArchivoVentasActionPerformed

    private void mnuSalirSistemaVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSalirSistemaVentasActionPerformed
        // TODO add your handling code here:
                /*===== OPERACIÓN CERRAR SESIÓN ====
          Variable entera respuesta_cs*/

        int respuesta_cs = JOptionPane.showConfirmDialog(this, "¿Desea Cerrar Sesión?", "Cerrar Sesión",            JOptionPane.YES_NO_OPTION);

        if (respuesta_cs == 0) {
            this.dispose();
        }        
    }//GEN-LAST:event_mnuSalirSistemaVentasActionPerformed

    private void mantenimientoClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mantenimientoClientesActionPerformed
        // TODO add your handling code here:
        frmMantenimientoClientes ventana = new frmMantenimientoClientes();
        jDesktopPaneVentas.add(ventana);
        Dimension desktopSize = jDesktopPaneVentas.getSize();
        Dimension FrameSize = ventana.getSize();
        ventana.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.             height) / 2);       
    }//GEN-LAST:event_mantenimientoClientesActionPerformed

    private void mnuConsultasVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuConsultasVentasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuConsultasVentasActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        frmMantenimientotiendas ventana = new frmMantenimientotiendas();
        jDesktopPaneVentas.add(ventana);
        Dimension desktopSize = jDesktopPaneVentas.getSize();
        Dimension FrameSize = ventana.getSize();
        ventana.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.             height) / 2);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        frmMantenimientoVendedores ventana = new frmMantenimientoVendedores();
        jDesktopPaneVentas.add(ventana);
        Dimension desktopSize = jDesktopPaneVentas.getSize();
        Dimension FrameSize = ventana.getSize();
        ventana.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.             height) / 2);
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(MdiVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MdiVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MdiVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MdiVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MdiVentas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1MdiVentas;
    private javax.swing.JDesktopPane jDesktopPaneVentas;
    private javax.swing.JMenu jMenu1MdiVentas;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem1MdiVentas;
    private javax.swing.JMenuItem jMenuItem2MdiVentas;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4MdiVentas;
    private javax.swing.JCheckBoxMenuItem mantenimientoClientes;
    private javax.swing.JMenu mnuArchivoVentas;
    private javax.swing.JMenu mnuAyudasVentas;
    private javax.swing.JMenu mnuCatalogosMantenimientosVentas;
    private javax.swing.JMenu mnuCatalogosVentas;
    private javax.swing.JMenu mnuConsultasVentas;
    private javax.swing.JMenuBar mnuGeneralVentas;
    private javax.swing.JMenu mnuProcesosVentas;
    private javax.swing.JMenu mnuReportesVentas;
    private javax.swing.JCheckBoxMenuItem mnuSalirSistemaVentas;
    // End of variables declaration//GEN-END:variables
}
