package exercicio09;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int[] vetor = new int[10];
        int contador = 0;

        while (contador < 10) {
            System.out.println("Digite o " + (contador + 1) + " valor");
            int numero = read.nextInt();
            if (!numeroExiste(numero, vetor)) {
                vetor[contador] = numero;
                contador++;
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(vetor[i]);
        }
    }

    private static boolean numeroExiste(int numero, int[] vetor) {
        for(int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numero) {
                return true;
            }
        }
        return false;
    }
}
