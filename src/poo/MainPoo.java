package poo;

import java.util.*;
import java.util.stream.Collectors;

public class MainPoo {

    public static void main(String[] args) {

        //inyeccion();

        //herencia();

        //herenciaPractica();

        //listas();

        //ejemploSet();

        //ejemploMap();

        //ejemploLambda();

        //ejemploStreams();

        encontrarPares();


    }



    public static void inyeccion (){
        Persona p1 = new Persona("Camilo", 23);
        p1.saludar();
        p1.setNombre("Campos");
        p1.setEdad(24);
        System.out.println(p1.getEdad() + p1.getNombre());

        Calculadora c1 = new Calculadora();

        System.out.println(c1.sumar(1,2));
    }

    public static void herencia () {
        Animal animal = new Animal();
        animal.hacerSonido();

        Animal perro = new Perro();
        perro.hacerSonido();

        Volador ave = new Ave();
        ave.volar();


        Animal ave2 = new Ave();
        ave2.hacerSonido();
        ave2.conseguirCasa();
    }

    public static void herenciaPractica(){
        Cliente cliente = new Cliente(
                1L,
                "Camilo",
                "camilo@mail.com",
                "Calle 123"
        );

        Admin admin = new Admin(
                2L,
                "Ana",
                "ana@mail.com"
        );

        cliente.mostrarInfo();   // heredado
        cliente.comprar();

        admin.mostrarInfo();     // heredado
        admin.eliminarUsuario();
    }

    public static void listas(){
        List<String> nombres = new ArrayList<>();

        nombres.add("Camilo");
        nombres.add("Ana");
        nombres.add("Luis");


        System.out.println(nombres.get(0));

        for (String nombre: nombres) {
            System.out.println(nombre);
        }
    }

    public static void ejemploSet(){

        Set<String> correos = new HashSet<>();

        correos.add("a@mail.com");
        correos.add("a@mail.com");
        correos.add("b@mail.com");

        System.out.println(correos.size());
    }

    public static void ejemploMap(){
        Map<String, String> usuarios = new HashMap<>();

        usuarios.put("1", "Camilo");
        usuarios.put("2", "Ana");

        System.out.println(usuarios.get("1"));
    }

    public static void ejemploLambda(){
        List<String> nombres = new ArrayList<>();

        nombres.add("Camilo");
        nombres.add("Ana");
        nombres.add("Luis");

        nombres.forEach(nombre -> System.out.println(nombre));

    }

    public static void ejemploStreams(){
        List<String> nombres = List.of("Camilo", "Ana", "Luis", "Pedro");

        nombres.stream()
                .filter(n -> n.startsWith("A"))
                .forEach(System.out::println);
    }

    public static void encontrarPares(){
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        List<Integer> pares = numeros.stream()
                .filter(n -> n % 2 != 0)   // solo pares
                .collect(Collectors.toList());

        System.out.println(pares);

    }
}
