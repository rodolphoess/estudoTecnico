package tecnico.estudo.house;

public class RecursaoContagem {

    public static void main(String[] args) {
    
        int numero = contagem(0);
        
    }
    
    public static int contagem(int numero) {
        int resultadoContagem = 0;
            if (numero == 10) {
                System.out.println(numero);
            } else {
                System.out.println(numero);
                resultadoContagem = numero + contagem(numero + 1);
            }
        
        return resultadoContagem;
    }
    
}
