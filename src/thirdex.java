public class thirdex {
    public static void main(String[] args) {
        int[] arr = {-3, -3, -3, 4, 5, 9, 4, 7, 4, 7};
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

        System.out.println("У масиві " + count + " чисел зі значенням " + min);
    }
}