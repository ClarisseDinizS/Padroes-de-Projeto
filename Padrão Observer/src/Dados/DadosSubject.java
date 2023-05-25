package Dados;

import java.util.ArrayList;

public class DadosSubject {
    // lista de observers
    protected ArrayList<InfoObserver> observers;
    protected Info info;
    public DadosSubject() {
        observers = new ArrayList<>();
    }
     // acrescenta um observador ao DadosSubject
    public void attach(InfoObserver observer) {
        observers.add(observer);
    }
    // retira um observador do DadosSubject
    public void detach(int index) {
        observers.remove(index);
    }
    // atualiza os dados e notifica os observadores
    public void setState(Info info) {
        this.info = info;
        notifyObservers();
    }
    
    private void notifyObservers() {
        observers.forEach(o -> o.update());
    }
    // pega os dados que estão dentro do DadosSubject
    public Info getState() {
        return info;
    }
}
