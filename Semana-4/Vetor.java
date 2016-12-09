package br.estudo.house;

import java.util.Scanner;

public class Vetor {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner (System.in);
        
        System.out.print ("Digite a quantidade de valores que será informada: ");
        int valores[] = new int [leitor.nextInt()];
        
        System.out.println ("Agora digite os valores: ");        
        for (int i = 0 ; i < valores.length ; i++) {
            valores[i] = leitor.nextInt();
        }
        
        System.out.print ("Valores digitados: ");
        for (int i = 0 ; i < valores.length ; i++) {
            System.out.print (valores[i] + " ");
        }
    }
    
}
