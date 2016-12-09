package br.imd.house;

import java.util.Scanner;

public class SomarOuMultiplicar {

    public static void main(String[] args) { 
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println ("Olá usuário!\n\nEscolha 1 caso queira efetuar uma multiplicação (*).\n\nEscolha 2 caso queira efetuar um somatório (+).");
        int operador = leitor.nextInt(); 
        
        
        System.out.print ("Agora, querido usuário, digite três números inteiros: ");      
        int primeiroNumero = leitor.nextInt();
        int segundoNumero = leitor.nextInt();
        int terceiroNumero = leitor.nextInt();
        
        switch (operador) {             
            case 1:                
                System.out.println ("\n\n====================\nVocê escolheu por efetuar uma multiplicação.\nAgora escolha 1 caso queira realizar a multiplicação dos dois primeiros números "
                        + "digitados, ou 2 caso queira multiplicar todos os números");
                int escolhaUm = leitor.nextInt();
                
                if (escolhaUm == 1) { 
                    System.out.println ("A multiplicação dos dois primeiros números informados é: " + (primeiroNumero * segundoNumero));                        
                } else {
                    System.out.println ("A multiplicação de todos os números informados é: " + (primeiroNumero * segundoNumero * terceiroNumero));    
                }
                break;
                
            case 2:                
                System.out.println ("\n\n====================\nVocê escolheu por efetuar um somatório.\n\nAgora escolha 1 caso queira realizar a soma dos dois primeiros números "
                        + "digitados, ou 2 caso queira somar todos os números");
                int escolhaDois = leitor.nextInt();
                
                if (escolhaDois == 1) {
                    System.out.println ("A soma dos dois primeiros números informados é: " + (primeiroNumero + segundoNumero));
                } else {
                    System.out.println ("A soma de todos os números informados é: " + (primeiroNumero + segundoNumero + terceiroNumero));
                }
                break;
                
            default:
                System.out.println ("Não usuariozinho, não é assim. Refaça a escolha, mas dessa vez opte por 1 ou 2. Obrigado!");
                break;
        }
        
    }
    
}
