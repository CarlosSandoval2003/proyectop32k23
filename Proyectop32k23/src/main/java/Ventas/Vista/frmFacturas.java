/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventas.Vista;


import Seguridad.Controlador.clsBitacora;
import Ventas.Controlador.clsFacturas;
import Seguridad.Controlador.clsUsuarioConectado;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author visitante
 */
public class frmFacturas extends javax.swing.JInternalFrame {

    public void llenadoDeCombos() {
        /*EmpleadoDAO empleadoDAO = new EmpleadoDAO();
        List<Empleado> empleados = empleadoDAO.select();
        cbox_empleado.addItem("Seleccione una opción");
        for (int i = 0; i < empleados.size(); i++) {
            cbox_empleado.addItem(empleados.get(i).getNombreEmpleado());
        } */
    }


    private DefaultTableModel modeloTabla;
    
    public frmFacturas() {
        initComponents();
        cargarComboBox();
        modeloTabla = (DefaultTableModel) tblFacActual.getModel();
        llenadoDeTablasProductos();
        llenadoDeCombos();
    }

    int codigoAplicacion = 3004;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb2Factura = new javax.swing.JLabel();
        lbusuFactura = new javax.swing.JLabel();
        jScrollPane1Facturas = new javax.swing.JScrollPane();
        jTable1Facturas = new javax.swing.JTable();
        lbCodProdFac = new javax.swing.JLabel();
        lbCotActual = new javax.swing.JLabel();
        lbCantProdFac = new javax.swing.JLabel();
        lbTotalFac = new javax.swing.JLabel();
        txtTotalFac = new javax.swing.JTextField();
        btnAgregarFac = new javax.swing.JButton();
        txtCodProdFac = new javax.swing.JTextField();
        btnModificarFac = new javax.swing.JButton();
        txtCantProdFac = new javax.swing.JTextField();
        btnEliminarFac = new javax.swing.JButton();
        jScrollPaneCotActual = new javax.swing.JScrollPane();
        tblFacActual = new javax.swing.JTable();
        jScrollPaneProdDispCot = new javax.swing.JScrollPane();
        tblProdDispFac = new javax.swing.JTable();
        lbCantProdFac1 = new javax.swing.JLabel();
        txtIdClienteFac = new javax.swing.JTextField();
        txtIdVendedorFac = new javax.swing.JTextField();
        btnRegistrarFac = new javax.swing.JButton();
        lbInstFac = new javax.swing.JLabel();
        lbIdClienteFac = new javax.swing.JLabel();
        lbIdVendedorFac = new javax.swing.JLabel();
        lbIdTiendaFac = new javax.swing.JLabel();
        cbxIdTiendaFac = new javax.swing.JComboBox<>();
        lbDescProdFac = new javax.swing.JLabel();
        cbxDescFac = new javax.swing.JComboBox<>();

        lb2Factura.setForeground(new java.awt.Color(204, 204, 204));
        lb2Factura.setText(".");

        jTable1Facturas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1Facturas.setViewportView(jTable1Facturas);

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Facturas");
        setVisible(true);

        lbCodProdFac.setText("Codigo del Producto:");

        lbCotActual.setText("Factura Actual:");

        lbCantProdFac.setText("Cantidad del Producto:");

        lbTotalFac.setText("TOTAL DE LA FACTURA:");

        txtTotalFac.setEditable(false);

        btnAgregarFac.setText("Agregar");
        btnAgregarFac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarFacActionPerformed(evt);
            }
        });

        btnModificarFac.setText("Modificar");
        btnModificarFac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarFacActionPerformed(evt);
            }
        });

        btnEliminarFac.setText("Eliminar");
        btnEliminarFac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarFacActionPerformed(evt);
            }
        });

        tblFacActual.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo Producto", "Cantidad", "Descuento", "Impuesto", "SubTotal"
            }
        ));
        jScrollPaneCotActual.setViewportView(tblFacActual);

        tblProdDispFac.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPaneProdDispCot.setViewportView(tblProdDispFac);

        lbCantProdFac1.setText("Productos Disponibles:");

        btnRegistrarFac.setText("Facturar");
        btnRegistrarFac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarFacActionPerformed(evt);
            }
        });

        lbInstFac.setText("Para registrar esta factura debes ingresar los siguientes datos:");

        lbIdClienteFac.setText("ID del Cliente:");

        lbIdVendedorFac.setText("ID del Vendedor:");

        lbIdTiendaFac.setText("Tienda:");

        lbDescProdFac.setText("Descuento Aplicado:");

        cbxDescFac.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0.0", "0.15", "0.25", "0.50", "0.75", "0.95" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbInstFac)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbIdClienteFac)
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCodProdFac, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtIdClienteFac, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbxIdTiendaFac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbxDescFac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbIdTiendaFac)
                            .addComponent(lbCodProdFac)
                            .addComponent(lbDescProdFac))
                        .addGap(247, 247, 247)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbCantProdFac1)
                        .addGap(174, 174, 174))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnModificarFac)
                                .addGap(100, 100, 100)
                                .addComponent(btnEliminarFac)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbIdVendedorFac)
                                    .addComponent(lbCantProdFac))
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCantProdFac, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtIdVendedorFac, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                                .addComponent(jScrollPaneProdDispCot, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37))))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPaneCotActual, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(125, 125, 125)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnRegistrarFac)
                                    .addComponent(txtTotalFac, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(108, 108, 108)
                                .addComponent(lbTotalFac))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(313, 313, 313)
                        .addComponent(lbCotActual))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(btnAgregarFac)))
                .addContainerGap(213, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(lbInstFac)
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbCantProdFac1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIdClienteFac, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbIdClienteFac)
                            .addComponent(txtIdVendedorFac, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbIdVendedorFac))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbIdTiendaFac)
                            .addComponent(cbxIdTiendaFac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbCodProdFac)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtCodProdFac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbCantProdFac)
                                .addComponent(txtCantProdFac, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPaneProdDispCot, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDescProdFac)
                    .addComponent(cbxDescFac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarFac)
                    .addComponent(btnModificarFac)
                    .addComponent(btnEliminarFac))
                .addGap(12, 12, 12)
                .addComponent(lbCotActual)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPaneCotActual, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(29, 29, 29))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbTotalFac)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTotalFac, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(btnRegistrarFac)
                        .addContainerGap(260, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarFacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarFacActionPerformed
        // TODO add your handling code here:
int codigoProducto = Integer.parseInt(txtCodProdFac.getText());

// Lógica para buscar y eliminar la fila en la JTable
DefaultTableModel model = (DefaultTableModel) tblFacActual.getModel();
int rowCount = model.getRowCount();
double suma = 0.0; // Variable para almacenar la suma de los subtotales
boolean codigoEncontrado = false; // Variable para indicar si se encuentra el código en la tabla

for (int i = 0; i < rowCount; i++) {
    int codigo = (int) model.getValueAt(i, 0); // Obtener el valor de la columna "Codigo Producto"

    if (codigo == codigoProducto) {
        model.removeRow(i); // Eliminar la fila si se encuentra una coincidencia
        rowCount--; // Reducir el número de filas después de eliminar una fila
        i--; // Decrementar el índice para evitar saltar la siguiente fila en la iteración
        codigoEncontrado = true; // Marcar el código como encontrado
    } else {
        double subtotal = (double) model.getValueAt(i, 4); // Obtener el valor del subtotal
        suma += subtotal; // Sumar el subtotal a la suma
    }

}
if (!codigoEncontrado) {
    JOptionPane.showMessageDialog(null, "No existe este código en tu cotización actual", "Error", JOptionPane.ERROR_MESSAGE);
}
txtTotalFac.setText(String.valueOf(suma));
limpiarTextos(); 

    }//GEN-LAST:event_btnEliminarFacActionPerformed

     public void llenadoDeTablasProductos() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("proCodigo");
        modelo.addColumn("proNombre");
        modelo.addColumn("proPrecios");
        modelo.addColumn("proExistencias");
        clsFacturas producto = new clsFacturas();
        //VendedorDAO vendedorDAO = new VendedorDAO();
        List<clsFacturas> listaProductos = producto.getListadoProductos();
        tblProdDispFac.setModel(modelo);
        String[] dato = new String[4];
        for (int i = 0; i < listaProductos.size(); i++) {
            dato[0] = Integer.toString(listaProductos.get(i).getIdProducto());
            dato[1] = listaProductos.get(i).getNombreProducto();
            dato[2] = Double.toString(listaProductos.get(i).getPrecioProducto());
            dato[3] = Double.toString(listaProductos.get(i).getExistenciaProducto());
            modelo.addRow(dato);
        }              


    }
     
     private void cargarComboBox() {
    clsFacturas perfilUsuario = new clsFacturas();
    ArrayList<String> nombresUsuarios = perfilUsuario.obtenerNombresUsuarios();

    nombresUsuarios.forEach(nombreUsuario -> {
        cbxIdTiendaFac.addItem(nombreUsuario);
        });
}

    private void btnModificarFacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarFacActionPerformed
        // TODO add your handling code here:
        
        // Obtener los datos ingresados
        int codigoProducto = Integer.parseInt(txtCodProdFac.getText());
        int nuevaCantidad = Integer.parseInt(txtCantProdFac.getText());
        clsFacturas cotizacion = new clsFacturas();
        Double descuento = Double.valueOf((String) cbxDescFac.getSelectedItem());
        Double impuesto = 0.12;
        
// Verificar si el código de producto existe en la tabla de cotización
        boolean productoEncontrado = false;
        int filaModificar = -1;
        for (int i = 0; i < modeloTabla.getRowCount(); i++) {
            int codigo = (int) modeloTabla.getValueAt(i, 0);
            if (codigo == codigoProducto) {
                productoEncontrado = true;
                filaModificar = i;
                break;
            }
        }
        if (productoEncontrado) {
                // Actualizar el subtotal y el total
            if (cotizacion.verificarExistencias(codigoProducto) >= nuevaCantidad) {
                double precio = cotizacion.obtenerPrecioProducto(codigoProducto);
                double sumaProd = (precio * nuevaCantidad);
                double sumaImp = sumaProd + (sumaProd * impuesto);
                double sumaSubTotal = sumaImp - (sumaImp * descuento);
                
                // Actualizar la cantidad en la fila correspondiente
                modeloTabla.setValueAt(nuevaCantidad, filaModificar, 1);
                modeloTabla.setValueAt(descuento, filaModificar, 2);
                // Actualizar el subtotal en la fila correspondiente
                modeloTabla.setValueAt(sumaSubTotal, filaModificar, 4);
                
               // Actualizar el total
                double suma = 0.0;
                int columnaSubTotal = 4;
                int filas = tblFacActual.getRowCount();
                
                for (int i = 0; i < filas; i++) {
                    double valor = (double) tblFacActual.getValueAt(i, columnaSubTotal);
                    suma += valor;
                }
                
                txtTotalFac.setText(String.valueOf(suma));
            }else {
                JOptionPane.showMessageDialog(null, "El producto no tiene existencias.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }else {
            JOptionPane.showMessageDialog(null, "El código de producto no existe en la cotización actual.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        limpiarTextos(); 
        
    }//GEN-LAST:event_btnModificarFacActionPerformed
   public void limpiarTextos()
    {
        txtCantProdFac.setText("");
        txtCodProdFac.setText("");
    }
   
      public void limpiarTextosCliente()
    {
        txtIdClienteFac.setText("");
        txtIdVendedorFac.setText("");
    }

//María José Véliz Ochoa 
//9959-21-5909

    private void btnAgregarFacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarFacActionPerformed
int codigoProducto = Integer.parseInt(txtCodProdFac.getText());
    int cantidad = Integer.parseInt(txtCantProdFac.getText());
    double descuento = Double.valueOf((String) cbxDescFac.getSelectedItem());
    double impuesto = 0.12;
    
    clsFacturas cotizacion = new clsFacturas();
    
    // Verificar si el producto ya está registrado en la tabla
    boolean productoExistente = false;
    int filas = tblFacActual.getRowCount();
    for (int i = 0; i < filas; i++) {
        int codigo = (int) tblFacActual.getValueAt(i, 0);
        if (codigo == codigoProducto) {
            productoExistente = true;
            break;
        }
    }
    
    if (productoExistente) {
        JOptionPane.showMessageDialog(this, "Este Producto ya está registrado, puedes intentar MODIFICAR.");
    } else if (cotizacion.verificarExistencias(codigoProducto) >= cantidad) {
        double precio = cotizacion.obtenerPrecioProducto(codigoProducto);
        double sumaProd = (precio * cantidad);
        double impuestocalculado = sumaProd * impuesto;
        double sumaImp = sumaProd + (impuestocalculado);
        double descuentocalculado = sumaImp * descuento;
        double sumaSubTotal = sumaImp - (descuentocalculado);
        
        // Agregar los datos a la tabla
        Object[] fila = {codigoProducto, cantidad, descuentocalculado, impuestocalculado, sumaSubTotal};
        modeloTabla.addRow(fila);

        double suma = 0.0;
        int columnaSubTotal = 4; 

        filas = tblFacActual.getRowCount();
        for (int i = 0; i < filas; i++) {
            double valor = (double) tblFacActual.getValueAt(i, columnaSubTotal);
            suma += valor;
        }
        
        txtTotalFac.setText(String.valueOf(suma));
    } else {
        JOptionPane.showMessageDialog(this, "El producto no existe o no tiene existencias.");
    }
    
    limpiarTextos();
    }//GEN-LAST:event_btnAgregarFacActionPerformed

    private void btnRegistrarFacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarFacActionPerformed
        // TODO add your handling code here:
        
        
        
        DefaultTableModel modelo = (DefaultTableModel) tblFacActual.getModel();
                    if (txtIdClienteFac.getText().isEmpty() || txtIdVendedorFac.getText().isEmpty() || modelo.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "No se ha ingresado la información necesaria", "Error", JOptionPane.ERROR_MESSAGE);
            return;
            }
        clsFacturas cotizacion = new clsFacturas();
        int idCliente = Integer.parseInt(txtIdClienteFac.getText());
                int idVendedor = Integer.parseInt(txtIdVendedorFac.getText());
                double totalCotizacion = Double.parseDouble(txtTotalFac.getText());
                LocalDate fechaActual = LocalDate.now();
                Double descuento = Double.valueOf((String) cbxDescFac.getSelectedItem());
                String nombretienda = (String) cbxIdTiendaFac.getSelectedItem();
                // Registrar en la tabla tbl_cotizacion
                cotizacion.registrarCotizacion(idCliente, idVendedor, nombretienda, fechaActual, totalCotizacion);
                
                // Obtener el último valor agregado en la columna cotid de tbl_cotizacion
                int cotizacionId = cotizacion.obtenerUltimoIdCotizacion();
                
                // Obtener los datos de la JTable tblCotActual y registrar en tbl_cotdetalle
                cotizacion.registrarCotizacionDetalle(cotizacionId, modelo, descuento);
                limpiarTextos();
                limpiarTextosCliente();
                int rowCount = modelo.getRowCount();
                for (int i = 0; i < rowCount; i++) {
                modelo.removeRow(i); // Eliminar la fila si se encuentra una coincidencia
                rowCount--; // Reducir el número de filas después de eliminar una fila
                i--; // Decrementar el índice para evitar saltar la siguiente fila en la iteración
                }
                
                txtTotalFac.setText("");
                int resultadoBitacora=0;
                    clsBitacora bitacoraRegistro = new clsBitacora();
                    resultadoBitacora = bitacoraRegistro.setIngresarBitacora(clsUsuarioConectado.getIdUsuario(),codigoAplicacion,"INS"); 
                JOptionPane.showMessageDialog(null, "Factura #" + cotizacionId + " ha sido registrada con éxito", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                
    }//GEN-LAST:event_btnRegistrarFacActionPerformed
         
    


    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarFac;
    private javax.swing.JButton btnEliminarFac;
    private javax.swing.JButton btnModificarFac;
    private javax.swing.JButton btnRegistrarFac;
    private javax.swing.JComboBox<String> cbxDescFac;
    private javax.swing.JComboBox<String> cbxIdTiendaFac;
    private javax.swing.JScrollPane jScrollPane1Facturas;
    private javax.swing.JScrollPane jScrollPaneCotActual;
    private javax.swing.JScrollPane jScrollPaneProdDispCot;
    private javax.swing.JTable jTable1Facturas;
    private javax.swing.JLabel lb2Factura;
    private javax.swing.JLabel lbCantProdFac;
    private javax.swing.JLabel lbCantProdFac1;
    private javax.swing.JLabel lbCodProdFac;
    private javax.swing.JLabel lbCotActual;
    private javax.swing.JLabel lbDescProdFac;
    private javax.swing.JLabel lbIdClienteFac;
    private javax.swing.JLabel lbIdTiendaFac;
    private javax.swing.JLabel lbIdVendedorFac;
    private javax.swing.JLabel lbInstFac;
    private javax.swing.JLabel lbTotalFac;
    private javax.swing.JLabel lbusuFactura;
    private javax.swing.JTable tblFacActual;
    private javax.swing.JTable tblProdDispFac;
    private javax.swing.JTextField txtCantProdFac;
    private javax.swing.JTextField txtCodProdFac;
    private javax.swing.JTextField txtIdClienteFac;
    private javax.swing.JTextField txtIdVendedorFac;
    private javax.swing.JTextField txtTotalFac;
    // End of variables declaration//GEN-END:variables


}