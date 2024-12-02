package Practica.CarlosCarvajal;
import java.util.List;

public class Ejemplar {
    private int id;
    private Titulo titulo; // Relación de 0..1 con Titulo

    // Constructor
    public Ejemplar(int id, Titulo titulo) {
        this.id = id;
        this.titulo = titulo;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Titulo getTitulo() {
        return titulo;
    }

    public void setTitulo(Titulo titulo) {
        this.titulo = titulo;
    }

    // Método para crear un ejemplar
    public static Ejemplar crear(int id, Titulo titulo, List<Ejemplar> listaEjemplares) {
        Ejemplar ejemplar = new Ejemplar(id, titulo);
        listaEjemplares.add(ejemplar); // Agregar a la lista de ejemplares
        System.out.println("Ejemplar creado con ID: " + id + ", asociado al título: " + titulo.getNombre());
        return ejemplar;
    }

    // Método para destruir un ejemplar
    public void destruir(List<Ejemplar> listaEjemplares) {
        listaEjemplares.remove(this); // Eliminar de la lista
        System.out.println("Ejemplar destruido con ID: " + id);
    }

    // Método para encontrar un ejemplar por ID
    public static Ejemplar encontrar(int id, List<Ejemplar> listaEjemplares) {
        for (Ejemplar ejemplar : listaEjemplares) {
            if (ejemplar.getId() == id) {
                System.out.println("Ejemplar encontrado con ID: " + id);
                return ejemplar;
            }
        }
        System.out.println("Ejemplar no encontrado con ID: " + id);
        return null;
    }
}

