package br.estudo.house;

import java.util.Scanner;

public class MediaLinhaMatriz {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        int sequencia[][] = new int[3][3];
        
        double media = 0, mediaTotal = 0, aux2 = 0;
        for (int i = 0 ; i < sequencia[2].length ; i++) {
            System.out.println ("Informe a " + (i + 1) + "ª sequência de números, apertando enter após digitado um número:");
            double aux = 0;
            for (int j = 0 ; j < sequencia[2].length ; j++) {                
                sequencia[i][j] = leitor.nextInt();
                aux += sequencia[i][j];
                aux2 += sequencia[i][j];
                media = aux / 3;
            }
            System.out.println ("\nA média da " + (i + 1) + "ª sequência é: " + media);
            System.out.println ("========================================================\n");
        }
        
        mediaTotal = aux2 / 9;
        System.out.println ("\nA média de todos os números lidos é: " + mediaTotal);
    }
    
}
