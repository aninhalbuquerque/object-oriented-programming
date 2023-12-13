package lista03_bjl_rep;

public class Q1 {
    private static String sum(int a, int b) {
        int sumAux = 0;
        for (int i = a; i <= b; i++) sumAux += i;
        return "Somatório: " + sumAux;
    }

    public static void main(String[] args) {
        System.out.println(sum(1, 10));
    }
}
