import java.util.Scanner;

class problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Любое число:");
        int n = scanner.nextInt();

        String result = isPrime(n, 2) ? "Оно Prime" : "Оно Composite";
        System.out.println(result);
    }

    public static boolean isPrime(int n, int i) {
        if (n <= 2) {
            return n == 2;
        }
        if (n % i == 0) {
            return false;
        }
        if (i * i > n) {
            return true;
        }

        return isPrime(n, i + 1);
    }
}
