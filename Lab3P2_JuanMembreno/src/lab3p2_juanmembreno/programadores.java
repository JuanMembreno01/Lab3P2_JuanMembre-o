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
public class programadores {
      private String nombre;
    private String apellido;
    private int id;
    private String puesto;
    private String anos;
    private int salario;
    private String lenguaje;
    private int horaseetrabajo;
    private String  usuario;
    private String contrasena;

    public programadores() {
    }

    public programadores(String nombre, String apellido, int id, String puesto, String anos, int salario, String lenguaje, int horaseetrabajo, String usuario, String contrasena) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.puesto = puesto;
        this.anos = anos;
        this.salario = salario;
        this.lenguaje = lenguaje;
        this.horaseetrabajo = horaseetrabajo;
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

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getAnos() {
        return anos;
    }

    public void setAnos(String anos) {
        this.anos = anos;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public String getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }

    public int getHoraseetrabajo() {
        return horaseetrabajo;
    }

    public void setHoraseetrabajo(int horaseetrabajo) {
        this.horaseetrabajo = horaseetrabajo;
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
        return "programadores{" + "nombre=" + nombre + ", apellido=" + apellido + ", id=" + id + ", puesto=" + puesto + ", anos=" + anos + ", salario=" + salario + ", lenguaje=" + lenguaje + ", horaseetrabajo=" + horaseetrabajo + ", usuario=" + usuario + ", contrasena=" + contrasena + '}';
    }
    
}
