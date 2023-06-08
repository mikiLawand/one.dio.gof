package Strategy;

public class Robo {
    
    //definindo o comportamento dele na propriedade 
    private Comportamento comportamento;

    //permitindo que o aplicativo faça a escolha do comportamento
    public void setComportamento(Comportamento comportamento) {
        this.comportamento = comportamento;
    }

    //delegando a responsabilidade de mover para o comportamento
    public void mover() {
        comportamento.mover();
    }


}

