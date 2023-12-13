package lista03_bjl_rep;

import java.util.Scanner;

public class Q3 {
    private static String howManyPositiveIntegers() {
        int positiveIntegers = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Insira um número:");
        int a = input.nextInt();
        while (a != 0) {
            if (a > 0) positiveIntegers++;

            System.out.println("Insira um número:");
            a = input.nextInt();
        }


        input.close();
        return "Quantidade de positivos: " + positiveIntegers;
    }

    public static void main(String[] args) {
        System.out.println(howManyPositiveIntegers());
    }
}
