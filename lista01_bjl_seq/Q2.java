package lista01_bjl_seq;

import java.util.Scanner;

public class Q2 {
    private static String arithmeticMean(double a, double b, double c) {
        return "Média aritmética: " + ((a + b + c)/3.0);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe três notas, em sequência:");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        System.out.println(arithmeticMean(a, b, c));

        input.close();
    }
}
