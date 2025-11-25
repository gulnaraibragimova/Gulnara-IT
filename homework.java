import java.util.Scanner;
public class homework{
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("введите число (от 1 до 14):");
    int n = scanner.nextInt();
    if (n > 0 && n < 14) {
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("Факториал числа" + n + "равен" + factorial);
    } else {
        System.out.println("число должно быть в диапазоне от 1до 13.");
    }
    scanner.close();
}
}



