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
   private static final String SQL_SELECT = "SELECT proCodigo, proNombre, proPrecios, proExistencias FROM tbl_productos";


public List<clsCotizacion> consultaProducto() {

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        

        List<clsCotizacion> productos = new ArrayList<>();

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {

                int Id = rs.getInt("proCodigo");
                String Nombre = rs.getString("proNombre");
                double Precio = rs.getDouble("proPrecios");
                int Existencias = rs.getInt("proExistencias");
                
                clsCotizacion producto = new clsCotizacion();
                producto.setIdProducto(Id);
                producto.setNombreProducto(Nombre);
                producto.setPrecioProducto(Precio);
                producto.setExistenciaProducto(Existencias);
                productos.add(producto);

            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }

        return productos;
    }

}
 
