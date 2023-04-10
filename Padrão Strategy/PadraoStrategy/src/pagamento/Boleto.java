// Grupo: CLARISSE DINIZ, EDSON LIMA E MATHEUS MILBRATZ

package pagamento;

public class Boleto implements Pagamento{

    @Override
    public Double pagar(Double valor) {
        // Quando o pagamento é feito por boleto o valor permanece o mesmo
        return valor;
    }
}
