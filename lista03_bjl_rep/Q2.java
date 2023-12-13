package lista03_bjl_rep;

import java.util.Scanner;

public class Q2 {
    private static String between(int a, int b) {
        String serie = "";
        for (int i = a+1; i < b; i++) {
            serie += i;
            if (i+1 < b) serie += " ";
        }
        return "Série numérica:\n" + serie;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira o valor de A:");
        int a = input.nextInt();
        System.out.println("Insira o valor de B:");
        int b = input.nextInt();
        System.out.println(between(a, b));
        input.close();
    }
}
