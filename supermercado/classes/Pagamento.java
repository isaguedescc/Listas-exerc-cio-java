package supermercado.classes;

import java.util.Date;

public class Pagamento {
    private Date data_pagamento;
    private String forma_pagamento;
    private boolean pago;

    
    public Pagamento(Date data_pagamento, String forma_pagamento, boolean pago) {
        this.data_pagamento = data_pagamento;
        this.forma_pagamento = forma_pagamento;
        this.pago = pago;
    }

    public Date getData_pagamento() {
        return data_pagamento;
    }
    public void setData_pagamento(Date data_pagamento) {
        this.data_pagamento = data_pagamento;
    }
    public String getForma_pagamento() {
        return forma_pagamento;
    }
    public void setForma_pagamento(String forma_pagamento) {
        this.forma_pagamento = forma_pagamento;
    }
    public boolean isPago() {
        return pago;
    }
    public void setPago(boolean pago) {
        this.pago = pago;
    }

    @Override
    public String toString() {
        return "Pagamento [data do pagamento=" + data_pagamento +
        "| forma de pagamento=" + forma_pagamento + "| pago=" + pago
        + "]";
    }

    


    
}
