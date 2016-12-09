package br.estudo.house;

import java.util.Scanner;

public class Palindromo {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner (System.in);
        
        System.out.print ("Digite um número qualquer: ");
        String numero = leitor.nextLine();
        
        int meioNumero = numero.length() / 2;
        int contador = 0;
        for (int i = 0; i < meioNumero; i++) {
            if (numero.charAt(i) == numero.charAt(numero.length() - 1 - i)) {
                contador++;
            } 
        }         
        
        if (contador == meioNumero) {
            System.out.println ("\n=======RESPOSTA=======\n" + numero + " é palíndromo.");
        } else {
            System.out.println ("\n=======RESPOSTA=======\n" + numero + " não é palíndromo.");
        } 
        
    }
}