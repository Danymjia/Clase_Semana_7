import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*System.out.println("---------Sin Parametros---------");
        Transportes.Auto auto1 = new Transportes.Auto();
        auto1.mostrarDatos();

        System.out.println("---------Con Parametros Padre---------");
        Transportes.Auto auto2 = new Transportes.Auto(5, 60.0);
        auto2.mostrarDatos();

        System.out.println("---------Con Parametros Hijo---------");
        Transportes.Auto auto3 = new Transportes.Auto("Gasolina", 80);
        auto3.mostrarDatosAuto();

        System.out.println("---------Asiganrlos con Setters---------");
        Transportes.Auto auto4 = new Transportes.Auto();
        auto4.setCapacidad(8);
        auto4.setVelocidad(90);;
        auto4.setTipo("Gasolina");
        auto4.setCilindraje(80);

        auto4.mostrarDatos();
        auto4.mostrarDatosAuto();*/

        System.out.println("---------Sin Parametros---------");
        Perro perro = new Perro();
        perro.mostrarPerro();

        System.out.println("---------Con Parametros Padre---------");
        Gato gato = new Gato("Maullar",4);
        gato.mostrarGato();

        System.out.println("---------Con Parametros Hija---------");
        Hamster hamster = new Hamster("Juan",7.5);
        hamster.mostrarHamster();

        System.out.println("---------Con Parametros Padre e Hija---------");
        Pez pez = new Pez("Chirriado",1,"Juanito","Dorado" );
        pez.mostrarPez();

        System.out.println("---------Settear Parametros---------");
        Tortuga tortuga = new Tortuga();
        tortuga.setSonido("Bufido");
        tortuga.setEdad(5);
        tortuga.setNombre("Pedrito");
        tortuga.setTipo("Terrestre");
        tortuga.mostrarTortuga();










    }
    }