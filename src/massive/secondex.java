package massive;

import java.util.Arrays;

public class secondex {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 2, 9, 1, 7, 4, 6, 10};

        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }

        // Обміняти місцями мінімальний і максимальний елементи
        int temp = arr[minIndex];
        arr[minIndex] = arr[maxIndex];
        arr[maxIndex] = temp;

        System.out.println("Масив після обміну: " + Arrays.toString(arr));
    }
}