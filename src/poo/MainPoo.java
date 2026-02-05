package poo;

import java.util.Arrays;

public class MainPoo {

    public static void main(String[] args) {
        Persona p1 = new Persona("Camilo", 23);
        p1.saludar();
        p1.setNombre("Campos");
        p1.setEdad(24);
        System.out.println(p1.getEdad() + p1.getNombre());

        Calculadora c1 = new Calculadora();

        System.out.println(c1.sumar(1,2));
    }
}
