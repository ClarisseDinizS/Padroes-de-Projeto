// Grupo: CLARISSE DINIZ, EDSON LIMA E MATHEUS MILBRATZ

package pagamento;

public class CartaoCredito implements Pagamento{

    @Override
    public Double pagar(Double valor) {
        // Quando o pagamento é feito por cartão de crédito, haverá juros de 5%
        return valor * 1.05;
    }
}
