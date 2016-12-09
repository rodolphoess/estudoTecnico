package estudo.tecnico.casa;

import java.util.*;

public class TesteHashSet {

    public static void main(String[] args) {
        
        HashSet teste = new HashSet();          //Tem a mesma representatividade dos conjuntos da Matemática, conjunto de coisas sem ordem definida, porém que não podem se repetir.
        teste.add("Maria");
        teste.add("João");        
        
        HashMap mapa = new HashMap();           //Representa conjuntos de objetos que se relacionam uns com os outros dois a dois, por exemplo, CEP e rua.
        mapa.put(1, "BMW M2");
        mapa.put(2, "Porsche Carrera GT");
        mapa.put(3, "BMW X6M");
        
        ArrayList lista = new ArrayList();      //Representa uma lista de objetos, e eles podem se repetir.
        lista.add("João");
        lista.add("João");      
        
        int a[] = {5, 6, 7 , 12, 23};
        System.out.println("For each / Enhancedfor / for-in: ");
        for (int n : a) {           //for (declaração : expressão) {
            System.out.println(n);
        }
        System.out.println("\nFor trandicional: ");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        
        List<String> lista2 = new ArrayList<String>();          //Generics.
        lista2.add("João");                                     //Se for adicionado outra coisa além de Strings, dará erro no código.
        lista2.add("Melissa");
        
        System.out.println("\n" + lista2.get(0) + ", " + lista2.get(1));
        
        
        
        
    }
    
}
