package lista02_bjl_cond;

import java.util.Scanner;

public class Q4 {
    private static String multiply(int a, int b) {
        return "Multiplicação: " + (a*b);
    }

    private static String subtract(int a, int b) {
        return "Subtração: " + (a-b);
    }

    private static String sum(int a, int b) {
        return "Soma: " + (a+b);
    }

    private static String result(int a, int b) {
        return a == b ? multiply(a, b) : a > b ? subtract(a, b) : sum(a, b);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira o primeiro valor:");
        int a = input.nextInt();
        System.out.println("Insira o segundo valor:");
        int b = input.nextInt();
        System.out.println(result(a, b));

        input.close();
    }
}
