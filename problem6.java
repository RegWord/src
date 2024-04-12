import java.util.Scanner;

class problem6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("a:");
        int a = scanner.nextInt();

        System.out.println("n:");
        int n = scanner.nextInt();

        int result = power(a, n);
        System.out.println("Число " + a + " в степени " + n + " равно " + result);
    }

    public static int power(int a, int n) {
        if (n == 0) {
            return 1;
        } else {
            return a * power(a, n - 1);
        }
    }
}
