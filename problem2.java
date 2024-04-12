import java.util.Scanner;

class problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("скок чисел");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Введите " + n + " вот столько чисел:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        double avg = findAvg(arr, 0, 0) / (double) n;
        System.out.println("АВГ значение: " + avg);
    }

    public static int findAvg(int[] arr, int index, int sum) {
        if (index == arr.length) {
            return sum;
        } else {
            sum += arr[index];
            return findAvg(arr, index + 1, sum);
        }
    }
}
