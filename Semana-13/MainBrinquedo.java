package estudo.casa.tecnico;

public class MainBrinquedo {
    
    public static void main(String[] args) {
        
        Brinquedo brinq1 = new Brinquedo("HotWheels");
        System.out.println("Brinquedo " + brinq1.getNome() + "!");
        brinq1.mover();
        brinq1.velocidade(7.89);
        brinq1.velocidade(7);
        brinq1.velocidade(7.89f, 2.5);
        
        
        System.out.println("");
        Brinquedo brinq2 = new Brinquedo();
        brinq2.mover();
        brinq2.velocidade(5.67);
        brinq2.velocidade(5);
        brinq2.velocidade(5.67f, 2.0);
        
        System.out.println("");
        Carro carro1 = new Carro();         //A partir daqui é caracterizado o polimorfismo de sobreposição, onde será explicitado o primeiro método condizente ao ser procurado na árvore de classes.
        carro1.mover();
        
        System.out.println("");
        Avião aviao1 = new Avião();
        aviao1.mover();
        
        System.out.println("");
        Barco barco1 = new Barco();
        barco1.mover();
        
        System.out.println("");
        ControleRemoto cr = new ControleRemoto(carro1);
        cr.mover();
        
    }
    
}
