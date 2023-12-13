package lista03_bjl_rep;

import java.util.Scanner;

public class Q4 {
    private static String oddsBetween(int a, int b) {
        String odds = "";
        for (int i = a; i <= b; i++) {
            if (i%2 == 1) {
                odds += "É ímpar: " + i + "\n";
            }
        }
        return odds;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira o valor de A:");
        int a = input.nextInt();
        System.out.println("Insira o valor de B:");
        int b = input.nextInt();
        System.out.println(oddsBetween(a, b));
        input.close();
    }
}
