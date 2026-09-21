package poo.relacionamento_entre_classes.emprestimo_livros;

import java.util.Date;

public class Emprestimo {
    private Pessoa pessoa;
    private Livro livro;
    private Date retirada;

    public Emprestimo(Pessoa pessoa, Livro livro) {
        this.pessoa = pessoa;
        this.livro = livro;
    }


    @Override
    public String toString() {
        return "Emprestimo para [cliente=" + pessoa.getNome() +
        ", email = "+pessoa.getEmail()+
         ", livro=" + livro.getTitulo() +
         ", autor = "+livro.getAutor()+ 
         "Retirada em ="+ retirada +"]";
    }
}