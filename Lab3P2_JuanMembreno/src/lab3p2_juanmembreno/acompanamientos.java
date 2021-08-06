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
public class acompanamientos extends comidas {
    private String nombre;
    private String tipo;
    private int precio;

    public acompanamientos() {
    }

    public acompanamientos(String nombre, String tipo, int precio) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "acompanamientos{" + "nombre=" + nombre + ", tipo=" + tipo + ", precio=" + precio + '}';
    }
    
}
