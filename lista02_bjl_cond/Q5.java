package lista02_bjl_cond;

import java.util.Scanner;

public class Q5 {
    private static String sum(int a, int b) {
        return "Soma: " + (a+b);
    }

    private static String subtract(int a, int b) {
        return "Subtração: " + (a-b);
    }

    private static String multiply(int a, int b) {
        return "Multiplicação: " + (a*b);
    }

    private static String divide(int a, int b) {
        return b == 0 ? "Divisão por zero." : "Divisão: " + ((double) a/b);
    }

    private static String result(int op, int a, int b) {
        if (op == 1) return sum(a, b);
        if (op == 2) return subtract(a, b);
        if (op == 3) return multiply(a, b);
        return divide(a, b);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite 1 para somar;");
        System.out.println("Digite 2 para subtrair;");
        System.out.println("Digite 3 para multiplicar;");
        System.out.println("Digite 4 para dividir;");
        int op = input.nextInt();
        System.out.println("Insira o primeiro valor:");
        int a = input.nextInt();
        System.out.println("Insira o segundo valor:");
        int b = input.nextInt();
        System.out.println(result(op, a, b));

        input.close();
    }
}
