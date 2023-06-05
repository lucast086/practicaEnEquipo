package entidades;
import java.util.ArrayList;
import java.util.List;
public class Biblioteca {
    
    private List<Libro> libros;
    private List<Cliente> clientes;
    public Biblioteca() {
        this.libros = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }
    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }
    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }
    public List<Libro> buscarLibroPorTitulo(String titulo) {
        List<Libro> librosEncontrados = new ArrayList<>();
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                librosEncontrados.add(libro);
            }
        }
        return librosEncontrados;
    }
    public List<Libro> buscarLibroPorAutor(String autor) {
        List<Libro> librosEncontrados = new ArrayList<>();
        for (Libro libro : libros) {
            if (libro.getAutor().equalsIgnoreCase(autor)) {
                librosEncontrados.add(libro);
            }
        }
        return librosEncontrados;
    }
    public List<Cliente> buscarClientePorNombre(String nombre) {
        List<Cliente> clientesEncontrados = new ArrayList<>();
        for (Cliente cliente : clientes) {
            if (cliente.getNombre().equalsIgnoreCase(nombre)) {
                clientesEncontrados.add(cliente);
            }
        }
        return clientesEncontrados;
    }
    public List<Cliente> buscarClientePorTelefono(String telefono) {
        List<Cliente> clientesEncontrados = new ArrayList<>();
        for (Cliente cliente : clientes) {
            if (cliente.getTelefono().equals(telefono)) {
                clientesEncontrados.add(cliente);
            }
        }
        return clientesEncontrados;
    }
    public void mostrarLibrosDisponibles() {
        for (Libro libro : libros) {
            System.out.println(libro);
        }
    }
    public void mostrarClientesRegistrados() {
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
    }
    
}