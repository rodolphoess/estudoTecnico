package tecnico.estudo.house;

public class RecursaoFibonacci {

    public static void main(String[] args) {
        
        int n = 4;
            if (n == 0) {
                System.out.println("0");
            } else if (n < 0) {
                System.out.println("Não é possível calcular a série de Fibonnaci para números negativos.");
            } else {
                int resultado = fib(n);
                System.out.println("fib(" + n + ") = " + resultado);
            }
        
    }
    
    public static int fib(int n) {
        int resultadoFibonacci = 0;
            if (n <= 2) {
                resultadoFibonacci = 1;
            } else {
                resultadoFibonacci = fib(n - 1) + fib(n - 2);
            }
        return resultadoFibonacci;
    }
}
