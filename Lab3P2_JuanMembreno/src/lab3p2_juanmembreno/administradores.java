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
public class administradores {

    private String nombre;
    private String apellido;
    private int id;
    private String puesto;
    private String anos;
    private int salario;
    private int anosexperincia;
    private String  usuario;
    private String contrasena;

    public administradores() {
    }

    public administradores(String nombre, String apellido, int id, String puesto, String anos, int salario, int anosexperincia, String usuario, String contrasena) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.puesto = puesto;
        this.anos = anos;
        this.salario = salario;
        this.anosexperincia = anosexperincia;
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

    public int getAnosexperincia() {
        return anosexperincia;
    }

    public void setAnosexperincia(int anosexperincia) {
        this.anosexperincia = anosexperincia;
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
        return "administradores{" + "nombre=" + nombre + ", apellido=" + apellido + ", id=" + id + ", puesto=" + puesto + ", anos=" + anos + ", salario=" + salario + ", anosexperincia=" + anosexperincia + ", usuario=" + usuario + ", contrasena=" + contrasena + '}';
    }
    
}
