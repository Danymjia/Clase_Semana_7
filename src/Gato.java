public class Gato extends Mascota{

    private String nombre;
    private String sexo;

    public Gato(String sonido, int edad) {
        super(sonido, edad);
    }

    public void mostrarGato(){
        System.out.println("Sonido: " + this.getSonido());
        System.out.println("Edad: " + this.getEdad());
    }
}
