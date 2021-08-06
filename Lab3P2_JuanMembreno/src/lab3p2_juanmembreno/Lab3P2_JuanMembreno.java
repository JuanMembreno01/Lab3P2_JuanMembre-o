/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3p2_juanmembreno;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Lab3P2_JuanMembreno {

    static Scanner leer = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int op = 0;
        ArrayList<administradores> listaadmin = new ArrayList();
        ArrayList<programadores> listap = new ArrayList();
        ArrayList<motoristas> listam = new ArrayList();
        ArrayList<clientes> listac = new ArrayList();
        ArrayList<restaurantes> listar = new ArrayList();
        ArrayList<tiendas> listat = new ArrayList();
        listap.add(new programadores("david", "mejia", 541, "programador", "2", 1000, "java", 6,"david", "1234"));
        while (op != 3) {
            System.out.println("1)Crear usuario");
            System.out.println("2)Logiin");
            System.out.println("3)Salir");
            op = leer.nextInt();
            switch (op) {
                case 1: {
                    System.out.println("Ingrese su tipo de usuario");
                    System.out.println("1)Administradores");
                    System.out.println("2)Programadores");
                    System.out.println("3)Motoristas");
                    System.out.println("4)Cliente");
                    int opu = leer.nextInt();
                    switch (opu) {
                        case 1: {
                            System.out.println("Ingrese su nombre");
                            String nombre = leer.nextLine();
                            nombre = leer.nextLine();
                            System.out.println("Ingrese su apellido");
                            String apellido = leer.nextLine();
                            System.out.println("Ingrese su Id");
                            int id = leer.nextInt();
                            System.out.println("Ingrese su puesto");
                            String puesto = leer.nextLine();
                            puesto = leer.nextLine();
                            System.out.println("Anos en el cargo");
                            String anos = leer.nextLine();
                            System.out.println("Ingrese salario base");
                            int salario = leer.nextInt();
                            System.out.println("Ingrese anos de experiencia en ventas ");
                            int anose = leer.nextInt();
                            System.out.println("Ingrese su usuario");
                            String usuario = leer.nextLine();
                            usuario = leer.nextLine();
                            System.out.println("Ingrese su contrasena");
                            String contrasena = leer.nextLine();
                            listaadmin.add(new administradores(nombre, apellido, id, puesto, anos, salario, anose, usuario, contrasena));
                        }
                        break;
                        case 2: {
                            System.out.println("Ingrese su nombre");
                            String nombre = leer.nextLine();
                            nombre = leer.nextLine();
                            System.out.println("Ingrese su apellido");
                            String apellido = leer.nextLine();
                            System.out.println("Ingrese su Id");
                            int id = leer.nextInt();
                            System.out.println("Ingrese su puesto");
                            String puesto = leer.nextLine();
                            puesto = leer.nextLine();
                            System.out.println("Anos en el cargo");
                            String anos = leer.nextLine();
                            System.out.println("Ingrese salario base");
                            int salario = leer.nextInt();
                            System.out.println("Ingrese lenguje que domina");
                            String lenguaje = leer.nextLine();
                            lenguaje = leer.nextLine();
                            System.out.println("Ingrese horas de trabajo ");
                            int horast = leer.nextInt();
                            System.out.println("Ingrese su usuario");
                            String usuario = leer.nextLine();
                            usuario = leer.nextLine();
                            System.out.println("Ingrese su contrasena");
                            String contrasena = leer.nextLine();
                            listap.add(new programadores(nombre, apellido, id, puesto, anos, salario, lenguaje, horast, usuario, contrasena));
                        }
                        break;
                        case 3: {
                            System.out.println("Ingrese su nombre");
                            String nombre = leer.nextLine();
                            nombre = leer.nextLine();
                            System.out.println("Ingrese su apellido");
                            String apellido = leer.nextLine();
                            System.out.println("Ingrese su Id");
                            int id = leer.nextInt();
                            System.out.println("Ingrese su puesto");
                            String puesto = leer.nextLine();
                            puesto = leer.nextLine();
                            System.out.println("Anos en el cargo");
                            String anos = leer.nextLine();
                            System.out.println("Ingrese salario base");
                            int salario = leer.nextInt();
                            System.out.println("Ingrese comisiones");
                            int numcomisiones = leer.nextInt();
                            System.out.println("Ingrese medio de transporte ");
                            String mediotransporte = leer.nextLine();
                            mediotransporte = leer.nextLine();
                            System.out.println("Ingrese cantidad de encargos que puede llevar a la vez");
                            int cante = leer.nextInt();
                            System.out.println("Ingrese su usuario");
                            String usuario = leer.nextLine();
                            usuario = leer.nextLine();
                            System.out.println("Ingrese su contrasena");
                            String contrasena = leer.nextLine();
                            listam.add(new motoristas(nombre, apellido, id, puesto, anos, salario, numcomisiones, mediotransporte, cante, usuario, contrasena));
                        }
                        break;
                        case 4: {
                            System.out.println("Ingrese su nombre");
                            String nombre = leer.nextLine();
                            nombre = leer.nextLine();
                            System.out.println("Ingrese su apellido");
                            String apellido = leer.nextLine();
                            System.out.println("Ingrese su Id");
                            int id = leer.nextInt();
                            System.out.println("Ingrese su domicilio");
                            String domicilio = leer.nextLine();
                            domicilio = leer.nextLine();
                            System.out.println("Ingrese cantidad de veces que ah usado la aplicacion");
                            int cantordenes = leer.nextInt();
                            System.out.println("Ingrese su usuario");
                            String usuario = leer.nextLine();
                            usuario = leer.nextLine();
                            System.out.println("Ingrese su contrasena");
                            String contrasena = leer.nextLine();
                            listac.add(new clientes(nombre, apellido, id, domicilio, cantordenes, usuario, contrasena));
                        }
                        break;
                        default:
                            System.out.println("Opcion no valida");
                            break;
                    }
                }
                break;
                case 2: {
                    //login
                    System.out.println("Ingrese su usuario");
                    String user = leer.nextLine();
                    user = leer.nextLine();
                    int bandera = 0;
                    int posa = 0, posp = 0, posm = 0, posc = 0;
                    System.out.println("Ingrese su contrasena");
                    String contrasena = leer.nextLine();
                    for (int i = 0; i < listaadmin.size(); i++) {
                        if (listaadmin.get(i).getContrasena().equals(contrasena) & listaadmin.get(i).getUsuario().equals(user)) {
                            bandera = 1;
                            posa = i;
                            //administradores administradores=listaadmin.get(i);
                        }
                    }
                    //programadores
                    for (int i = 0; i < listap.size(); i++) {
                        if (listap.get(i).getContrasena().equals(contrasena) & listap.get(i).getUsuario().equals(user)) {
                            bandera = 2;
                            posp = i;
                        }
                    }
                    //motoristas
                    for (int i = 0; i < listam.size(); i++) {
                        if (listam.get(i).getContrasena().equals(contrasena) & listam.get(i).getUsuario().equals(user)) {
                            bandera = 3;
                            posm = i;
                        }
                    }
                    //clientes
                    for (int i = 0; i < listac.size(); i++) {
                        if (listac.get(i).getContrasena().equals(contrasena) & listac.get(i).getUsuario().equals(user)) {
                            bandera = 4;
                            posc = i;
                        }
                    }
                    if (bandera != 1 & bandera != 2 & bandera != 3 & bandera != 4) {
                        System.out.println("El usuario ingresado no existe");
                        break;
                    }
                    //usuario ya identificado
                    if (bandera == 1) {
                        System.out.println("Debido a su tipo de usuario solo puede modificar su informacion personal ");
                        System.out.println("Ingrese la informacion que desea modificar");
                        System.out.println("1)Nombre");
                        System.out.println("2)Apellido");
                        System.out.println("3)Id");
                        System.out.println("4)Puesto");
                        System.out.println("5)Salario");
                        int opm = leer.nextInt();
                        switch (opm) {
                            case 1: {
                                System.out.println("Ingrese nuevo nombre");
                                String nombre = leer.nextLine();
                                nombre = leer.nextLine();
                                listaadmin.get(posa).setNombre(nombre);
                            }
                            break;
                            case 2: {
                                System.out.println("Ingrese apellido");
                                String apellido = leer.nextLine();
                                listaadmin.get(posa).setApellido(apellido);
                            }
                            break;
                            case 3: {
                                System.out.println("Ingrese su nuevo id");
                                int id = leer.nextInt();
                                listaadmin.get(posa).setId(id);
                            }
                            break;
                            case 4: {
                                System.out.println("Ingrese su nuevo puesto");
                                String puesto = leer.nextLine();
                                puesto = leer.nextLine();
                                listaadmin.get(posa).setPuesto(puesto);

                            }
                            break;
                            case 5: {
                                System.out.println("Ingrese su salario");
                                int salario = leer.nextInt();
                                listaadmin.get(posa).setSalario(salario);
                            }
                            break;
                            default:
                                System.out.println("No valido");
                                break;
                        }
                        System.out.println("Informacion modificada");
                    } else if (bandera == 3) {
                        System.out.println("Debido a su tipo de usuario(Motorista) solo puede modificar su informacion personal ");
                        System.out.println("Ingrese la informacion que desea modificar");
                        System.out.println("1)Nombre");
                        System.out.println("2)Apellido");
                        System.out.println("3)Id");
                        System.out.println("4)Puesto");
                        System.out.println("5)Salario");
                        int opm = leer.nextInt();
                        switch (opm) {
                            case 1: {
                                System.out.println("Ingrese nuevo nombre");
                                String nombre = leer.nextLine();
                                nombre = leer.nextLine();
                                listam.get(posm).setNombre(nombre);
                            }
                            break;
                            case 2: {
                                System.out.println("Ingrese apellido");
                                String apellido = leer.nextLine();
                                listam.get(posm).setApellido(apellido);
                            }
                            break;
                            case 3: {
                                System.out.println("Ingrese su nuevo id");
                                int id = leer.nextInt();
                                listam.get(posm).setId(id);
                            }
                            break;
                            case 4: {
                                System.out.println("Ingrese su nuevo puesto");
                                String puesto = leer.nextLine();
                                puesto = leer.nextLine();
                                listam.get(posm).setPuesto(puesto);

                            }
                            break;
                            case 5: {
                                System.out.println("Ingrese su salario");
                                int salario = leer.nextInt();
                                listam.get(posm).setSalario(salario);
                            }
                            break;
                            default:
                                System.out.println("No valido");
                                break;
                        }
                        System.out.println("Informacion modificada");
                    } else if (bandera == 2) {
                        System.out.println("1)Administardores");
                        System.out.println("2)Motoristas");
                        System.out.println("3)Programadores");
                        System.out.println("4)Clientes");
                        System.out.println("5)Restaurantes");
                        System.out.println("6)Tiendas");
                        int opt = leer.nextInt();
                        switch (opt) {
                            case 1: {
                                System.out.println("1)Crear");
                                System.out.println("2)Modificar");
                                System.out.println("3)Eliminar");
                                System.out.println("4)Listar");
                                int opa = leer.nextInt();
                                switch (opa) {
                                    case 1: {
                                        System.out.println("Ingrese su nombre");
                                        String nombre = leer.nextLine();
                                        nombre = leer.nextLine();
                                        System.out.println("Ingrese su apellido");
                                        String apellido = leer.nextLine();
                                        System.out.println("Ingrese su Id");
                                        int id = leer.nextInt();
                                        System.out.println("Ingrese su puesto");
                                        String puesto = leer.nextLine();
                                        puesto = leer.nextLine();
                                        System.out.println("Anos en el cargo");
                                        String anos = leer.nextLine();
                                        System.out.println("Ingrese salario base");
                                        int salario = leer.nextInt();
                                        System.out.println("Ingrese anos de experiencia en ventas ");
                                        int anose = leer.nextInt();
                                        System.out.println("Ingrese su usuario");
                                        String usuario = leer.nextLine();
                                        usuario = leer.nextLine();
                                        System.out.println("Ingrese su contrasena");
                                        String contrasena0 = leer.nextLine();
                                        listaadmin.add(new administradores(nombre, apellido, id, puesto, anos, salario, anose, usuario, contrasena0));
                                    }
                                    break;
                                    case 2: {
                                        String salida = "";
                                        for (Object t : listaadmin) {
                                            if (t instanceof administradores) {
                                                salida += listaadmin.indexOf(t) + ")" + t + "\n";
                                            }
                                        }
                                        System.out.println(salida);
                                        int indice = 0;
                                        System.out.println("Ingrese el indice del admin a modificar");
                                        indice = leer.nextInt();

                                        System.out.println("Ingrese la informacion que desea modificar");
                                        System.out.println("1)Nombre");
                                        System.out.println("2)Apellido");
                                        System.out.println("3)Id");
                                        System.out.println("4)Puesto");
                                        System.out.println("5)Salario");
                                        int opm = leer.nextInt();
                                        switch (opm) {
                                            case 1: {
                                                System.out.println("Ingrese nuevo nombre");
                                                String nombre = leer.nextLine();
                                                nombre = leer.nextLine();
                                                listaadmin.get(indice).setNombre(nombre);
                                            }
                                            break;
                                            case 2: {
                                                System.out.println("Ingrese apellido");
                                                String apellido = leer.nextLine();
                                                listaadmin.get(indice).setApellido(apellido);
                                            }
                                            break;
                                            case 3: {
                                                System.out.println("Ingrese su nuevo id");
                                                int id = leer.nextInt();
                                                listaadmin.get(indice).setId(id);
                                            }
                                            break;
                                            case 4: {
                                                System.out.println("Ingrese su nuevo puesto");
                                                String puesto = leer.nextLine();
                                                puesto = leer.nextLine();
                                                listaadmin.get(indice).setPuesto(puesto);

                                            }
                                            break;
                                            case 5: {
                                                System.out.println("Ingrese su salario");
                                                int salario = leer.nextInt();
                                                listaadmin.get(indice).setSalario(salario);
                                            }
                                            break;
                                            default:
                                                System.out.println("No valido");
                                                break;
                                        }
                                        System.out.println("Informacion modificada");

                                    }
                                    break;
                                    case 3: {
                                        String salida = "";
                                        for (Object t : listaadmin) {
                                            if (t instanceof administradores) {
                                                salida += listaadmin.indexOf(t) + ")" + t + "\n";
                                            }
                                        }
                                        System.out.println(salida);
                                        int indice = 0;
                                        System.out.println("Ingrese el indice del admin a eliminar");
                                        indice = leer.nextInt();
                                        listaadmin.remove(indice);
                                        System.out.println("Eliminado exitosamente");
                                    }
                                    break;
                                    case 4: {
                                        String salida = "";
                                        for (Object t : listaadmin) {
                                            if (t instanceof administradores) {
                                                salida += listaadmin.indexOf(t) + ")" + t + "\n";
                                            }
                                        }
                                        System.out.println(salida);
                                    }
                                    break;
                                    default:
                                        System.out.println("Opcion no valida");
                                        break;
                                }
                            }
                            break;
                            case 2: {
                                System.out.println("1)Crear");
                                System.out.println("2)Modificar");
                                System.out.println("3)Eliminar");
                                System.out.println("4)Listar");
                                int opm = leer.nextInt();
                                switch (opm) {
                                    case 1: {
                                        System.out.println("Ingrese su nombre");
                                        String nombre = leer.nextLine();
                                        nombre = leer.nextLine();
                                        System.out.println("Ingrese su apellido");
                                        String apellido = leer.nextLine();
                                        System.out.println("Ingrese su Id");
                                        int id = leer.nextInt();
                                        System.out.println("Ingrese su puesto");
                                        String puesto = leer.nextLine();
                                        puesto = leer.nextLine();
                                        System.out.println("Anos en el cargo");
                                        String anos = leer.nextLine();
                                        System.out.println("Ingrese salario base");
                                        int salario = leer.nextInt();
                                        System.out.println("Ingrese comisiones");
                                        int numcomisiones = leer.nextInt();
                                        System.out.println("Ingrese medio de transporte ");
                                        String mediotransporte = leer.nextLine();
                                        mediotransporte = leer.nextLine();
                                        System.out.println("Ingrese cantidad de encargos que puede llevar a la vez");
                                        int cante = leer.nextInt();
                                        System.out.println("Ingrese su usuario");
                                        String usuario = leer.nextLine();
                                        usuario = leer.nextLine();
                                        System.out.println("Ingrese su contrasena");
                                        String contrasena0 = leer.nextLine();
                                        listam.add(new motoristas(nombre, apellido, id, puesto, anos, salario, numcomisiones, mediotransporte, cante, usuario, contrasena0));
                                    }
                                    break;
                                    case 2: {
                                        String salida = "";
                                        for (Object t : listam) {
                                            if (t instanceof motoristas) {
                                                salida += listam.indexOf(t) + ")" + t + "\n";
                                            }
                                        }
                                        System.out.println(salida);
                                        System.out.println("Ingrese indice a modificar");
                                        int ind = leer.nextInt();
                                        System.out.println("Ingrese la informacion que desea modificar");
                                        System.out.println("1)Nombre");
                                        System.out.println("2)Apellido");
                                        System.out.println("3)Id");
                                        System.out.println("4)Puesto");
                                        System.out.println("5)Salario");
                                        int opm1 = leer.nextInt();
                                        switch (opm1) {
                                            case 1: {
                                                System.out.println("Ingrese nuevo nombre");
                                                String nombre = leer.nextLine();
                                                nombre = leer.nextLine();
                                                listam.get(ind).setNombre(nombre);
                                            }
                                            break;
                                            case 2: {
                                                System.out.println("Ingrese apellido");
                                                String apellido = leer.nextLine();
                                                listam.get(ind).setApellido(apellido);
                                            }
                                            break;
                                            case 3: {
                                                System.out.println("Ingrese su nuevo id");
                                                int id = leer.nextInt();
                                                listam.get(ind).setId(id);
                                            }
                                            break;
                                            case 4: {
                                                System.out.println("Ingrese su nuevo puesto");
                                                String puesto = leer.nextLine();
                                                puesto = leer.nextLine();
                                                listam.get(ind).setPuesto(puesto);

                                            }
                                            break;
                                            case 5: {
                                                System.out.println("Ingrese su salario");
                                                int salario = leer.nextInt();
                                                listam.get(ind).setSalario(salario);
                                            }
                                            break;
                                            default:
                                                System.out.println("No valido");
                                                break;
                                        }
                                    }
                                    break;
                                    case 3: {
                                        String salida = "";
                                        for (Object t : listam) {
                                            if (t instanceof motoristas) {
                                                salida += listam.indexOf(t) + ")" + t + "\n";
                                            }
                                        }
                                        System.out.println(salida);
                                        System.out.println("Ingrese el indice a eliminar  ");
                                        int inde = leer.nextInt();
                                        listam.remove(inde);
                                        System.out.println("Eliminado exitosamentre");
                                    }
                                    break;
                                    case 4: {
                                        String salida = "";
                                        for (Object t : listam) {
                                            if (t instanceof motoristas) {
                                                salida += listam.indexOf(t) + ")" + t + "\n";
                                            }
                                        }
                                        System.out.println(salida);
                                    }
                                    break;
                                    default:
                                        System.out.println("Opcion no valida");
                                        break;
                                }

                            }
                            break;
                            case 3: {
                                System.out.println("1)Crear");
                                System.out.println("2)Modificar");
                                System.out.println("3)Eliminar");
                                System.out.println("4)Listar");
                                int opp = leer.nextInt();
                                switch (opp) {
                                    case 1: {
                                        System.out.println("Ingrese su nombre");
                                        String nombre = leer.nextLine();
                                        nombre = leer.nextLine();
                                        System.out.println("Ingrese su apellido");
                                        String apellido = leer.nextLine();
                                        System.out.println("Ingrese su Id");
                                        int id = leer.nextInt();
                                        System.out.println("Ingrese su puesto");
                                        String puesto = leer.nextLine();
                                        puesto = leer.nextLine();
                                        System.out.println("Anos en el cargo");
                                        String anos = leer.nextLine();
                                        System.out.println("Ingrese salario base");
                                        int salario = leer.nextInt();
                                        System.out.println("Ingrese lenguje que domina");
                                        String lenguaje = leer.nextLine();
                                        lenguaje = leer.nextLine();
                                        System.out.println("Ingrese horas de trabajo ");
                                        int horast = leer.nextInt();
                                        System.out.println("Ingrese su usuario");
                                        String usuario = leer.nextLine();
                                        usuario = leer.nextLine();
                                        System.out.println("Ingrese su contrasena");
                                        String contrasena0 = leer.nextLine();
                                        listap.add(new programadores(nombre, apellido, id, puesto, anos, salario, lenguaje, horast, usuario, contrasena0));
                                    }
                                    break;
                                    case 2: {
                                        String salida = "";
                                        for (Object t : listap) {
                                            if (t instanceof programadores) {
                                                salida += listap.indexOf(t) + ")" + t + "\n";
                                            }
                                        }
                                        System.out.println(salida);
                                        System.out.println("Ingrese el indice a modificar");
                                        int inm = leer.nextInt();
                                        System.out.println("Para modificar ingrese el:");
                                        System.out.println("Ingrese su nombre");
                                        String nombre = leer.nextLine();
                                        nombre = leer.nextLine();
                                        System.out.println("Ingrese su apellido");
                                        String apellido = leer.nextLine();
                                        System.out.println("Ingrese su Id");
                                        int id = leer.nextInt();
                                        System.out.println("Ingrese su puesto");
                                        String puesto = leer.nextLine();
                                        puesto = leer.nextLine();
                                        System.out.println("Anos en el cargo");
                                        String anos = leer.nextLine();
                                        System.out.println("Ingrese salario base");
                                        int salario = leer.nextInt();
                                        System.out.println("Ingrese lenguje que domina");
                                        String lenguaje = leer.nextLine();
                                        lenguaje = leer.nextLine();
                                        System.out.println("Ingrese horas de trabajo ");
                                        int horast = leer.nextInt();
                                        System.out.println("Ingrese su usuario");
                                        String usuario = leer.nextLine();
                                        usuario = leer.nextLine();
                                        System.out.println("Ingrese su contrasena");
                                        String contrasena0 = leer.nextLine();
                                        listap.add(inm, new programadores(nombre, apellido, id, puesto, anos, salario, lenguaje, horast, usuario, contrasena0));
                                        listap.remove(inm + 1);
                                        System.out.println("Modificado");
                                    }
                                    break;
                                    case 3: {
                                        String salida = "";
                                        for (Object t : listap) {
                                            if (t instanceof programadores) {
                                                salida += listap.indexOf(t) + ")" + t + "\n";
                                            }
                                        }
                                        System.out.println(salida);
                                        System.out.println("Ingrese el indice a modificar");
                                        int ine = leer.nextInt();
                                        listap.remove(ine);
                                        System.out.println("Eliminado exitosamente");
                                    }
                                    break;
                                    case 4: {
                                        String salida = "";
                                        for (Object t : listap) {
                                            if (t instanceof programadores) {
                                                salida += listap.indexOf(t) + ")" + t + "\n";
                                            }
                                        }
                                        System.out.println(salida);
                                    }
                                    break;
                                    default:
                                        System.out.println("Opcion no valida");
                                        break;
                                }
                            }
                            break;
                            case 4: {
                                System.out.println("1)Crear");
                                System.out.println("2)Modificar");
                                System.out.println("3)Eliminar");
                                System.out.println("4)Listar");
                                int opc = leer.nextInt();
                                switch (opc) {
                                    case 1: {
                                        System.out.println("Ingrese su nombre");
                                        String nombre = leer.nextLine();
                                        nombre = leer.nextLine();
                                        System.out.println("Ingrese su apellido");
                                        String apellido = leer.nextLine();
                                        System.out.println("Ingrese su Id");
                                        int id = leer.nextInt();
                                        System.out.println("Ingrese su domicilio");
                                        String domicilio = leer.nextLine();
                                        domicilio = leer.nextLine();
                                        System.out.println("Ingrese cantidad de veces que ah usado la aplicacion");
                                        int cantordenes = leer.nextInt();
                                        System.out.println("Ingrese su usuario");
                                        String usuario = leer.nextLine();
                                        usuario = leer.nextLine();
                                        System.out.println("Ingrese su contrasena");
                                        String contrasena0 = leer.nextLine();
                                        listac.add(new clientes(nombre, apellido, id, domicilio, cantordenes, usuario, contrasena0));
                                    }
                                    break;
                                    case 2: {
                                        String salida = "";
                                        for (Object t : listac) {
                                            if (t instanceof clientes) {
                                                salida += listac.indexOf(t) + ")" + t + "\n";
                                            }
                                        }
                                        System.out.println(salida);
                                        System.out.println("Ingrese indice a modificar");
                                        int indm = leer.nextInt();
                                        System.out.println("para modificar ingrese:");
                                        System.out.println("Ingrese su nombre");
                                        String nombre = leer.nextLine();
                                        nombre = leer.nextLine();
                                        System.out.println("Ingrese su apellido");
                                        String apellido = leer.nextLine();
                                        System.out.println("Ingrese su Id");
                                        int id = leer.nextInt();
                                        System.out.println("Ingrese su domicilio");
                                        String domicilio = leer.nextLine();
                                        domicilio = leer.nextLine();
                                        System.out.println("Ingrese cantidad de veces que ah usado la aplicacion");
                                        int cantordenes = leer.nextInt();
                                        System.out.println("Ingrese su usuario");
                                        String usuario = leer.nextLine();
                                        usuario = leer.nextLine();
                                        System.out.println("Ingrese su contrasena");
                                        String contrasena0 = leer.nextLine();
                                        listac.add(indm, new clientes(nombre, apellido, id, domicilio, cantordenes, usuario, contrasena0));
                                        listac.remove(indm + 1);
                                        System.out.println("Modificado");
                                    }
                                    break;
                                    case 3: {
                                        String salida = "";
                                        for (Object t : listac) {
                                            if (t instanceof clientes) {
                                                salida += listac.indexOf(t) + ")" + t + "\n";
                                            }
                                        }
                                        System.out.println(salida);
                                        System.out.println("Ingrese indice a eliminar");
                                        int inde = leer.nextInt();
                                        listac.remove(inde);
                                        System.out.println("Eliminado exitosamente");
                                    }
                                    break;
                                    case 4: {
                                        String salida = "";
                                        for (Object t : listac) {
                                            if (t instanceof clientes) {
                                                salida += listac.indexOf(t) + ")" + t + "\n";
                                            }
                                        }
                                        System.out.println(salida);
                                    }
                                    break;
                                    default:
                                        System.out.println("Opcion no valida");
                                        break;
                                }
                            }
                            break;
                            case 5: {
                                System.out.println("1)Crear");
                                System.out.println("2)Modificar");
                                System.out.println("3)Eliminar");
                                System.out.println("4)Listar");
                                int opr = leer.nextInt();
                                switch (opr) {
                                    case 1: {
                                        ArrayList<comidas> listaco = new ArrayList();
                                        // ArrayList<acompanamientos> listacompa=new ArrayList();
                                        System.out.println("Ingrese ubicacion");
                                        String ubicacion = leer.nextLine();
                                        ubicacion = leer.nextLine();
                                        System.out.println("Ingrese nombre");
                                        String nombre = leer.nextLine();
                                        System.out.println("Ingrese rtn ");
                                        String rtn = leer.nextLine();
                                        System.out.println("Ingrese Slogan");
                                        String slogan = leer.nextLine();
                                        slogan = leer.nextLine();
                                        System.out.println("Ingrese numero de comida en el menu");
                                        int numco = leer.nextInt();
                                        for (int i = 0; i < numco; i++) {
                                            System.out.println("Ingrese id de la comida:" + i);
                                            int id = leer.nextInt();
                                            System.out.println("Ingrese el nombre de la comida->" + i);
                                            String nombrec = leer.nextLine();
                                            nombrec = leer.nextLine();
                                            System.out.println("Ingrese el precio de la comida->" + i);
                                            int precio = leer.nextInt();
                                            System.out.println("Ingreses numero de acompanamientos");
                                            listaco.add(new comidas(id, nombre, precio, bandera));
                                            int numa = leer.nextInt();
                                            for (int j = 0; j < numa; j++) {
                                                System.out.println("Ingrese el nombre de acompanamiento->" + j);
                                                String nombrea = leer.nextLine();
                                                nombrea = leer.nextLine();
                                                System.out.println("Ingrese tipo (asado,frito,pan,salsa) del acompanamiento ->" + j);
                                                String tipo = leer.nextLine();
                                                System.out.println("Ingrese precio adicional del acompanamiento ->" + j);
                                                int precioa = leer.nextInt();
                                                //listacompa.add(new acompanamientos(nombrea, tipo, precio));
                                                //listaco.get(i).setAcompanamientos(acompanamientos);
                                                listaco.get(i).getAcompanamientos().add(new acompanamientos(nombre, rtn, precio));
                                            }

                                        }
                                        listar.add(new restaurantes(ubicacion, nombre, rtn, slogan, listaco));
                                        listaco.clear();
                                    }
                                    break;
                                    case 2: {
                                        String salida = "";
                                        for (Object t : listar) {
                                            if (t instanceof restaurantes) {
                                                salida += listar.indexOf(t) + ")" + t + "\n";
                                            }
                                        }
                                        System.out.println(salida);
                                        System.out.println("Ingrese indice a modificar");
                                        int indm = leer.nextInt();
                                        System.out.println("Para modificar ingrese");
                                        ArrayList<comidas> listaco = new ArrayList();
                                        // ArrayList<acompanamientos> listacompa=new ArrayList();
                                        System.out.println("Ingrese ubicacion");
                                        String ubicacion = leer.nextLine();
                                        ubicacion = leer.nextLine();
                                        System.out.println("Ingrese nombre");
                                        String nombre = leer.nextLine();
                                        System.out.println("Ingrese rtn ");
                                        String rtn = leer.nextLine();
                                        System.out.println("Ingrese Slogan");
                                        String slogan = leer.nextLine();
                                        slogan = leer.nextLine();
                                        System.out.println("Ingrese numero de comida en el menu");
                                        int numco = leer.nextInt();
                                        for (int i = 0; i < numco; i++) {
                                            System.out.println("Ingrese id de la comida:" + i);
                                            int id = leer.nextInt();
                                            System.out.println("Ingrese el nombre de la comida->" + i);
                                            String nombrec = leer.nextLine();
                                            nombrec = leer.nextLine();
                                            System.out.println("Ingrese el precio de la comida->" + i);
                                            int precio = leer.nextInt();
                                            System.out.println("Ingreses numero de acompanamientos");
                                            listaco.add(new comidas(id, nombre, precio, bandera));
                                            int numa = leer.nextInt();
                                            for (int j = 0; j < numa; j++) {
                                                System.out.println("Ingrese el nombre de acompanamiento->" + j);
                                                String nombrea = leer.nextLine();
                                                nombrea = leer.nextLine();
                                                System.out.println("Ingrese tipo (asado,frito,pan,salsa) del acompanamiento ->" + j);
                                                String tipo = leer.nextLine();
                                                System.out.println("Ingrese precio adicional del acompanamiento ->" + j);
                                                int precioa = leer.nextInt();
                                                //listacompa.add(new acompanamientos(nombrea, tipo, precio));
                                                //listaco.get(i).setAcompanamientos(acompanamientos);
                                                listaco.get(i).getAcompanamientos().add(new acompanamientos(nombre, rtn, precio));
                                            }

                                        }
                                        listar.add(indm, new restaurantes(ubicacion, nombre, rtn, slogan, listaco));
                                        listar.remove(indm + 1);
                                        listaco.clear();
                                    }
                                    break;
                                    case 3: {
                                        String salida = "";
                                        for (Object t : listar) {
                                            if (t instanceof restaurantes) {
                                                salida += listar.indexOf(t) + ")" + t + "\n";
                                            }
                                        }
                                        System.out.println(salida);
                                        System.out.println("Ingrese indice a eliminar");
                                        int indm = leer.nextInt();
                                        listar.remove(indm);
                                        System.out.println("Elimminado");
                                    }
                                    break;
                                    case 4: {
                                        String salida = "";
                                        for (Object t : listar) {
                                            if (t instanceof restaurantes) {
                                                salida += listar.indexOf(t) + ")" + t + "\n";
                                            }
                                        }
                                        System.out.println(salida);
                                    }
                                    break;
                                    default:
                                        System.out.println("Opcion no valida");
                                        break;
                                }
                            }
                            break;
                            case 6: {
                                System.out.println("1)Crear");
                                System.out.println("2)Modificar");
                                System.out.println("3)Eliminar");
                                System.out.println("4)Listar");
                                int opt1 = leer.nextInt();
                                switch (opt1) {
                                    case 1: {
                                        ArrayList<articulos> listart = new ArrayList();
                                        System.out.println("Ingrese nombre de la tienda");
                                        String nombre = leer.nextLine();
                                        nombre = leer.nextLine();
                                        System.out.println("Ingrese ubicacion");
                                        String ubicacion = leer.nextLine();
                                        System.out.println("Ingrese canctidad de empleados ");
                                        int cante = leer.nextInt();
                                        System.out.println("tiempo de espera");
                                        String tiempo = leer.nextLine();
                                        tiempo = leer.nextLine();
                                        System.out.println("Ingrese cantidad de articulos");
                                        int canta = leer.nextInt();

                                        for (int i = 0; i < canta; i++) {
                                            System.out.println("Ingrese nombre del articulo->" + i);
                                            String nombreart = leer.nextLine();
                                            nombreart = leer.nextLine();
                                            System.out.println("Ingrese categoria del articulo->" + i);
                                            String categoria = leer.nextLine();
                                            System.out.println("Ingrese precio del art->" + i);
                                            int precio = leer.nextInt();
                                            listart.add(new articulos(nombre, categoria, precio));
                                        }
                                        listat.add(new tiendas(nombre, ubicacion, canta, tiempo, listart));
                                        listart.clear();
                                    }
                                    break;
                                    case 2: {
                                        String salida = "";
                                        for (Object t : listat) {
                                            if (t instanceof tiendas) {
                                                salida += listat.indexOf(t) + ")" + t + "\n";
                                            }
                                        }
                                        System.out.println(salida);
                                        System.out.println("Ingrese indice a modificar");
                                        int indm = leer.nextInt();
                                        System.out.println("para modificar ingrese");
                                        ArrayList<articulos> listart = new ArrayList();
                                        System.out.println("Ingrese nombre de la tienda");
                                        String nombre = leer.nextLine();
                                        nombre = leer.nextLine();
                                        System.out.println("Ingrese ubicacion");
                                        String ubicacion = leer.nextLine();
                                        System.out.println("Ingrese canctidad de empleados ");
                                        int cante = leer.nextInt();
                                        System.out.println("tiempo de espera");
                                        String tiempo = leer.nextLine();
                                        tiempo = leer.nextLine();
                                        System.out.println("Ingrese cantidad de articulos");
                                        int canta = leer.nextInt();

                                        for (int i = 0; i < canta; i++) {
                                            System.out.println("Ingrese nombre del articulo->" + i);
                                            String nombreart = leer.nextLine();
                                            nombreart = leer.nextLine();
                                            System.out.println("Ingrese categoria del articulo->" + i);
                                            String categoria = leer.nextLine();
                                            System.out.println("Ingrese precio del art->" + i);
                                            int precio = leer.nextInt();
                                            listart.add(new articulos(nombre, categoria, precio));
                                        }
                                        listat.add(indm, new tiendas(nombre, ubicacion, canta, tiempo, listart));
                                        listat.remove(indm + 1);
                                        listart.clear();
                                    }
                                    break;
                                    case 3: {
                                        String salida = "";
                                        for (Object t : listat) {
                                            if (t instanceof tiendas) {
                                                salida += listat.indexOf(t) + ")" + t + "\n";
                                            }
                                        }
                                        System.out.println(salida);
                                        System.out.println("Ingrese indice a eliminar");
                                        int indm = leer.nextInt();
                                        listat.remove(indm);
                                    }
                                    break;
                                    case 4: {
                                        String salida = "";
                                        for (Object t : listat) {
                                            if (t instanceof tiendas) {
                                                salida += listat.indexOf(t) + ")" + t + "\n";
                                            }
                                        }
                                        System.out.println(salida);
                                    }
                                    break;
                                    default:
                                        System.out.println("Opcion no valida");
                                        break;
                                }
                            }
                            break;
                            default:
                                System.out.println("Opcion no valida");
                                break;
                        }
                    } else if (bandera == 4) {
                        System.out.println("Bienvenido");
                        System.out.println("Que desea para delivery");
                        System.out.println("1)Comida");
                        System.out.println("2)Tienda");
                        int op6 = leer.nextInt();
                        switch (op6) {
                            case 1: {
                               String salida = "";
                                        for (Object t : listar) {
                                            if (t instanceof restaurantes) {
                                                salida += listar.indexOf(t) + ")" + t + "\n";
                                            }
                                        }
                                        System.out.println(salida);
                                System.out.println("Eleccione el indice de restaurante");
                                int indr=leer.nextInt();
                                for (int i = 0; i < listar.get(indr).getComidas().size(); i++) {
                                    System.out.println(i+")"+listar.get(indr).getComidas().get(i).toString());
                                }
                                System.out.println("Sellecione su comida");
                                int comin=leer.nextInt();
                                System.out.println("su pedido es:"+listar.get(indr).getComidas().get(comin).getNombre().toString());
                                System.out.println("el precio de suorden es de:"+listar.get(indr).getComidas().get(comin).getPrecio());
                                int numero = (int)(Math. random()*listam.size()+1);
                                System.out.println("Su orden sera entreaga por:"+listam.get(numero).getNombre());
                                System.out.println("Su pedido fue procesado");
                                System.out.println("Cargo por comision de la apliacion :500L");
                               int total= listam.get(numero).getNumcomisiones();
                                listam.get(numero).setNumcomisiones(total+500);
                            }
                            break;
                            case 2: {
                               String salida = "";
                                        for (Object t : listat) {
                                            if (t instanceof tiendas) {
                                                salida += listat.indexOf(t) + ")" + t + "\n";
                                            }
                                        }
                                        System.out.println(salida);
                                System.out.println("Eleccione el indice de tienda");
                                int indt=leer.nextInt();
                                 for (int i = 0; i < listat.get(indt).getArticulos().size(); i++) {
                                    System.out.println(i+")"+listat.get(indt).getArticulos().get(i).toString());
                                }
                                System.out.println("Seleccione  indice de su articulo"); 
                                int indart=leer.nextInt();
                                System.out.println("su pedido es:"+listat.get(indt).getArticulos().get(indart).getNombre());
                                System.out.println("El total de su pedido es de:"+listat.get(indt).getArticulos().get(indart).getPrecio());
                                int numero = (int)(Math. random()*listam.size()+1);
                                System.out.println("Su orden sera entreaga por:"+listam.get(numero).getNombre());
                                System.out.println("Su transaccion fue procesada");
                                System.out.println("Cargo por comision de la apliacion :1000L");
                                  int total= listam.get(numero).getNumcomisiones();
                                listam.get(numero).setNumcomisiones(total+1000);
                            }
                            break;
                            default:
                                System.out.println("Opcion no valida");
                                break;
                        }
                    }
                }
                break;
                case 3: {
                    System.out.println("Se salio del menu ");
                }
                break;
                default:
                    System.out.println("Opcion no valida");

            }
        }

    }

}
