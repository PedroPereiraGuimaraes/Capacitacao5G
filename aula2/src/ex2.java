import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o número de lanches vendidos por hora na quarta-feira:");

        int lanches1 = scanner.nextInt();
        int lanches2 = scanner.nextInt();
        int lanches3 = scanner.nextInt();

        int totalLanches = lanches1 + lanches2 + lanches3;
        double mediaLanches = totalLanches / 3.0;

        System.out.println("Total de lanches vendidos: " + totalLanches);
        System.out.println("Média de lanches vendidos: " + mediaLanches);
    }
}
