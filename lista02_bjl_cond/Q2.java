package lista02_bjl_cond;

import java.util.Scanner;

public class Q2 {
    private static String firstBigger(int a, int b, int c) {
        return a > b && a > c ? "Condição satisfeita" : "Erro"; 
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira o primeiro número:");
        int a = input.nextInt();
        System.out.println("Insira o segundo número:");
        int b = input.nextInt();
        System.out.println("Insira o terceiro número:");
        int c = input.nextInt();

        System.out.println(firstBigger(a, b, c));

        input.close();
    }
}
