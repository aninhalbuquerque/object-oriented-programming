package lista01_bjl_seq;

import java.util.Scanner;

public class Q3 {
    private static String newSalary(double a) {
        return "Novo salário: " + (a*1.25);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira o salário:");
        double a = input.nextDouble();

        System.out.println(newSalary(a));

        input.close();
    }
}
