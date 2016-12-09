package imd.estudo.house;

import java.text.DecimalFormat;

public class MediaMatrizes {    
    public static int matriz[][] = new int[3][3];

        public static void main(String[] args) {
            
            gerarMatriz();
            
            matriz();
            
            mediaMatriz();

        }

        public static void gerarMatriz() {
            for (int i = 0 ; i < 3 ; i++) {
                for (int j = 0 ; j < 3 ; j++) {
                    matriz[i][j] = (int)(Math.random() * 10);
                }
            }
        }
        
        public static void matriz() {
            System.out.println("::::: MATRIZ :::::");
            for (int i = 0 ; i < 3 ; i++) {            
                for (int j = 0 ; j < 3 ; j++) {
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println("");
            }
        }
        
        public static void mediaMatriz() {
            System.out.println("\n::::: MÉDIA MATRIZ :::::");
                int somatorio = 0;
                for (int i = 0 ; i < 3 ; i++) {
                    for (int j = 0 ; j < 3 ; j++) {
                        somatorio = matriz[i][j] + somatorio;
                    }
                }
                float media = somatorio / 9.0f;
                DecimalFormat mediaArredondada = new DecimalFormat("#.00");
                System.out.println("A média de todos os elementos é " + mediaArredondada.format(media) + ".");
        }
    
}
