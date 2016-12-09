package imd.estudo.house;

public class MultiplicaMatrizes {
    
    public static int matriz1[][] = new int[3][3];
    public static int matriz2[][] = new int[3][3];
    public static int matrizResultante[][] = new int[3][3];

        public static void main(String[] args) {

            gerarMatrizes();

            matriz1();

            matriz2();
            
            multiplicacaoMatrizes();

        }

        public static void gerarMatrizes() {
            for (int i = 0 ; i < 3 ; i++) {
                for (int j = 0 ; j < 3 ; j++) {
                    matriz1[i][j] = (int)(Math.random() * 10);
                    matriz2[i][j] = (int)(Math.random() * 10);
                }
            }
        }
        
        public static void matriz1() {
            System.out.println("::::: MATRIZ 1 :::::");
            for (int i = 0 ; i < 3 ; i++) {            
                for (int j = 0 ; j < 3 ; j++) {
                    System.out.print(matriz1[i][j] + " ");
                }
                System.out.println("");
            }
        }
        
        public static void matriz2() {
            System.out.println("\n::::: MATRIZ 2 :::::");
            for (int i = 0 ; i < 3 ; i++) {            
                for (int j = 0 ; j < 3 ; j++) {
                    System.out.print(matriz2[i][j] + " ");
                }
                System.out.println("");
            }
        }
        
        public static void multiplicacaoMatrizes() {
            System.out.println("\n::::: MATRIZ 1 x MATRIZ 2 :::::");
            
            for (int i = 0 ; i < 3 ; i++) {
                for (int j = 0 ; j <= 2 ; j++) {
                    for (int w = 0 ; w <= 2 ; w++) {
                        matrizResultante[i][j] += (matriz1[i][w] * matriz2[w][j]);
                    }
                }
            }
            
            for (int i = 0 ; i < 3 ; i++) {
                for (int j = 0 ; j < 3 ; j++) {
                    System.out.print(matrizResultante[i][j] + " ");
                }
                System.out.println("");
            }
        }
}
