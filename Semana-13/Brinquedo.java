package estudo.casa.tecnico;

public class Brinquedo {
    private String nome;
    private double velocidade;
    private double aceleracao;
    
    public Brinquedo() {
        
    }
    
    public Brinquedo(String nome) {
        this.nome = nome;
    }
    
    public void mover() {      
        System.out.println("Brinquedo se movendo!");
    }
    
    public void velocidade(int vel) {
        this.velocidade = vel;
        System.out.println("Brinquedo se movendo a " + velocidade + "km/h.");
    }
    
    public void velocidade(double vel) {
        this.velocidade = vel;
        System.out.println("Brinquedo se movendo a " + velocidade + "km/h.");
    }
    
    public void velocidade(float vel, double ac) {
        this.velocidade = vel;
        this.aceleracao = ac;
        System.out.println("Brinquedo se movendo a " + vel + "km/h e aceleração " + aceleracao + "m/s2.");      
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public double getAceleracao() {
        return aceleracao;
    }

    public void setAceleracao(double aceleracao) {
        this.aceleracao = aceleracao;
    }
    
    
}
