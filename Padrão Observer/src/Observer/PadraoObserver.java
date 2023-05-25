package Observer;

import Dados.Info;
import Dados.TrianguloObserver;
import Dados.DadosSubject;
import Dados.RetanguloObserver;

public class PadraoObserver {

    public static void main(String[] args) {
        DadosSubject dados = new DadosSubject();

        dados.attach(new RetanguloObserver(dados));
        dados.attach(new TrianguloObserver(dados));

        dados.setState(new Info(9, 6));
        System.out.println("#########################################################");
        dados.setState(new Info(10, 4));
        System.out.println("#########################################################");
        dados.setState(new Info(8, 3));
    }
    
}
