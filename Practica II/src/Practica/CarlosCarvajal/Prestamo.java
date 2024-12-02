package Practica.CarlosCarvajal;

import java.util.Date;
import java.util.List;

public class Prestamo {
    private Date fechaActual;
    private Ejemplar ejemplar; // Relación 0..1 con Ejemplar
    private Informacion_Prestatario prestamista; // Relación 0..1 con Informacion_Prestatario

    // Constructor
    public Prestamo(Date fechaActual, Ejemplar ejemplar, Informacion_Prestatario prestamista) {
        this.fechaActual = fechaActual;
        this.ejemplar = ejemplar;
        this.prestamista = prestamista;
    }

    // Getters y Setters
    public Date getFechaActual() {
        return fechaActual;
    }

    public void setFechaActual(Date fechaActual) {
        this.fechaActual = fechaActual;
    }

    public Ejemplar getEjemplar() {
        return ejemplar;
    }

    public void setEjemplar(Ejemplar ejemplar) {
        this.ejemplar = ejemplar;
    }

    public Informacion_Prestatario getPrestamista() {
        return prestamista;
    }

    public void setPrestamista(Informacion_Prestatario prestamista) {
        this.prestamista = prestamista;
    }

    // Método para crear un préstamo
    public static Prestamo crear(Date fechaActual, Ejemplar ejemplar, Informacion_Prestatario prestamista, List<Prestamo> listaPrestamos) {
        Prestamo prestamo = new Prestamo(fechaActual, ejemplar, prestamista);
        listaPrestamos.add(prestamo); // Agregar a la lista de préstamos
        System.out.println("Préstamo creado: Ejemplar ID " + ejemplar.getId() + ", Prestamista: " + prestamista.getNombre());
        return prestamo;
    }

    // Método para destruir un préstamo
    public void destruir(List<Prestamo> listaPrestamos) {
        listaPrestamos.remove(this); // Eliminar de la lista
        System.out.println("Préstamo destruido: Ejemplar ID " + ejemplar.getId() + ", Prestamista: " + prestamista.getNombre());
    }

    // Método para encontrar un préstamo por Ejemplar
    public static Prestamo encontrar(Ejemplar ejemplar, List<Prestamo> listaPrestamos) {
        for (Prestamo prestamo : listaPrestamos) {
            if (prestamo.getEjemplar().equals(ejemplar)) {
                System.out.println("Préstamo encontrado para el ejemplar ID: " + ejemplar.getId());
                return prestamo;
            }
        }
        System.out.println("No se encontró un préstamo para el ejemplar ID: " + ejemplar.getId());
        return null;
    }
}

