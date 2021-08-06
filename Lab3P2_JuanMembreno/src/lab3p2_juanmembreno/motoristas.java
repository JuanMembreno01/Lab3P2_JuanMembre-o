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
public class motoristas {
      private String nombre;
    private String apellido;
    private int id;
    private String puesto;
    private String anos;
    private int salario;
    private int numcomisiones;
    private String mediotransporte;
    private int cantidadeencargos;
    private String  usuario;
    private String contrasena;

    public motoristas() {
    }

    public motoristas(String nombre, String apellido, int id, String puesto, String anos, int salario, int numcomisiones, String mediotransporte, int cantidadeencargos, String usuario, String contrasena) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.puesto = puesto;
        this.anos = anos;
        this.salario = salario;
        this.numcomisiones = numcomisiones;
        this.mediotransporte = mediotransporte;
        this.cantidadeencargos = cantidadeencargos;
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

    public int getNumcomisiones() {
        return numcomisiones;
    }

    public void setNumcomisiones(int numcomisiones) {
        this.numcomisiones = numcomisiones;
    }

    public String getMediotransporte() {
        return mediotransporte;
    }

    public void setMediotransporte(String mediotransporte) {
        this.mediotransporte = mediotransporte;
    }

    public int getCantidadeencargos() {
        return cantidadeencargos;
    }

    public void setCantidadeencargos(int cantidadeencargos) {
        this.cantidadeencargos = cantidadeencargos;
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
        return "motoristas{" + "nombre=" + nombre + ", apellido=" + apellido + ", id=" + id + ", puesto=" + puesto + ", anos=" + anos + ", salario=" + salario + ", numcomisiones=" + numcomisiones + ", mediotransporte=" + mediotransporte + ", cantidadeencargos=" + cantidadeencargos + ", usuario=" + usuario + ", contrasena=" + contrasena + '}';
    }
    
}
