package Comportamentale2.ChainOfResponsailities2;

public class Comanda {
    private String produs;
    private  int cantitate;
    private int grad;

    public Comanda(String produs, int cantitate, int grad) {
        this.produs = produs;
        this.cantitate = cantitate;
        this.grad = grad;
    }

    public String getProdus() {
        return produs;
    }

    public void setProdus(String produs) {
        this.produs = produs;
    }

    public int getCantitate() {
        return cantitate;
    }

    public void setCantitate(int cantitate) {
        this.cantitate = cantitate;
    }

    public int getGrad() {
        return grad;
    }

    public void setGrad(int grad) {
        this.grad = grad;
    }
}
