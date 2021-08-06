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
public class comidas extends restaurantes {
    private int id;
    private String nombre;
    private int precio;
    private int cantdeacompanamientos;
    private ArrayList<acompanamientos>acompanamientos=new ArrayList();

    public comidas() {
    }

    public comidas(int id, String nombre, int precio, int cantdeacompanamientos) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantdeacompanamientos = cantdeacompanamientos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantdeacompanamientos() {
        return cantdeacompanamientos;
    }

    public void setCantdeacompanamientos(int cantdeacompanamientos) {
        this.cantdeacompanamientos = cantdeacompanamientos;
    }

    public ArrayList<acompanamientos> getAcompanamientos() {
        return acompanamientos;
    }

    public void setAcompanamientos(ArrayList<acompanamientos> acompanamientos) {
        this.acompanamientos = acompanamientos;
    }

   

    @Override
    public String toString() {
        return "comidas{" + "id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", cantdeacompanamientos=" + cantdeacompanamientos + ", acompanamientos=" + acompanamientos + '}';
    }
    
}
