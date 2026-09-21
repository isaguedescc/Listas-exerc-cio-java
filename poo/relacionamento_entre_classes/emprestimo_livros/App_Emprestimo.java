package poo.relacionamento_entre_classes.emprestimo_livros;


public class App_Emprestimo {
    public static void main(String[] args)  {
        Pessoa cliente = new Pessoa("Ana","ana@gmail.com");
        Livro livro = new Livro("biblia", "Diversos","Editora vida" );
        Emprestimo pedido = new Emprestimo(cliente,livro);

    System.out.println(pedido); 
    }
  

}
