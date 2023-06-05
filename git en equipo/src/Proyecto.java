package git.en.equipo;

import entidades.Biblioteca;
import entidades.Cliente;
import entidades.Libro;
import java.util.List;
import servicios.GestorClientes;
import servicios.GestorLibros;

public class Proyecto {

    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();
        GestorLibros gestorLibros = new GestorLibros(biblioteca);
        GestorClientes gestorClientes = new GestorClientes(biblioteca);
// Agregar libros
        gestorLibros.agregarLibro("Libro 1", "Autor 1", 2020);
        gestorLibros.agregarLibro("Libro 2", "Autor 2", 2019);
        gestorLibros.agregarLibro("Libro 3", "Autor 1", 2021);
// Agregar clientes
        gestorClientes.agregarCliente("Cliente 1", "Dirección 1", "111111111");
        gestorClientes.agregarCliente("Cliente 2", "Dirección 2", "222222222");
// Buscar libros
        List<Libro> librosPorTitulo = gestorLibros.buscarLibroPorTitulo("Libro 1");
        System.out.println("Libros encontrados por título:");
        for (Libro libro : librosPorTitulo) {
            System.out.println(libro);
        }
        List<Libro> librosPorAutor = gestorLibros.buscarLibroPorAutor("Autor 1");
        System.out.println("Libros encontrados por autor:");
        for (Libro libro : librosPorAutor) {
            System.out.println(libro);
        }
// Buscar clientes
        List<Cliente> clientesPorNombre = gestorClientes.buscarClientePorNombre("Cliente 1");
        System.out.println("Clientes encontrados por nombre:");
        for (Cliente cliente : clientesPorNombre) {
            System.out.println(cliente);
        }
        List<Cliente> clientesPorTelefono = gestorClientes.buscarClientePorTelefono("222222222");
        System.out.println("Clientes encontrados por teléfono:");
        for (Cliente cliente : clientesPorTelefono) {
            System.out.println(cliente);
        }
// Mostrar libros y clientes
        System.out.println("Libros disponibles:");
        gestorLibros.mostrarLibrosDisponibles();
        System.out.println("Clientes registrados:");
        gestorClientes.mostrarClientesRegistrados();     
      
    }
}
