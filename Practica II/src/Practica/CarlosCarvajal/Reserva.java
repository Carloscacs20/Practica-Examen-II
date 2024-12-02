package Practica.CarlosCarvajal;

import java.util.Date;
import java.util.List;

public class Reserva {
    private Date fecha;
    private Titulo titulo; // Relación con Titulo
    private Informacion_Prestatario prestatario; // Relación con Informacion_Prestatario

    // Constructor
    public Reserva(Date fecha, Titulo titulo, Informacion_Prestatario prestatario) {
        this.fecha = fecha;
        this.titulo = titulo;
        this.prestatario = prestatario;
    }

    // Getters y Setters
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Titulo getTitulo() {
        return titulo;
    }

    public void setTitulo(Titulo titulo) {
        this.titulo = titulo;
    }

    public Informacion_Prestatario getPrestatario() {
        return prestatario;
    }

    public void setPrestatario(Informacion_Prestatario prestatario) {
        this.prestatario = prestatario;
    }

    // Método para crear una reserva
    public static Reserva crear(Date fecha, Titulo titulo, Informacion_Prestatario prestatario, List<Reserva> listaReservas) {
        Reserva reserva = new Reserva(fecha, titulo, prestatario);
        listaReservas.add(reserva); // Agregar la reserva a la lista
        System.out.println("Reserva creada para el título: " + titulo.getNombre() + " en la fecha: " + fecha);
        return reserva;
    }

    // Método para destruir una reserva
    public void destruir(List<Reserva> listaReservas) {
        listaReservas.remove(this); // Eliminar la reserva de la lista
        System.out.println("Reserva destruida para el título: " + titulo.getNombre());
    }

    // Método para encontrar una reserva por título
    public static Reserva encontrar(Titulo titulo, List<Reserva> listaReservas) {
        for (Reserva reserva : listaReservas) {
            if (reserva.getTitulo().equals(titulo)) {
                System.out.println("Reserva encontrada para el título: " + titulo.getNombre());
                return reserva;
            }
        }
        System.out.println("Reserva no encontrada para el título: " + titulo.getNombre());
        return null;
    }
}

