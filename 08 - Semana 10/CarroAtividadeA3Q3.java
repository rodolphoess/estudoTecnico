package estudo.imd.house;

public class CarroAtividadeA3Q3 {
    String tipo;
    String cor;
    String placa;
    int numPortas;
    
    
    public CarroAtividadeA3Q3(String placa, int numPortas) {
        this.placa = placa;
        this.numPortas = numPortas;
        System.out.println(" placa " + placa + " e " + numPortas + " portas.");
    }
    
    public CarroAtividadeA3Q3(String tipo, String cor, String placa, int numPortas) {
        this.tipo = tipo;
        this.cor = cor;
        this.placa = placa;
        this.numPortas = numPortas;
        System.out.println(" placa " + placa + ", é " + cor + ", possui " + numPortas + " portas e é do tipo " + tipo + ".");
    }
}
