import java.util.Scanner;

public class FibonacciChecker {

    public static boolean pertenceFibonacci(int numero) {
        int a = 0, b = 1, c = 0;

        while (c < numero) {
            c = a + b;
            a = b;
            b = c;
        }

        return c == numero || numero == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um número para verificar se pertence à sequência de Fibonacci:");
        int numero = scanner.nextInt();
        
        if (pertenceFibonacci(numero)) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
        }

        scanner.close();
    }
}
