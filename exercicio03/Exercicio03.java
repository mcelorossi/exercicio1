package exercicio03;

public class Exercicio_03 {
    public static void main(String[] args) {
        fibonacci(5);
        fibonacci(11);
    }

    public static void fibonacci(int n) {
        int n1 = 0, n2 = 1;

        int contador = 0;

        while (contador < n) {

            System.out.print(n1 + " ");

            int n3 = n2 + n1;
            n1 = n2;
            n2 = n3;
            contador++;
        }
    }
}
