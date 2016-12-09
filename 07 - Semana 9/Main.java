package estudo.tecnico.house;

public class Main {

    public static void main(String[] args) {
        
        Carro ferrari = new Carro("esportivo", 2015); //Executará o construtor na classe carro com parâmetro.
        ferrari.setCor("vermelha");
        
        Carro carro2 = new Carro(); //Executará o construtor na classe carro sem parâmetro.
        
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Liri");
        
        System.out.println("Ela é uma Ferrari de cor " + ferrari.getCor() + ".");
        //System.out.println("Esse carro pertence a: " + carro2.getDono().getNome());
        
        
    }
    
}
