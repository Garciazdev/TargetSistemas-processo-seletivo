package inversorDeString;

import java.util.Scanner;

public class InverterString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma string para ser invertida:");
        String original = scanner.nextLine();

        String invertida = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            invertida += original.charAt(i);  // Adiciona o caractere à nova string
        }

        System.out.println("String invertida: " + invertida);
    }
}

