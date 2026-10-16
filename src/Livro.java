public class Livro {

    String titulo;
    String autor;
    int ano;
    String emprestimo;
    boolean emprestado = false;

    public Livro(String titulo, String autor, int ano, String emprestimo) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.emprestimo = emprestimo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return ano;
    }
    public String getAutor() {
        return autor;
    }
    public String getTitulo() {
        return titulo;
    }
    public String getEmprestimo() {
        if (emprestado == false) {
            emprestimo = "Disponível";
        } else {
            emprestimo = "Emprestado";
        }
        return emprestimo;
    }
    public boolean getEmprestado() {
        return emprestado;
    }

    public void emprestar() {
        emprestado = true;
    }

}