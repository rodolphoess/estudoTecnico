package br.imd.house;

import java.util.Scanner;

public class SomaVariaveis {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner (System.in);
        
        System.out.print ("Digite uma variável qualquer: ");
        double primeiraVariavel = Double.parseDouble((leitor.nextLine()).replace(",","."));
        System.out.print ("Digite uma outra variável qualquer: ");
        double segundaVariavel = Double.parseDouble((leitor.nextLine()).replace(",","."));
        
        double soma = primeiraVariavel + segundaVariavel;
        System.out.println ("A soma das duas variáveis digitadas é: " + soma);
        
    }
    
}
