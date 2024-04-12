import java.util.Scanner;

class problem5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Fibonacci (сам в шоке):");
        int n = scanner.nextInt();

        int result = fibonacci(n);
        System.out.println(n + "-й Fibonacci -> " + result);
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
