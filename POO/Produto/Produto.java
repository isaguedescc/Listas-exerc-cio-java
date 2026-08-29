package POO.Produto;
/* Fazer um programa para ler os dados de um produto em estoque
(nome, preço e quantidade no estoque). Em seguida:
❖ Mostrar os dados do produto (nome, preço, quantidade no
estoque, valor total no estoque)
❖ Realizar uma entrada no estoque e mostrar novamente os dados
do produto
❖ Realizar uma saída no estoque e mostrar novamente os dados
do produto.
❖ Desenvolva, usando a UML (diagrama de classe), e
posteriormente na linguagem Java.*/

public class Produto {
    private String nome;
    private float preco;
    private int quantidade;

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setPreco(float preco){
        this.preco = preco;
    }

    public float getPreco(){
        return preco;
    }

    public void setQuant(int quantidade){
        this.quantidade = quantidade;
    }

    public int getQuant(){
        return quantidade;
    }

   

    public float getEstoque(){
     float total = this.preco * this.quantidade;
        return total;

    }

    public int getSaida(int retirada){
        int newQuantidade = this.quantidade - retirada;
        return newQuantidade;
    }




}
