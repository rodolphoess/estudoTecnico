package br.estudo.house;

import java.util.Scanner;

public class ListagemBusca {
    public static String vetorProdutos[] = new String[10], auxiliar;
    public static Scanner leitor = new Scanner(System.in);
        
    public static void main(String[] args) {
        System.out.println("Olá usuário! Realize o cadastro dos seus produtos!");
            cadastroProduto();
            System.out.println("\nCadastro realizado com sucesso!\n_____________________________________________________________________");
            
            System.out.print("\nVocê deseja realizar uma listagem dos produtos cadastrados? Caso deseje digite 1, caso não digite 2: ");
            int listagem = Integer.parseInt(leitor.nextLine());
                if (listagem == 1) {
                    listarProdutos();
                    System.out.println("\nListagem realizada com sucesso!\n_______________________________________________________________");
                } else {
                    System.out.println("\nNão será feita a listagem.\n_____________________________________________________________________");
                }
                
            System.out.print("\nVocê deseja realizar uma busca nos produtos cadastrados? Caso deseje digite 1, caso não digite 2: ");
            int busca = Integer.parseInt(leitor.nextLine());
                if (busca == 1) {
                    buscaProduto();
                } else {
                    System.out.println("\nNão será feita a busca. Obrigado!");
                }
        }
    
    public static void cadastroProduto() {        
        for (int i = 0 ; i < 10 ; i++) {
            System.out.print ("\nDigite o nome do " + (i + 1) + "º produto: ");
            vetorProdutos[i] = leitor.nextLine();
        }
    }
    
    public static void listarProdutos() {
        for (int i = 0 ; i < 10 ; i++) {
            System.out.println("\nO " + (i + 1) + "º produto cadastrado foi: " + vetorProdutos[i]);
        }
    }
    
    public static void buscaProduto() {
        System.out.print("Digite o nome do produto que deseja buscar: ");
        String nomeProduto = leitor.nextLine();
        int contador = 0;
        for (int i = 0 ; i < 10 ; i++) {
            if (vetorProdutos[i].contains(nomeProduto)) {
                System.out.println("\nVocê procurou pelo produto " + vetorProdutos[i] + ".");
                contador++;
                break;
            }
        }
        
        if (contador == 0) {
            System.out.println("\nO produto digitado não foi encontrado, talvez você não o tenha registrado.");
        }
        
    }
    
}
