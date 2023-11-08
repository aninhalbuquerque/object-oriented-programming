package lista01_bjl_seq;

import java.util.Scanner;

public class Q1 {
    private static String sum(int a, int b, int c, int d) {
        return "Resultado da soma: " + (a + b + c + d);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe quatro números, em sequência:");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();

        System.out.println(sum(a, b, c, d));

        input.close();
    }
}
