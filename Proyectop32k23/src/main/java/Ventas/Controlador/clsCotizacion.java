/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//Meyglin del Rosario Rosales Ochoa 
// 9959 - 21 - 4490 

package Ventas.Controlador;
import java.util.List;
import Ventas.Modelo.daoCotizacion;
/**
 *
 * @author visitante
 */

public class clsCotizacion {
private int IdProducto;
    private String NombreProducto;
    private Double PrecioProducto;
    private int ExistenciaProducto;

    public clsCotizacion() {
    }

    public clsCotizacion(int IdCliente) {
        this.IdProducto = IdCliente;
    }

    public clsCotizacion(String NombreCliente, double PrecioProducto, int ExistenciaProducto) {
        this.NombreProducto = NombreCliente;
        this.PrecioProducto = PrecioProducto;
        this.ExistenciaProducto = ExistenciaProducto;
    }

    public clsCotizacion(int IdCliente, String NombreCliente, double PrecioProducto, int ExistenciaProducto) {
        this.IdProducto = IdCliente;
        this.NombreProducto = NombreCliente;
        this.PrecioProducto = PrecioProducto;
        this.ExistenciaProducto = ExistenciaProducto;
    }

    public int getIdCliente() {
        return IdProducto;
    }

    public void setIdCliente(int IdCliente) {
        this.IdProducto = IdCliente;
    }

    public String getNombreCliente() {
        return NombreProducto;
    }

    public void setNombreCliente(String NombreCliente) {
        this.NombreProducto = NombreCliente;
    }


public Double getHaberCliente() {
    return PrecioProducto;
}

public void setHaberCliente(Double HaberCliente) {
    this.PrecioProducto = HaberCliente;
}

public int getDebeCliente() {
    return ExistenciaProducto;
}


public void setDebeCliente(int DebeCliente) {
    this.ExistenciaProducto = DebeCliente;
}


    @Override
    public String toString() {
        return "clsCotizacion{" + "IdProducto=" + IdProducto + ", NombreProducto=" + NombreProducto + ", PrecioProducto=" + PrecioProducto + ", ExistenciaProducto=" + ExistenciaProducto + '}';
    }
    //Metodos de acceso a la capa controlador
 
    public List<clsCotizacion> getListadoClientes()
    {
        daoCotizacion daocliente = new daoCotizacion();
        List<clsCotizacion> listadoClientes = daocliente.consultaCliente();
        return listadoClientes;
    }
    
                  
}
