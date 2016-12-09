package br.estudo.house;

import java.util.Scanner;

public class PequenoSistemaLivraria {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        String programa[][] = new String[10][4];
        
        for (int i = 0 ; i < programa.length ; i++) {
            System.out.println ("=========== ESSES SÃO OS DADOS DO SEU " + (i + 1) + "º LIVRO ===========" );
            for (int j = 0 ; j < programa[i].length ; j++) {
                
                if (j == 0) {
                    System.out.print ("Digite o nome do " + (i + 1) + "º livro: ");
                    programa[i][0] = leitor.nextLine();  
                } else if (j == 1) {
                    System.out.print ("Digite o ano de lançamento do " + (i + 1) + "º livro: ");
                    programa[i][1] = leitor.nextLine();
                } else if (j == 2) {
                    System.out.print ("Digite o nome do autor do " + (i + 1) + "º livro: ");
                    programa[i][2] = leitor.nextLine();
                } else {
                    System.out.print ("Digite um breve comentário informando a sua opinião sobre o livro: ");
                    programa[i][3] = leitor.nextLine();
                } 
                
            }
            System.out.println ("\n");
        }
        System.out.println ("- Obrigado! Livros cadastrados com sucesso!\n==========================================================================================\n\n");
        
        System.out.print ("Olá usuário!\n\nA - Digite 'A' caso queira fazer uma busca de livro por nome.\nB - Digite 'B' caso queira fazer uma busca de livro pelo ano de lançamento.\n"
                + "C - Digite 'C' caso queira fazer uma busca pelo nome do autor.\n\n");
        String opcao = leitor.nextLine();
            
        String nomeLivro, anoLancamento, autorLivro;
        int i = 0, aux = 0;
        switch (opcao) {
            case "A":                
                System.out.print("\nDigite o nome do livro: ");
                nomeLivro = leitor.nextLine();
                for (i = 0 ; i < 9 ; i++) {
                    if (nomeLivro == programa[i][0]) {
                        aux = i;
                    }
                }
                System.out.println ("\nO livro digitado possui;\nNome: " + nomeLivro + "\nAno de lançamento: " + programa[aux][1] + "\nAutor: " + programa[aux][2]);
                break;
                
            case "B":
                System.out.print ("\nDigite o ano de lançamento do livro: ");
                anoLancamento = leitor.nextLine();
                for (i = 0 ; i < 9 ; i++) {
                    if (anoLancamento == programa[i][1]) {
                        aux = i;
                    }
                }                
                System.out.println ("\nO livro digitado possui;\nNome: " + programa[aux][0] + "\nAno de lançamento: " + anoLancamento + "\nAutor: " + programa[aux][2]);
                break;
                
            case "C":
                System.out.print ("\nDigite o nome do autor do livro: ");
                autorLivro = leitor.nextLine();
                for (i = 0 ; i < 9 ; i++) {
                        if (autorLivro == programa[i][2]) {
                            aux = i;
                        }
                }                
                System.out.println ("\nO livro digitado possui;\nNome: " + programa[aux][0] + "\nAno de lançamento: " + programa[aux][1] + "\nAutor: " + autorLivro);
                break;
                
            default:
                System.out.println ("\nOpção incompatível, desculpe!"); 
                break;
        } 
            
    }
    
}
