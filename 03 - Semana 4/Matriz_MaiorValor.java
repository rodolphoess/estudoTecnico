package br.estudo.house;

import java.util.Scanner;

public class Matriz_MaiorValor {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner (System.in);
        
        System.out.print ("Indique quantas linhas possui a matriz: ");
        int linhas = leitor.nextInt();
        System.out.print ("Indique quantas colunas possui a matriz: ");
        int colunas = leitor.nextInt();
        
        int matriz[][] = new int[linhas][colunas];            
        int auxiliar = 0;
        for (int i = 0 ; i < matriz.length ; i++) {
            for (int j = 0 ; j < matriz[colunas - 1].length ; j++) {
                System.out.print ("Digite o número da linha " + (i + 1) + " coluna " + (j + 1) + ": ");
                matriz[i][j] = leitor.nextInt();  
                
                if (matriz[i][j] > auxiliar) {
                    auxiliar = matriz[i][j];
                }
            }
        }        
        
        System.out.print ("\n\nOs valores digitados na matriz foram: ");
        for (int i = 0 ; i < matriz.length ; i++) {
            for (int j = 0 ; j < matriz[colunas - 1].length ; j++) {
                  System.out.print(matriz[i][j] + " ");                 
            }            
        }
        
        System.out.println ("\n\nE o maior valor digitado foi: " + auxiliar);                
        
    }
    
}
