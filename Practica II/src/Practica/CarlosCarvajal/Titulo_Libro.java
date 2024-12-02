package Practica.CarlosCarvajal;

public class Titulo_Libro extends Titulo{
    private int tiempo_pendiente = 30;

    public Titulo_Libro(String nombre, String autor, String isbn, int numero_de_reserva){
        super(nombre, autor, isbn, numero_de_reserva);
    }

    public int getTiempo_pendiente() {
        return tiempo_pendiente;
    }
}
