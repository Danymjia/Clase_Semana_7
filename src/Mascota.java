public class Mascota {

    private String sonido;
    private int edad;

    public Mascota() {
    }

    public Mascota(String sonido, int edad) {
        this.sonido = sonido;
        this.edad = edad;
    }

    public String getSonido() {
        return sonido;
    }

    public void setSonido(String sonido) {
        this.sonido = sonido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void mostrarMascota() {
        System.out.println("Sonido: " + sonido);
        System.out.println("Edad: " + edad);
    }
}
