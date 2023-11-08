package lista01_bjl_seq;

import java.util.Scanner;

public class Q4 {
    private static String triangleArea(double b, double h) {
        return "Area do triangulo: " + (b*h/2.0);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira a base:");
        double b = input.nextDouble();
        System.out.println("Insira a altura:");
        double h = input.nextDouble();

        System.out.println(triangleArea(b, h));

        input.close();
    }
}