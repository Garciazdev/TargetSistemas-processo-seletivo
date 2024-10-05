package sequenciaDeFibonacci;
import java.util.Scanner;
import static sequenciaDeFibonacci.QuadradoPerfeito.verificador;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero : ");
            int num = sc.nextInt();

        if (verificador(num) == true) {
            System.out.println("O numero " + num + " faz parte da sequência de Fibonacci");
        } else {
            System.out.println("Não faz parte da sequência de Fibonacci");
        }

    }
}
