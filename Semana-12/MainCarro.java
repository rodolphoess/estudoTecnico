package estudo.tecnico.house;

import java.util.Scanner;

public class MainCarro {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Informe a capacidade do carro: ");
        int capacidade = leitor.nextInt();
        System.out.print("Informe o número de rodas do carro: ");
        int numRodas = leitor.nextInt();
        System.out.print("Informe a cor do carro: ");
        String cor = leitor.next();
        System.out.print("Informe o número de portas: ");
        int numPortas = leitor.nextInt();
        System.out.print("Informe a placa do carro: ");
        String placa = leitor.next();
        
        Automovel carro1 = new Automovel(capacidade, numRodas, cor, numPortas, placa);
        
        System.out.println("\n" + carro1.toString());
    }
    
}
