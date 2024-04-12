import java.util.Scanner;

class problem8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(":");
        String s = scanner.nextLine();

        boolean result = isAllDigits(s);
        System.out.println(result ? "Ия" : "Жок");
    }

    public static boolean isAllDigits(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
