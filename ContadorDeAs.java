import java.util.Scanner;

public class ContadorDeAs {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma string:");
        String texto = scanner.nextLine();

        int contador = 0;
        for (char c : texto.toCharArray()) {
            if (c == 'a' || c == 'A') {
                contador++;
            }
        }

        System.out.println("A letra 'a' ocorre " + contador + " vezes.");
        scanner.close();
    }
}
