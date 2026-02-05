package poo;

public class Admin extends Usuario{

    public Admin(Long id, String nombre, String email){
        super(id, nombre, email);
    }

    public void eliminarUsuario(){
        System.out.println(nombre + " eliminó un usuario");
    }
}
