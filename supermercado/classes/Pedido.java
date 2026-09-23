package supermercado.classes;

import java.time.LocalDate;

public class Pedido {
    private Cliente cliente;
    private Itens_pedido itens;
    private Pagamento pagamento;
    private LocalDate data_compra;
   

    
    public Pedido(Cliente cliente, Itens_pedido itens, Pagamento pagamento) {
        this.cliente = cliente;
        this.itens = itens;
        this.pagamento = pagamento;
        this.data_compra = LocalDate.now();
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Itens_pedido getItens() {
        return itens;
    }
    public void setItens(Itens_pedido itens) {
        this.itens = itens;
    }
    public Pagamento getPagamento() {
        return pagamento;
    }
    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }
    public LocalDate getData_compra() {
        return data_compra;
    }
    public void setData_compra(LocalDate data_compra) {
        this.data_compra = data_compra;
    }
   

    @Override
    public String toString() {
        return "Pedido [cliente=" + cliente + ", itens=" + itens + ", pagamento=" + pagamento + ", data da compra="
                + data_compra + "]";
    }

}
