package massive;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class fourthex {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 2, 3, 4, 4, 5, 6, 6, 7, 8, 9, 9, 10, 10};

        ArrayList<Integer> uniqueList = new ArrayList<>(new HashSet<>(Arrays.asList(arr)));

        System.out.println("Масив без дублікатів: " + uniqueList);
    }
}