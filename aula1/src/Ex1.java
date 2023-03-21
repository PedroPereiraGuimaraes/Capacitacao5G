import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre com o numero de alunos: ");
        int x = entrada.nextInt();

        if(x == 10 || x == 20){
            System.out.println("Sala 16");
        }
        else if(x == 30){
            System.out.println("Sala 22");
        }
    }
}
