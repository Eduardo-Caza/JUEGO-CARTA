import java.util.Random;

public class Carta {
    private String Nombre;

    public Carta(String nombre) {
        this.Nombre = nombre;
    }

    public String getNombre() {
        return Nombre;
    }

    public void jugar(){
        System.out.println("Estoy Jugando");
    }
    public void MostrarDescripcion(){
        System.out.println("Descripcion");
    }
}

class CartaNumerica extends Carta{
    public CartaNumerica() {
        super(new String[]{"2", "3", "4", "5", "6", "7", "8", "9", "10", "A", "J", "Q", "K"}[new Random().nextInt(13)]); // Genera un nombre de carta aleatorio
    }

    @Override
    public void MostrarDescripcion() {
        System.out.println("Nombre:"+getNombre());
    }
}
