/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventas.Vista;


import Seguridad.Controlador.clsBitacora;
import Ventas.Controlador.clsCotizacion;
import Seguridad.Controlador.clsUsuarioConectado;
import Ventas.Controlador.clsPedidos;
import Ventas.Controlador.clsFacturas;
import Ventas.Controlador.clsTienda;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import java.io.File;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import javax.swing.AbstractCellEditor;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

/**
 *
 * @author visitante
 */
public class frmConsultaFacturas extends javax.swing.JInternalFrame {

    public void llenadoDeCombos() {
        /*EmpleadoDAO empleadoDAO = new EmpleadoDAO();
        List<Empleado> empleados = empleadoDAO.select();
        cbox_empleado.addItem("Seleccione una opción");
        for (int i = 0; i < empleados.size(); i++) {
            cbox_empleado.addItem(empleados.get(i).getNombreEmpleado());
        } */
    }


    private DefaultTableModel modeloTabla;
    
    public frmConsultaFacturas() {
        initComponents();
        llenadoDeTablasCotizaciones();
        llenadoDeCombos();
    }

    int codigoAplicacion = 3007;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb2PedCons = new javax.swing.JLabel();
        lbusuPedCons = new javax.swing.JLabel();
        jScrollPane1PedCons = new javax.swing.JScrollPane();
        jTable1PedCons = new javax.swing.JTable();
        jScrollPanePedReg = new javax.swing.JScrollPane();
        tblFacConsulta = new javax.swing.JTable();
        lbPedReg = new javax.swing.JLabel();
        btnVerDetalleFac = new javax.swing.JButton();
        lbInsPedReg = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        lb2PedCons.setForeground(new java.awt.Color(204, 204, 204));
        lb2PedCons.setText(".");

        jTable1PedCons.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1PedCons.setViewportView(jTable1PedCons);

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Pedidos");
        setVisible(true);

        tblFacConsulta.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPanePedReg.setViewportView(tblFacConsulta);

        lbPedReg.setText("Pedidos Registrados:");

        btnVerDetalleFac.setText("Ver Detalle");
        btnVerDetalleFac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerDetalleFacActionPerformed(evt);
            }
        });

        lbInsPedReg.setText("Haz clic en el pedido que quieras trabajar, luego presiona un botón:");

        jButton1.setText("Devolucion");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(394, 394, 394)
                .addComponent(lbPedReg)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbInsPedReg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPanePedReg, javax.swing.GroupLayout.DEFAULT_SIZE, 572, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnVerDetalleFac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(123, 123, 123))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbPedReg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(lbInsPedReg)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPanePedReg, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(btnVerDetalleFac)
                        .addGap(73, 73, 73)
                        .addComponent(jButton1)))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerDetalleFacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerDetalleFacActionPerformed
        // TODO add your handling code here:
        
// Crea una instancia de FrmConsultaCotizacionDetalle
                int filaSeleccionada = tblFacConsulta.getSelectedRow();
                int cotidSeleccionado = Integer.valueOf(tblFacConsulta.getValueAt(filaSeleccionada, 0).toString());
                frmConsultaFacturaDetalle frmConsulta = new frmConsultaFacturaDetalle(cotidSeleccionado);

                // Agrega el FrmConsultaCotizacionDetalle al JDesktopPane
                JDesktopPane desktopPane = getDesktopPane();
                desktopPane.add(frmConsulta);
                frmConsulta.setVisible(true);
                frmConsulta.toFront();
                int resultadoBitacora=0;
                    clsBitacora bitacoraRegistro = new clsBitacora();
                    resultadoBitacora = bitacoraRegistro.setIngresarBitacora(clsUsuarioConectado.getIdUsuario(),codigoAplicacion,"QRY"); 

    }//GEN-LAST:event_btnVerDetalleFacActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int filaSeleccionada = tblFacConsulta.getSelectedRow();
        int cotidSeleccionado = Integer.valueOf(tblFacConsulta.getValueAt(filaSeleccionada, 0).toString());
        int clienteidselect = Integer.valueOf(tblFacConsulta.getValueAt(filaSeleccionada, 2).toString());
        clsFacturas frmConsulta = new clsFacturas();
        frmConsulta.CancelarPedido(cotidSeleccionado, clienteidselect);
        DefaultTableModel model = (DefaultTableModel) tblFacConsulta.getModel();
        model.setRowCount(0); // Eliminar todas las filas actuales de la tabla
        llenadoDeTablasCotizaciones();
        int resultadoBitacora=0;
        clsBitacora bitacoraRegistro = new clsBitacora();
        resultadoBitacora = bitacoraRegistro.setIngresarBitacora(clsUsuarioConectado.getIdUsuario(),codigoAplicacion,"DEL");
    }//GEN-LAST:event_jButton1ActionPerformed

     public void llenadoDeTablasCotizaciones() {
        DefaultTableModel modelo = new DefaultTableModel(){
            public boolean isCellEditable(int row, int column) {
                return false; // Desactivar la edición de las celdas
            }
        };
        modelo.addColumn("Id Factura");
        modelo.addColumn("Id Pedido");
        modelo.addColumn("Id Cliente");
        modelo.addColumn("Id Vendedor");
        modelo.addColumn("Id Tienda");
        modelo.addColumn("Fecha");
        modelo.addColumn("Total");
        clsFacturas cotizacion = new clsFacturas();
        //VendedorDAO vendedorDAO = new VendedorDAO();
        List<clsFacturas> listaCotizaciones = cotizacion.getListadoCotizaciones();
        tblFacConsulta.setModel(modelo);
        String[] dato = new String[7];
        for (int i = 0; i < listaCotizaciones.size(); i++) {
            dato[0] = Integer.toString(listaCotizaciones.get(i).getIdFactura());
            dato[1] = Integer.toString(listaCotizaciones.get(i).getIdPedido());
            dato[2] = Integer.toString(listaCotizaciones.get(i).getIdCliente());
            dato[3] = Integer.toString(listaCotizaciones.get(i).getIdVendedor());
            dato[4] = Integer.toString(listaCotizaciones.get(i).getIdTienda());
            dato[5] = listaCotizaciones.get(i).getFechaFactura();
            dato[6] = Double.toString(listaCotizaciones.get(i).getTotalFactura());
            modelo.addRow(dato);
        }              

                    

}
    
public int obtenerCotidSeleccionado() {
    int filaSeleccionada = tblFacConsulta.getSelectedRow();
    int cotidSeleccionado = (int) tblFacConsulta.getValueAt(filaSeleccionada, 0);
    return cotidSeleccionado;
}

public int obtenerClienteidSeleccionado() {
    int filaSeleccionada = tblFacConsulta.getSelectedRow();
    int cotidSeleccionado = (int) tblFacConsulta.getValueAt(filaSeleccionada, 2);
    return cotidSeleccionado;
}


    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVerDetalleFac;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1PedCons;
    private javax.swing.JScrollPane jScrollPanePedReg;
    private javax.swing.JTable jTable1PedCons;
    private javax.swing.JLabel lb2PedCons;
    private javax.swing.JLabel lbInsPedReg;
    private javax.swing.JLabel lbPedReg;
    private javax.swing.JLabel lbusuPedCons;
    private javax.swing.JTable tblFacConsulta;
    // End of variables declaration//GEN-END:variables


}