package poo.relacionamento_entre_classes.emprestimo_livros;

public class Livro {
    private String titulo;
    private String autor;
    private String editora;
    private int codigo;
    
    public Livro(String titulo, String autor, String editora) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora =editora;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setEditora(String editora){
        this.editora = editora;
    }

    public String getEditora(){
        return editora;
    }
}
