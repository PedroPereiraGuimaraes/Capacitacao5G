import java.util.Random;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroAleatorio = random.nextInt(10) + 1;
        int numeroUsuario;

        do {
            System.out.println("Digite um número entre 1 e 10:");
            numeroUsuario = scanner.nextInt();

            if (numeroUsuario == numeroAleatorio) {
                System.out.println("Parabéns! Você acertou o número!");
            } else {
                System.out.println("Você errou. Tente novamente.");
            }
        } while (numeroUsuario != numeroAleatorio);
    }
}
