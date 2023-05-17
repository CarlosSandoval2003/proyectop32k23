/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//María José Véliz Ochoa 
//9959-21-5909
//daoVendedores

package Ventas.Modelo;

import Ventas.Controlador.clsCotizacion;
import Seguridad.Modelo.Conexion;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author maria
 */
public class daoCotizacion {
   private static final String SQL_SELECT = "SELECT clId, clNombre, cldireccion, cltelefono, clemail, clNit, clHaber, clDebe FROM tbl_cliente";
private static final String SQL_INSERT = "INSERT INTO tbl_cliente(clNombre, cldireccion, cltelefono, clemail, clNit, clHaber, clDebe) VALUES(?, ?, ?, ?, ?, ?, ?)";
private static final String SQL_UPDATE = "UPDATE tbl_cliente SET clNombre=?, cldireccion=?, cltelefono=?, clemail=?, clNit=?, clHaber=?, clDebe=? WHERE clId = ?";
private static final String SQL_DELETE = "DELETE FROM tbl_cliente WHERE clId=?";
private static final String SQL_SELECT_NOMBRE = "SELECT clId, clNombre, cldireccion, cltelefono, clemail, clNit, clHaber, clDebe FROM tbl_cliente WHERE clNombre = ?";
private static final String SQL_SELECT_ID = "SELECT clId, clNombre, cldireccion, cltelefono, clemail, clNit, clHaber, clDebe FROM tbl_cliente WHERE clId = ?";

public List<clsCotizacion> consultaCliente() {

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        

        List<clsCotizacion> clientes = new ArrayList<>();

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {

                int Id = rs.getInt("proCodigo");
                String Nombre = rs.getString("proNombre");
                double Haber = rs.getDouble("proPrecios");
                int Debe = rs.getInt("proExistencias");
                
                clsCotizacion cliente = new clsCotizacion();
                cliente.setIdCliente(Id);
                cliente.setNombreCliente(Nombre);
                cliente.setHaberCliente(Haber);
                cliente.setDebeCliente(Debe);
                clientes.add(cliente);

            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }

        return clientes;
    }

}
 
