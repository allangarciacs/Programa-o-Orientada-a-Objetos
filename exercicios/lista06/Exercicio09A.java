public class Livro {
    String titulo;
    String autor;
    int paginas;
    boolean emprestado;

    public Livro(String titulo, String autor, int paginas, boolean emprestado) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.emprestado = emprestado;
    }

    public boolean emprestar() {
        if (!emprestado) {
            emprestado = true;
            return true;
        }
        return false;
    }

    public void devolver() {
        emprestado = false;
    }

    public boolean estaDisponivel() {
        return !emprestado;
    }

    public String detalhesLivro() {
        return "Título: " + titulo + " - Autor: " + autor + " - Páginas: " + paginas + " - Disponível: " + (!emprestado);
    }
}