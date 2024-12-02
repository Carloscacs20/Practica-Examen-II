package Practica.CarlosCarvajal;

public class Titulo_Revista extends Titulo{
    private int tiempo_pendiente = 10;

    public Titulo_Revista(String nombre, String autor, String isbn, int numero_de_reserva){
        super(nombre, autor, isbn, numero_de_reserva);
    }

    public int getTiempo_pendiente() {
        return tiempo_pendiente;
    }
}
