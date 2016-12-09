package imd.estudo.house;

import java.util.Scanner;

public class FatorialIterativo {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Digite um número para o calculo do fatorial: ");
        int numero = Integer.parseInt(leitor.nextLine());
        
        if (numero == 0) {
            System.out.println("O fatorial de " + numero + " é: 1");
        } else if (numero < 0) {
            System.out.println("Não é possível calcular fatorial de número negativo.");
        } else {
            int fatorial = 1;
            for (int i = 1 ; i < numero ; i++) {
                fatorial = fatorial * (i + 1);
            }

            System.out.println("O fatorial de " + numero + " é: " + fatorial);
        }
        
    }
    
}
