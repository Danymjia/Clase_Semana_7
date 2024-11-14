public class Tortuga extends Mascota{

    private String nombre;
    private String tipo;

    public Tortuga(){

    }

    public Tortuga(String sonido, int edad) {
        super(sonido, edad);
    }

    public Tortuga(String sonido, int edad, String nombre, String tipo) {
        super(sonido, edad);
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void mostrarTortuga() {
        System.out.println("Sonido: " + this.getSonido());
        System.out.println("Edad: " + this.getEdad());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Tipo: " + getTipo());
    }
}
