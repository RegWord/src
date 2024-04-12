import java.util.Scanner;

class problem7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("stroka:");
        String str = scanner.nextLine();

        printPermutations(str, "");
    }

    public static void printPermutations(String str, String ans) {
        if (str.isEmpty()) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String ros = str.substring(0, i) + str.substring(i + 1);
            printPermutations(ros, ans + ch);
        }
    }
}
