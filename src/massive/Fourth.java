package massive;

import java.util.Arrays;

public class Fourth {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5, 6, 6, 7, 8, 8, 9, 10, 10, 11, 12, 12, 13, 14};

        // Видаляємо дублікати
        arr = Arrays.stream(arr).distinct().toArray();

        // Виводимо масив після видалення дублікатів
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}