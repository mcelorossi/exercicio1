package exercicio05;

public class Exercicio_05 {
    public static void main(String[] args) {
    System.out.println("sqrt(15) = " + sqrt(15, 5, 1));
    }

    public static int sqrt(int N, int A, int E) {
    if (Math.abs(Math.pow(A, 2) - N)  < E) {
        return A;
    } else {
        A = (int) ((Math.pow(A, 2) + N)/(2*A));
        return sqrt(N, A, E);
        }
    }
}
