/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3p2_juanmembreno;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class tiendas {
    private String  nombre;
    private String ubicacion;
    private int cantidadeemp;
    private String tiempoespera;
    private ArrayList<articulos>articulos=new ArrayList();

    public tiendas() {
    }

    public tiendas(String nombre, String ubicacion, int cantidadeemp, String tiempoespera,ArrayList articuloss) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.cantidadeemp = cantidadeemp;
        this.tiempoespera = tiempoespera;
        this.articulos=articulos;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getCantidadeemp() {
        return cantidadeemp;
    }

    public void setCantidadeemp(int cantidadeemp) {
        this.cantidadeemp = cantidadeemp;
    }

    public String getTiempoespera() {
        return tiempoespera;
    }

    public void setTiempoespera(String tiempoespera) {
        this.tiempoespera = tiempoespera;
    }

    public ArrayList<articulos> getArticulos() {
        return articulos;
    }

    public void setArticulos(ArrayList<articulos> articulos) {
        this.articulos = articulos;
    }

    
    @Override
    public String toString() {
        return "tiendas{" + "nombre=" + nombre + ", ubicacion=" + ubicacion + ", cantidadeemp=" + cantidadeemp + ", tiempoespera=" + tiempoespera + ", articulos=" + articulos + '}';
    }
            
}
