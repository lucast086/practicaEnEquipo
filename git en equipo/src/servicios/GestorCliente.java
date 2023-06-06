package git.en.equipo.servicios;

import git.en.equipo.entidades.Biblioteca;
import git.en.equipo.entidades.Cliente;

import java.util.List;

public class GestorCliente {
    private Biblioteca biblioteca;
    public GestorCliente(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }
    public void agregarCliente(String nombre, String direccion, String telefono) {
        Cliente cliente = new Cliente(nombre, direccion, telefono);
        biblioteca.agregarCliente(cliente);
    }
    public List<Cliente> buscarClientePorNombre(String nombre) {
        return biblioteca.buscarClientePorNombre(nombre);
    }
    public List<Cliente> buscarClientePorTelefono(String telefono) {
        return biblioteca.buscarClientePorTelefono(telefono);
    }
    public void mostrarClientesRegistrados() {
        biblioteca.mostrarClientesRegistrados();
    }
}
