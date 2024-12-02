package Practica.CarlosCarvajal;

import java.util.ArrayList;
import java.util.List;

public class Informacion_Prestatario {
    private String nombre;
    private String direcc;
    private String estado;
    private String codigo;
    private List<Prestamo> prestamos; // Relación de 0..* con Prestamo
    private List<Reserva> reservas; // Relación de 0..* con Reserva

    // Constructor
    public Informacion_Prestatario(String nombre, String direcc, String estado, String codigo) {
        this.nombre = nombre;
        this.direcc = direcc;
        this.estado = estado;
        this.codigo = codigo;
        this.prestamos = new ArrayList<>();
        this.reservas = new ArrayList<>();
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirecc() {
        return direcc;
    }

    public void setDirecc(String direcc) {
        this.direcc = direcc;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public List<Prestamo> getPrestamos() {
        return prestamos;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }

    // Métodos para agregar Prestamos y Reservas
    public void agregarPrestamo(Prestamo prestamo) {
        this.prestamos.add(prestamo);
    }

    public void agregarReserva(Reserva reserva) {
        this.reservas.add(reserva);
    }

    // Método para crear un prestatario
    public static Informacion_Prestatario crear(String nombre, String direcc, String estado, String codigo, List<Informacion_Prestatario> listaPrestatarios) {
        Informacion_Prestatario prestatario = new Informacion_Prestatario(nombre, direcc, estado, codigo);
        listaPrestatarios.add(prestatario); // Agregar el prestatario a la lista
        System.out.println("Prestatario creado: " + nombre);
        return prestatario;
    }

    // Método para destruir un prestatario
    public void destruir(List<Informacion_Prestatario> listaPrestatarios) {
        listaPrestatarios.remove(this); // Eliminar el prestatario de la lista
        System.out.println("Prestatario destruido: " + nombre);
    }

    // Método para encontrar un prestatario por código
    public static Informacion_Prestatario encontrar(String codigo, List<Informacion_Prestatario> listaPrestatarios) {
        for (Informacion_Prestatario prestatario : listaPrestatarios) {
            if (prestatario.getCodigo().equals(codigo)) {
                System.out.println("Prestatario encontrado: " + prestatario.getNombre());
                return prestatario;
            }
        }
        System.out.println("No se encontró un prestatario con el código: " + codigo);
        return null;
    }
}
