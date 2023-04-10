// Grupo: CLARISSE DINIZ, EDSON LIMA E MATHEUS MILBRATZ

package padraostrategy;

import pagamento.Comanda;
import pagamento.Lanche;
import pagamento.TipoPagamento;

import java.util.Arrays;
import java.util.List;

public class PadraoStrategy {

	public static void main(String[] args) {
                // Lista de lanches
		List<Lanche> lanches = Arrays.asList(
				new Lanche("X-Total", 18.5),
				new Lanche("X-EggBurguer", 14.5),
				new Lanche("Hamburguer", 10.5)
				);
                
                // Criação das comandas com cada tipo de pagamento
		Comanda comanda01 = new Comanda(TipoPagamento.DINHEIRO, lanches);
		Comanda comanda02 = new Comanda(TipoPagamento.CARTAO_CREDITO, lanches);
		Comanda comanda03 = new Comanda(TipoPagamento.BOLETO, lanches);

		System.out.println("1 - Valor total do lanche: " + comanda01.getValorTotal() + "\nTipo do Pagamento: " + comanda01.getTipoPagamento());
		System.out.println("2 - Valor total do lanche: " + comanda02.getValorTotal() + "\nTipo do Pagamento: " + comanda02.getTipoPagamento());
		System.out.println("3 - Valor total do lanche: " + comanda03.getValorTotal() + "\nTipo do Pagamento: " + comanda03.getTipoPagamento());

		comanda03.atualizarPagamento(TipoPagamento.DINHEIRO);
		System.out.println("3 - Valor total: " + comanda03.getValorTotal() + "\nTipo do Pagamento: " + comanda03.getTipoPagamento());
	}
}