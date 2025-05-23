package Comportamentale3.ChainOfResponsabilities3;

public abstract class Verificator {
    private Verificator nextHandler;

    public Verificator getNextHandler() {
        return nextHandler;
    }

    public void setNextHandler(Verificator nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void procesareCerere(Masina masina);
}
