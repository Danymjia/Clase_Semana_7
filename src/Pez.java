import javax.xml.transform.Source;

public class Pez extends Mascota{

    private String nombre;
    private String color;

    public Pez(String sonido, int edad, String nombre, String color) {
        super(sonido, edad);
        this.nombre = nombre;
        this.color = color;
    }

    public Pez(String sonido, int edad) {
        super(sonido, edad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void mostrarPez(){
        System.out.println("Sonido: " + this.getSonido());
        System.out.println("Edad: " + this.getEdad());
        System.out.println("Nombre: " + nombre);
        System.out.println("Color: " + color);
    }
}
