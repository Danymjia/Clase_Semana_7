package Transportes;

public class Bicicleta extends Transporte {

    private String tipo;
    private int marchas;

    public Bicicleta() {
    }

    public Bicicleta(int capacidad, double velocidad, String tipo, int marchas) {
        super(capacidad, velocidad);
        this.tipo = tipo;
        this.marchas = marchas;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getMarchas() {
        return marchas;
    }

    public void setMarchas(int marchas) {
        this.marchas = marchas;
    }

    public void prenderLuces(){
        System.out.println("Prender Luces");
    }
}
