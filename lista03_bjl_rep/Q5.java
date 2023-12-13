package lista03_bjl_rep;

import java.util.Scanner;

public class Q5 {
    private static String prime(int n) {
        boolean isPrime = true;
        for (int i = 2; i*i <= n; i++) {
            if (n%i == 0){
                isPrime = false;
                break;
            }
        }
        if (isPrime) return n + " é primo.";
        return n + " não é primo.";
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira um número:");
        int n = input.nextInt();
        System.out.println(prime(n));
        input.close();
    }
}
