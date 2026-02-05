package poo;

public class Cliente extends Usuario {

    private String direccion;

    public Cliente(Long id, String nombre, String email, String direccion) {
        super(id, nombre, email); // constructor del padre
        this.direccion = direccion;
    }

    public void comprar() {
        System.out.println(nombre + " está comprando");
    }
}