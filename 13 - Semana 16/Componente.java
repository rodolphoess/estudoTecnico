package br.estudo.tecnico.exemplo2;

import java.util.ArrayList;

public class Componente {
    String nome;
    ArrayList<Peca> peca;
    
    public Componente (String nome, ArrayList<Peca> peca) {
        this.nome = nome;
        this.peca = peca;
    }
}
