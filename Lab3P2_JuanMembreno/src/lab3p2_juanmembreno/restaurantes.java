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
public class restaurantes {
    private String ubicacion;
    private String nombre;
    private String rtn;
    private String slogan;
    private ArrayList<comidas>comidas=new ArrayList();

    public restaurantes(String ubicacion, String nombre, String rtn, String slogan,ArrayList comidas) {
        this.ubicacion = ubicacion;
        this.nombre = nombre;
        this.rtn = rtn;
        this.slogan = slogan;
        this.comidas= comidas;
    }

    public restaurantes() {
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRtn() {
        return rtn;
    }

    public void setRtn(String rtn) {
        this.rtn = rtn;
    }

    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    public ArrayList<comidas> getComidas() {
        return comidas;
    }

    public void setComidas(ArrayList<comidas> comidas) {
        this.comidas = comidas;
    }

  

    @Override
    public String toString() {
        return "restaurantes{" + "ubicacion=" + ubicacion + ", nombre=" + nombre + ", rtn=" + rtn + ", slogan=" + slogan + ", comidas=" + comidas + '}';
    }
    
}
