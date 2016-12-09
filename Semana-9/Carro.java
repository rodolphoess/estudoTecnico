package estudo.tecnico.house;

public class Carro {
    
    private String cor;
    private String tipo;
    private int ano;  
    
    public Carro(String tipo, int ano) {                //Construtor. Sempre que for criado uma instância usando new na classe principal o construtor será invocado.
        this.tipo = tipo;
        this.ano = ano;
        System.out.println("Tipo: " + tipo + "\nAno: " + ano);
    }   
    
    public Carro() {
        System.out.println("Você criou um carro!");          

    }
    
    public void setCor(String cor) {
        this.cor = cor;        
    }
    
    public String getCor() {
        return this.cor;
    }
}