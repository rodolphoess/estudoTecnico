package estudo.imd.house;

/*
 * Esse código visa estabelecer uma relação entre objetos, ou seja, uma cardinalidade
 * que fará com que uma classe troque mensagens com a outra devido a atributos semelhantes.
*/
public class Semana10 {

    public static void main(String[] args) {
        
        Carro meuCarro = new Carro();
        
        Pessoa pessoa = new Pessoa(); 
        
        meuCarro.setDono(pessoa);
        pessoa.setNome("Liri Farfus");
        
        System.out.println(pessoa.getNome());
    }
    
}
