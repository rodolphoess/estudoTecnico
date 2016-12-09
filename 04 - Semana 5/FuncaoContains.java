package br.estudo.house;

import java.util.Scanner;

public class FuncaoContains {

    public static void main(String[] args) {
      Scanner leitor = new Scanner(System.in);
        
        System.out.print("Digite um texto ou palavra qualquer: ");
        String primeiraPalavra = leitor.nextLine();
        System.out.print("Digite outro texto ou palavra qualquer: ");
        String segundaPalavra = leitor.nextLine();
        
        if (segundaPalavra.contains(primeiraPalavra)) {
            System.out.println("\nA primeira palavra ou texto digitado está contida(o) na segunda(o).");
        } else {
            System.out.println("\nA primeira palavra ou texto digitado não está contida(o) na segunda(o), há pelo menos um caractere diferente.");
        }
    }
    
}
