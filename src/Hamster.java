public class Hamster{

    private String nombre;
    private double tamano;

    public Hamster(String nombre, double tamano) {
        this.nombre = nombre;
        this.tamano = tamano;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getTamano() {
        return tamano;
    }

    public void setTamano(double tamano) {
        this.tamano = tamano;
    }

    public void mostrarHamster(){
        System.out.println("Nombre: " + getNombre());
        System.out.println("Tamano: " + getTamano() + " centimetros");
    }
}
