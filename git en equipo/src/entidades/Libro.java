package git.en.equipo.entidades;
public class Libro {
    
    private String titulo;
    private String autor;
    private int anoPublicacion;

    public Libro(String titulo, String autor, int anoPublicacion) {
    this.titulo = titulo;
    this.autor = autor;
    this.anoPublicacion = anoPublicacion;
    }

// Getters y setters

    public String getTitulo() {
    return titulo;
    }

    public void setTitulo(String titulo) {
    this.titulo = titulo;
    }

    public String getAutor() {
    return autor;
    }

    public void setAutor(String autor) {
    this.autor = autor;
    }

    public int getAnoPublicacion() {return anoPublicacion;
    }

    public void setAnoPublicacion(int anoPublicacion) {
    this.anoPublicacion = anoPublicacion;
    }

    @Override
    public String toString() {
    return "Libro [titulo=" + titulo + ", autor=" + autor + ", anoPublicacion=" + anoPublicacion +
    "]";
    }
    
}

