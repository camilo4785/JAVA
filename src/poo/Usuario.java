package poo;

public class Usuario {

    protected Long id;
    protected String nombre;
    protected String email;

    public Usuario(Long id, String nombre, String email) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
    }

    public void mostrarInfo() {
        System.out.println(nombre + " - " + email);
    }
}