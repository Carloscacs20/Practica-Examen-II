package Practica.CarlosCarvajal;

import java.util.ArrayList;
import java.util.List;

public class Titulo {
    private String nombre;
    private String autor;
    private String isbn;
    private int numero_de_reserva;
    private List<Ejemplar> ejemplars; // Relación de 0..* con Ejemplar

    // Constructor
    public Titulo(String nombre, String autor, String isbn, int numero_de_reserva) {
        this.nombre = nombre;
        this.autor = autor;
        this.isbn = isbn;
        this.numero_de_reserva = numero_de_reserva;
        this.ejemplars = new ArrayList<>();
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getNumero_de_reserva() {
        return numero_de_reserva;
    }

    public void setNumero_de_reserva(int numero_de_reserva) {
        this.numero_de_reserva = numero_de_reserva;
    }

    public List<Ejemplar> getEjemplars() {
        return ejemplars;
    }

    public void setEjemplars(List<Ejemplar> ejemplars) {
        this.ejemplars = ejemplars;
    }

    // Método para agregar un ejemplar al título
    public void agregarEjemplar(Ejemplar ejemplar) {
        ejemplars.add(ejemplar);
    }

    // Crear un nuevo título
    public static Titulo crear(String nombre, String autor, String isbn, int numero_de_reserva) {
        Titulo titulo = new Titulo(nombre, autor, isbn, numero_de_reserva);
        System.out.println("Título creado: " + nombre);
        return titulo;
    }

    // Método para "destruir" un título
    public void destruir() {
        System.out.println("Título destruido: " + nombre);
        this.nombre = null;
        this.autor = null;
        this.isbn = null;
        this.numero_de_reserva = 0;
        this.ejemplars.clear(); // Se eliminan los ejemplares asociados
    }

    // Método para encontrar un título por nombre
    public static Titulo encontrar(String nombre, List<Titulo> listaTitulos) {
        for (Titulo titulo : listaTitulos) {
            if (titulo.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("Título encontrado: " + titulo.getNombre());
                return titulo;
            }
        }
        System.out.println("Título no encontrado: " + nombre);
        return null;
    }
}

