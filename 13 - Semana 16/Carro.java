package br.estudo.tecnico.exemplo2;

import java.util.ArrayList;

public class Carro {

    public static void main(String[] args) {
        
        //Aqui estão todas as peças que compõem os componentes do motor, que por sua vez comporão o motor.
        Peca p1 = new Peca("tipo1", "10Kg", "ferro");
        Peca p2 = new Peca("tipo2", "5Kg", "aluminio");
        Peca p3 = new Peca("tipo2", "2Kg", "plastico");
        Peca p4 = new Peca("tipo2", "3,5Kg", "aluminio");
        Peca p5 = new Peca("tipo1", "5Kg", "ferro");
        
        
        //ArrayList armazenando em cada espaço as peças(p1, p2 e p3) criadas anteriormente, esse será o componente 1 do motor.
        ArrayList componente1 = new ArrayList();
        componente1.add(p1);
        componente1.add(p2);
        componente1.add(p3);
        
        
        //ArrayList adicionando em cada espaço as peças(p4 e p5) criadas anteriormente, esse será o componente 2 do motor.
        ArrayList componente2 = new ArrayList();
        componente2.add(p4);
        componente2.add(p5);
        
        
        /* ArrayList com os componentes que fazem parte do motor, esses componentes são diferentes, por isso ocupam espaços 
         * diferentes no ArrayList, e eles farão parte do ArrayList dos componentes
         */
        ArrayList componentesMotor = new ArrayList();
        componentesMotor.add(componente1);
        componentesMotor.add(componente2);
        
        
        /* Todas as peças definidas anteriormente fazem parte do motor, os dois componentes seriam instâncias intermediárias entre
         * as peças, que são o elemento menor, e o motor que engloba tantos as peças quanto os dois componentes.
         */
        ArrayList pecasMotor = new ArrayList();
        pecasMotor.add(p1);
        pecasMotor.add(p2);
        pecasMotor.add(p3);
        pecasMotor.add(p4);
        pecasMotor.add(p5);
        
        //Cria o objeto motor e passa todos os componentes e peças que compõem o mesmo.
        Motor m = new Motor(componentesMotor, "Motor V8", pecasMotor); 
        
        
    }
    
}
