package massive;

public class Second {
    public static void main(String[] args) {
        int[] arr = new int[10];
        // Заповнюємо масив рандомними значеннями
        for (int i = 0; i < 10; i++) {
            arr[i] = (int) (Math.random() * 100); // Генеруємо випадкові числа від 0 до 99
        }

        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 1; i < 10; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            } else if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }

        int temp = arr[minIndex];
        arr[minIndex] = arr[maxIndex];
        arr[maxIndex] = temp;

        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}