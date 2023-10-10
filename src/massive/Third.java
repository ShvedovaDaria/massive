package massive;

public class Third {
    public static void countAndPrintMinNumbers(int[] arr) {
        int min = arr[0];
        int count = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                count = 1;
            } else if (arr[i] == min) {
                count++;
            }
        }

        System.out.println("У нас " + count + " чисел зі значенням " + min);
    }
}