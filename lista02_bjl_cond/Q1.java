package lista02_bjl_cond;

import java.util.Scanner;

public class Q1 {
    private static String bigger(int a, int b) {
        return a == b ? "Os números são iguais": a > b ? "O maior é: " + a : "O maior é: " + b;
    }

    public static void main(String[] args) {3
        Scanner input = new Scanner(System.in);
        System.out.println("Insira o primeiro número:");
        int a = input.nextInt();
        System.out.println("Insira o segundo número:");
        int b = input.nextInt();

        System.out.println(bigger(a, b));

        input.close();
    }
}
