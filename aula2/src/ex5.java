import java.util.Random;
import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Random gerador = new Random();
        Scanner scanner = new Scanner(System.in);
        int numeroAleatorio = gerador.nextInt(10) + 1;
        int numeroDoUsuario;
        boolean acertou = false;

        do {
            System.out.print("Digite um número entre 1 e 10: ");
            numeroDoUsuario = scanner.nextInt();

            if (numeroDoUsuario == numeroAleatorio) {
                acertou = true;
                System.out.println("Parabéns. Você acertou meu número!");
            } else if (numeroDoUsuario < numeroAleatorio) {
                System.out.println("O número gerado é maior do que o número informado.");
            } else {
                System.out.println("O número gerado é menor do que o número informado.");
            }
        } while (!acertou);

        scanner.close();
    }
}
