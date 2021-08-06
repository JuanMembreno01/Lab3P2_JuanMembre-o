/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3p2_juanmembreno;

/**
 *
 * @author usuario
 */
public class articulos extends tiendas {
    private String nombre;
    private String categ;
    private int precio;

    public articulos() {
    }

    public articulos(String nombre, String categ, int precio) {
        this.nombre = nombre;
        this.categ = categ;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCateg() {
        return categ;
    }

    public void setCateg(String categ) {
        this.categ = categ;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "articulos{" + "nombre=" + nombre + ", categ=" + categ + ", precio=" + precio + '}';
    }
    
}
