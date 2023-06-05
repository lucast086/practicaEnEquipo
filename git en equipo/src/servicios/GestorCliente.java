package servicios;

public class GestorCliente {
    private Biblioteca biblioteca;
    public GestorClientes(Biblioteca biblioteca) {
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
