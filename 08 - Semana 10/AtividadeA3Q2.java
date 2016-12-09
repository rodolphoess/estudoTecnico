package estudo.imd.house;

public class AtividadeA3Q2 {

    public static void main(String[] args) {
        
        CarroAtividadeA3Q2 ferrari = new CarroAtividadeA3Q2();
        
        CarroAtividadeA3Q2 bugatti = new CarroAtividadeA3Q2();
        
        CarroAtividadeA3Q2 lykanHypersport = new CarroAtividadeA3Q2();
        
        ferrari.cor = "vermelha";
        ferrari.numPortas = 2;
        ferrari.placa = "MKK-0001";
        ferrari.tipo = "esportivo";
        
        bugatti.cor = "azul marinho";
        bugatti.numPortas = 2;
        bugatti.placa = "MKK-0002";
        bugatti.tipo = "esportivo";
        
        lykanHypersport.cor = "branca";
        lykanHypersport.numPortas = 2;
        lykanHypersport.placa = "MKK-0003";
        lykanHypersport.tipo = "esportivo";
        
        System.out.println("A Ferrari de cor " + ferrari.cor + " possui " + ferrari.numPortas + " portas, placa " + ferrari.placa + " e é um carro do tipo " + ferrari.tipo + ".");
        System.out.println("\nA Bugatti de cor " + bugatti.cor + " possui " + bugatti.numPortas + " portas, placa " + bugatti.placa + " e é um carro do tipo " + bugatti.tipo + ".");
        System.out.println("\nA Lykan Hypersport de cor " + lykanHypersport.cor + " possui " + lykanHypersport.numPortas + " portas, placa " + lykanHypersport.placa + " e é um "
                + "carro do tipo " + lykanHypersport.tipo + ".");
        
    }
    
}
