package br.imd.house;

import java.util.Scanner;

public class Concatenacao {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner (System.in);
        
        System.out.print ("Digite um texto qualquer: ");
        String texto = leitor.nextLine();
        System.out.print ("Digite um valor decimal ou inteiro qualquer: ");
        double primeiroNumero = Double.parseDouble((leitor.nextLine()).replace(",","."));
        System.out.print ("Digite um outro valor decimal ou inteiro qualquer: ");
        double segundoNumero = Double.parseDouble ((leitor.nextLine()).replace(",","."));
        
        System.out.println (texto + primeiroNumero + segundoNumero);
        
        
    }
    
}
