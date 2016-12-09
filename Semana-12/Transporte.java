package estudo.tecnico.house;

public class Transporte {
    protected int capacidade;
    
    public Transporte (int capacidade) {
        super();                            //Chama o construtor sem parâmetro da superclasse, que nesse caso é a Object, classe mãe de todas as classes.
        this.capacidade = capacidade;        
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
        
}
