import java.util.Scanner;

class problem4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Число/цифра:");
        int n = scanner.nextInt();

        int result = factorial(n);
        System.out.println("Факториал этого ->" + n + " равен этому -> " + result);
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}