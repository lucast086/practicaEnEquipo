
package git.en.equipo.servicios;

import git.en.equipo.entidades.Biblioteca;
import git.en.equipo.entidades.Libro;

import java.util.List;

public class GestorLibros {


 private Biblioteca biblioteca;
 public GestorLibros(Biblioteca biblioteca) {
 this.biblioteca = biblioteca;
 }
 public void agregarLibro(String titulo, String autor, int anoPublicacion) {
 Libro libro = new Libro(titulo, autor, anoPublicacion);
 biblioteca.agregarLibro(libro);
 }
 public List<Libro> buscarLibroPorTitulo(String titulo) {
 return biblioteca.buscarLibroPorTitulo(titulo);
 }
 public List<Libro> buscarLibroPorAutor(String autor) {
 return biblioteca.buscarLibroPorAutor(autor);
 }
 public void mostrarLibrosDisponibles() {
 biblioteca.mostrarLibrosDisponibles();
 }
}

