package supermercado.classes;

public class Itens_pedido {
    private int quant;
    private Produto produto;

    public Itens_pedido(int quant, Produto produto) {
        this.quant = quant;
        this.produto = produto;
    }

    public int getQuant() {
        return quant;
    }
    public void setQuant(int quant) {
        this.quant = quant;
    }
    public Produto getProduto() {
        return produto;
    }
    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public boolean isQuantDisponivel() {
        if ( getQuant() > produto.getEstoque()) {
            return false;
        }
        return true;
       
    }

    public float subTotal(){
        float subtotal = this.quant* produto.getPreco();
        return subtotal;
    }

    @Override
    public String toString() {
        return "Item(s) [quantidade =" + quant +"\n"+
        "| Produto=" + produto +"\n"+
        "| subTotal=" + subTotal() + "]";
    }

    
}
