package br.estudo.house;

import java.util.Scanner;

public class NumeroImpar {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        for (int i = 1; i <= 10; i++) {
            System.out.print ("Olá usuário, digite um número qualquer: ");
            float numeroDigitado = Float.parseFloat((leitor.nextLine()).replace(",","."));
            float divisibilidadeNumeros = numeroDigitado % 3;
                
            if (divisibilidadeNumeros == 0) {
                    System.out.println ("\nO número " + numeroDigitado + " é ímpar.\n");
                }
        }
    }
    
}
