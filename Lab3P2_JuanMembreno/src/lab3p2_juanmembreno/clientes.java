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
public class clientes {
      private String nombre;
    private String apellido;
    private int id;
    private String domicilio;
    private int cantidaddeordenes;
    private String  usuario;
    private String contrasena;

    public clientes() {
    }

    public clientes(String nombre, String apellido, int id, String domicilio, int cantidaddeordenes, String usuario, String contrasena) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.domicilio = domicilio;
        this.cantidaddeordenes = cantidaddeordenes;
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getCantidaddeordenes() {
        return cantidaddeordenes;
    }

    public void setCantidaddeordenes(int cantidaddeordenes) {
        this.cantidaddeordenes = cantidaddeordenes;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    @Override
    public String toString() {
        return "clientes{" + "nombre=" + nombre + ", apellido=" + apellido + ", id=" + id + ", domicilio=" + domicilio + ", cantidaddeordenes=" + cantidaddeordenes + ", usuario=" + usuario + ", contrasena=" + contrasena + '}';
    }
    
}
