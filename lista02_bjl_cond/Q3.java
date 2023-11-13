package lista02_bjl_cond;

import java.util.Scanner;

public class Q3 {
    private static String oddOrEven(int a) {
        return a%2 == 1 ? a + " é ímpar" : a + " é par"; 
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira um número:");
        int a = input.nextInt();

        System.out.println(oddOrEven(a));

        input.close();
    }
}
