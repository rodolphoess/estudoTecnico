package br.estudo.tecnico.exemplo2;

import java.util.ArrayList;

public class Motor extends Componente {
    private ArrayList<Componente> componente;
    
    public Motor (ArrayList<Componente> componente, String nome, ArrayList<Peca> peca) {
        super (nome, peca);
        this.componente = componente;
    }
}
