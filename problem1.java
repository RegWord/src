import java.util.Scanner;

class problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("скок чисел будет:");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Введите " + n + " вот столько чисел:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int min = findMin(arr, 0, arr[0]);
        System.out.println("Мин число: " + min);
    }

    public static int findMin(int[] arr, int index, int min) {
        if (index == arr.length) {
            return min;
        } else {
            if (arr[index] < min) {
                min = arr[index];
            }
            return findMin(arr, index + 1, min);
        }
    }
}
