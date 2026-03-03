import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество элементов массива (макс. 15): ");
        int n = scanner.nextInt();

        if (n > 15) {
            System.out.println("Ошибка: массив не может содержать больше 15 элементов. Будет взято только 15 элементов.");
            n = 15;
        }

        int[] array = new int[n];
        System.out.println("Введите " + n + " целых чисел:");

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Введенный массив:");
        System.out.println(Arrays.toString(array));
    }
}