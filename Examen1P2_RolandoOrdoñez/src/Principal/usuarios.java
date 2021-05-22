package Principal;

import java.util.ArrayList;
import java.util.Date;

public class usuarios {

    private String usuario;
    private String contra;
    private Date nacimiento;
    private String telefono;
    private ArrayList<libros> libros;
    private ArrayList amigos;

    public usuarios() {
    }

    public usuarios(String usuario, String contra, Date nacimiento, String telefono, ArrayList<libros> libros, ArrayList amigos) {
        this.usuario = usuario;
        this.contra = contra;
        this.nacimiento = nacimiento;
        this.telefono = telefono;
        this.libros = libros;
        this.amigos = amigos;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public ArrayList<libros> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<libros> libros) {
        this.libros = libros;
    }

    public ArrayList getAmigos() {
        return amigos;
    }

    public void setAmigos(ArrayList amigos) {
        this.amigos = amigos;
    }

    @Override
    public String toString() {
        return "usuario=" + usuario + ", contra=" + contra + ", nacimiento=" + nacimiento + ", telefono=" + telefono + ", libros=" + libros + ", amigos=" + amigos + "";
    }

}
