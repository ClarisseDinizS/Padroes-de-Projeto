// Grupo: CLARISSE DINIZ, EDSON LIMA E MATHEUS MILBRATZ

package pagamento;

import java.util.List;

public class Comanda {
    private Pagamento pagamento;

    private TipoPagamento tipoPagamento;
    private Double valorTotal;
    private List<Lanche> lanches;

    public Comanda(TipoPagamento tipoPagamento, List<Lanche> lanches) {
        this.valorTotal = 0d;
        calcularValorTotalLanches(lanches);
        this.atualizarPagamento(tipoPagamento);
        this.lanches = lanches;
    }
    
    private void calcularValorTotalLanches(List<Lanche> lanches)
    {
        for (Lanche lanche : lanches) {
            this.valorTotal += lanche.getPreco();
        }
    }
    
    // Atualiza o preço dos lanches de acordo com as taxas de cada tipo de pagamento
    public void atualizarPagamento(TipoPagamento tipoPagamento){
        
        if(TipoPagamento.CARTAO_CREDITO.equals(tipoPagamento)){
            pagamento = new CartaoCredito();
            this.valorTotal = pagamento.pagar(this.valorTotal);
        }
        
        else if(TipoPagamento.DINHEIRO.equals(tipoPagamento)){
            pagamento = new Dinheiro();
            this.valorTotal = pagamento.pagar(this.valorTotal);
        }
        
        else if(TipoPagamento.BOLETO.equals(tipoPagamento)){
            pagamento = new Boleto();
            this.valorTotal = pagamento.pagar(this.valorTotal);
        }
        
        this.tipoPagamento = tipoPagamento;
    }


    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public TipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(TipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public List<Lanche> getLanches() {
        return lanches;
    }

    public void setLanches(List<Lanche> lanches) {
        this.lanches = lanches;
    }
}
