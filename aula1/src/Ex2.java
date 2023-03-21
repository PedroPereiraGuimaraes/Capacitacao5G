import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre com sua NPA: ");
        float npa = entrada.nextFloat();

        if(npa>=30 && npa<60){
            System.out.println("NP3");
            System.out.println("Entre com sua nota: ");
            float nota = entrada.nextFloat();
            if(((nota+npa)/2)<=50){
                System.out.println("Reprovado com a nota: " + (nota+npa)/2);
            }
            else {
                System.out.println("Aprovado");
            }
        }
        else if(npa>60){
            System.out.println("Aprovado");
        }
        else {
            System.out.println("Reprovado");
        }
    }
}
