package imd.estudo.house;

import java.util.Scanner;

public class RecursaoFatorial {

    public static void main(String[] args) {
    
    Scanner leitor = new Scanner(System.in);
        
    System.out.print("Digite o valor no qual deseja calcular o fatorial: ");
    int numero = Integer.parseInt(leitor.nextLine());

        if (numero >= 0) {
            int resultado = fatorial(numero);
            System.out.println("O valor do fatorial para o " + numero + " é: " + resultado);
        } else {
            System.out.println("Não é possível calcular o fatorial de um número negativo.");
        }               
}
    
    public static int fatorial(int numero) {
        int resultadoFatorial = 0;
        if (numero == 0) {
           resultadoFatorial = 1; 
        } else {
            resultadoFatorial = numero * fatorial(numero - 1);
        }
        return resultadoFatorial;
    }
    
}