package lista01_bjl_seq;

import java.util.Scanner;

public class Q5 {
    private static String pow(double a, double b) {
        return "Resultado: " + (Math.pow(a, b));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira o primeiro número:");
        double a = input.nextDouble();
        System.out.println("Insira o segundo número:");
        double b = input.nextDouble();

        System.out.println(pow(a, b));

        input.close();
    }
}
