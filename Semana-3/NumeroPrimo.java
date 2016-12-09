package br.estudo.house;

public class NumeroPrimo {

    public static void main(String[] args) {        
        
        for (int i = 2; i <= 1000; i++) {
            int contador = 0;
                for (int j = 2; j <= i - 1; j++) {
                    if (i % j == 0) {
                        contador = contador + 1;                    
                    }                        
                }
            if (contador == 0) {
                System.out.println ("O número " + i + " é primo.");
            }    
        }           
    }
}