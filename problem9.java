import java.util.Scanner;

class problem9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Числа:");
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int result = binomialCoefficient(n, k);
        System.out.println("binomial coefficient  -> " + result);
    }

    public static int binomialCoefficient(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        } else {
            return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k);
        }
    }
}
