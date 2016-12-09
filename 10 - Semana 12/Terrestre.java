package estudo.tecnico.house;

public class Terrestre extends Transporte {
    protected int numRodas;
    
    public Terrestre(int capacidade, int numRodas) {
        super(capacidade);
        this.numRodas = numRodas;
    }

    public int getNumRodas() {
        return numRodas;
    }

    public void setNumRodas(int numRodas) {
        this.numRodas = numRodas;
    }
    
}
