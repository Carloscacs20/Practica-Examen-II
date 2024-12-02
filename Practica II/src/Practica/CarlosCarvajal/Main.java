package Practica.CarlosCarvajal;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Listas para almacenar los objetos creados
        List<Titulo> listaTitulos = new ArrayList<>();
        List<Ejemplar> listaEjemplares = new ArrayList<>();
        List<Reserva> listaReservas = new ArrayList<>();
        List<Prestamo> listaPrestamos = new ArrayList<>();
        List<Informacion_Prestatario> listaPrestatarios = new ArrayList<>();

        // Crear títulos
        Titulo libro1 = Titulo.crear("El Principito", "Antoine de Saint-Exupéry", "12345", 5);
        listaTitulos.add(libro1);

        Titulo revista1 = new Titulo_Revista("National Geographic", "Editorial NatGeo", "67890", 3);
        listaTitulos.add(revista1);

        // Crear ejemplares
        Ejemplar ejemplar1 = Ejemplar.crear(1, libro1, listaEjemplares);
        Ejemplar ejemplar2 = Ejemplar.crear(2, revista1, listaEjemplares);

        // Crear prestatarios
        Informacion_Prestatario prestatario1 = Informacion_Prestatario.crear(
                "Juan Pérez", "Calle 123", "Activo", "P001", listaPrestatarios
        );

        Informacion_Prestatario prestatario2 = Informacion_Prestatario.crear(
                "Ana López", "Avenida 456", "Activo", "P002", listaPrestatarios
        );

        // Crear reservas
        Reserva reserva1 = Reserva.crear(new Date(), libro1, prestatario1, listaReservas);

        // Crear préstamos
        Prestamo prestamo1 = Prestamo.crear(new Date(), ejemplar1, prestatario2, listaPrestamos);

        // Operaciones de búsqueda
        Titulo tituloEncontrado = Titulo.encontrar("El Principito", listaTitulos);
        Ejemplar ejemplarEncontrado = Ejemplar.encontrar(1, listaEjemplares);
        Reserva reservaEncontrada = Reserva.encontrar(libro1, listaReservas);
        Prestamo prestamoEncontrado = Prestamo.encontrar(ejemplar1, listaPrestamos);
        Informacion_Prestatario prestatarioEncontrado = Informacion_Prestatario.encontrar("P001", listaPrestatarios);

        // Eliminar objetos
        if (tituloEncontrado != null) tituloEncontrado.destruir();
        if (ejemplarEncontrado != null) ejemplarEncontrado.destruir(listaEjemplares);
        if (reservaEncontrada != null) reservaEncontrada.destruir(listaReservas);
        if (prestamoEncontrado != null) prestamoEncontrado.destruir(listaPrestamos);
        if (prestatarioEncontrado != null) prestatarioEncontrado.destruir(listaPrestatarios);

        // Mostrar estado final
        System.out.println("Lista de títulos: " + listaTitulos.size());
        System.out.println("Lista de ejemplares: " + listaEjemplares.size());
        System.out.println("Lista de reservas: " + listaReservas.size());
        System.out.println("Lista de préstamos: " + listaPrestamos.size());
        System.out.println("Lista de prestatarios: " + listaPrestatarios.size());
    }
}
