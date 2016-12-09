package imd.estudo.house;

import java.util.Scanner;

public class CalculoMDC {

    public static void main(String[] args) {
       
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número para cálculo do MDC: ");
        int primeiroNumero = Integer.parseInt(leitor.nextLine());
        System.out.print("Digite o segundo número para cálculo do MDC: ");
        int segundoNumero = Integer.parseInt(leitor.nextLine());
        
        if (primeiroNumero == segundoNumero) {
            System.out.println("O M.D.C. entre " + primeiroNumero + " e " + segundoNumero + " é o próprio " + primeiroNumero + ".");
        } else {
            int resultado = mdc(primeiroNumero, segundoNumero); 
            System.out.println("O M.D.C. entre " + primeiroNumero + " e " + segundoNumero + " é: " + resultado);
        }
    }
    
    public static int mdc(int primeiroNumero, int segundoNumero) {
        if (segundoNumero == 0) {
            return primeiroNumero;
        } else {
            return mdc(segundoNumero, primeiroNumero % segundoNumero);
        }
    }
    
}