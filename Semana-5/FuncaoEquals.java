package br.estudo.house;

import java.util.Scanner;

public class FuncaoEquals {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Digite um texto ou palavra qualquer: ");
        String primeiraPalavra = leitor.nextLine();
        System.out.print("Digite outro texto ou palavra qualquer: ");
        String segundaPalavra = leitor.nextLine();
        
        if (primeiraPalavra.equalsIgnoreCase(segundaPalavra)) {
            System.out.println("\nAs palavras são iguais.");
        } else {
            System.out.println("\nAs palavras são diferentes.");
        }
    }
    
}