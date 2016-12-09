package br.estudo.house;

import java.util.Scanner;

public class CalculoVolArea {
    public static Scanner leitor = new Scanner(System.in);
    public static int opcao;

        public static void main(String[] args) {
            
            menu();
            
            switch (opcao) {
                case 1:
                    System.out.print("\nDigite o valor do primeiro lado do quadrado: ");
                    double lado1Quad = leitor.nextDouble();
                    System.out.print("Digite o valor do segundo lado do quadrado: ");
                    double lado2Quad = leitor.nextDouble();
                    
                    double resultadoQuadrado = areaQuadrado(lado1Quad, lado2Quad);
                    System.out.println("A área do quadrado é de " + resultadoQuadrado + "m².");
                    break;
                    
                case 2: 
                    System.out.print("\nDigite o valor do raio do cículo: ");
                    double raioCirculo = leitor.nextDouble();
                    
                    double resultadoCirculo = areaCirculo(raioCirculo);
                    System.out.println("A área do círculo é de " + resultadoCirculo + "m².");
                    break;
                    
                case 3:
                    System.out.print("\nDigite o valor da base do retângulo: ");
                    double baseRetangulo = leitor.nextDouble();
                    System.out.print("Digite o valor da altura do retângulo: ");
                    double alturaRetangulo = leitor.nextDouble();
                    
                    double resultadoRetangulo = areaRetangulo(baseRetangulo, alturaRetangulo);
                    System.out.println("A área do retângulo é de " + resultadoRetangulo + "m².");
                    break;
                    
                case 4:
                    System.out.print("\nDigite o valor do primeiro lado do paralelepípedo: ");
                    double lado1Para = leitor.nextDouble();
                    System.out.print("Digite o valor do segundo lado do paralelepípedo: ");
                    double lado2Para = leitor.nextDouble();
                    System.out.print("Digite o valor da altura do paralelepípedo: ");
                    double altPara = leitor.nextDouble();
                    
                    double resultadoParale = volumeParalelepipedo(lado1Para, lado2Para, altPara);
                    System.out.println("O volume do paralelepípedo é de " + resultadoParale + "m³.");
                    break;
                    
                case 5:
                    System.out.print("\nDigite o raio do cone: ");
                    double raioCone = leitor.nextDouble();
                    System.out.print("Digite a altura do cone: ");
                    double alturaCone = leitor.nextDouble();
                    
                    double resultadoCone = volumeCone(raioCone, alturaCone);
                    System.out.println("O volume do cone é de " + resultadoCone + "m³.");
                    break;
                    
                case 6:
                    System.out.print("\nDigite o raio da esfera: ");
                    double raioEsfera = leitor.nextDouble();
                    
                    double resultadoEsfera = volumeEsfera(raioEsfera);
                    System.out.println("O volume da esfera é de " + resultadoEsfera + "m³.");
                    break;
                    
                default:
                    System.out.println("Opção inválida, desculpe!");
                    break;
            }
            

        }
        
    public static void menu() {
        System.out.println("\t:::::::::: MENU ::::::::::\n\n1 - Digite 1 caso queira calcular a área de um quadrado.\n2 - Digite 2 caso queira calcular a área de um círculo.\n3 - Digite 3 "
                + "caso queira calcular a área de um retângulo.\n4 - Digite 4 caso queira calcular o volume de um paralelepípedo.\n5 - Digite 5 caso queira calcular o volume de um cone.\n"
                + "6 - Digite 6 caso queira calcular o volume de uma esfera.");
        opcao = Integer.parseInt(leitor.nextLine());
    }
    
    public static double areaQuadrado(double lado1, double lado2) {
        return lado1 * lado2;
    }
    
    public static double areaCirculo(double raioCirculo) {
        return Math.PI * raioCirculo;
    }
    
    public static double areaRetangulo(double base, double alturaRetangulo) {
       return base * alturaRetangulo; 
    }
    
    public static double volumeParalelepipedo(double lado1, double lado2, double alturaPara) {
        return (lado1 * lado2 * alturaPara);
    }
    
    public static double volumeCone(double raioCone, double alturaCone) {
        return (Math.PI * Math.pow(raioCone,2) * alturaCone) / 3;
    }
    
    public static double volumeEsfera(double raioEsfera) {
        return (4 * Math.PI * Math.pow(raioEsfera, 3)) / 3;
    }
    
}
