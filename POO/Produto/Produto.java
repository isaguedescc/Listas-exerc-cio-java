package POO.Produto;

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




}
