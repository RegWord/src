import java.util.Scanner;

class problem10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("числа:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int result = gcd(a, b);
        System.out.println("GCD равен -> " + result);
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}
