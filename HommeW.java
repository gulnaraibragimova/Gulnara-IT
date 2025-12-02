import java.util.Scanner;

public class HommeW {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;


        do {
            System.out.print("Введите число n (1 <= n <= 50): ");
            while (!scanner.hasNextInt()) {
                System.out.println("Некорректный ввод. Пожалуйста, введите целое число.");
                scanner.next();
            }
            n = scanner.nextInt();
            if (n < 1 || n > 50) {
                System.out.println("Число n должно быть в диапазоне от 1 до 50.");
            }
        } while (n < 1 || n > 50);

        int[][] array = new int[n][n];

        int value = 1;

        for (int i = 0; i < n; i++) {
            for (int j = i; j >= 0; j--) {
                array[j][i - j] = value++;
            }
        }


        for (int i = 1; i < n; i++) {
            for (int j = i; j < n; j++) {
                array[j][n - 1 - (j - i)] = value++;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%3d ", array[i][j]);
            }
            System.out.println();
        }
    }
}
