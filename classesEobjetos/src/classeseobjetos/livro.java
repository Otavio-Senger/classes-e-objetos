
package classeseobjetos;


public class livro {
    String titulo;
    String autor;
    int numeropaginas;
    int emprestado;
    int devolvido;
    int exemplares = 0;

    public livro(String titulo, String autor, int numeropaginas, int emprestado, int devolvido) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeropaginas = numeropaginas;
        this.emprestado = emprestado;
        this.devolvido = devolvido;
        this.exemplares = exemplares + emprestado - devolvido;
    }

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

    public int getNumeropaginas() {
        return numeropaginas;
    }

    public void setNumeropaginas(int numeropaginas) {
        this.numeropaginas = numeropaginas;
    }

    public int getEmprestado() {
        return emprestado;
    }

    public void setEmprestado(int emprestado) {
        this.emprestado = emprestado;
    }

    public int getDevolvido() {
        return devolvido;
    }

    public void setDevolvido(int devolvido) {
        this.devolvido = devolvido;
    }

    public int getExemplares() {
        return exemplares;
    }

    public void setExemplares(int exemplares) {
        this.exemplares = exemplares;
    }
    
    
    
}
