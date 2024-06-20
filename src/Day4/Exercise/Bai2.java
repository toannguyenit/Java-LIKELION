package Day4.Exercise;

import java.util.ArrayList;
import java.util.Comparator;

public class Bai2 {
    public static String[] sortArray(String[] array) {
        Comparator<String> comparator = Comparator.naturalOrder();
        String[] result = array.clone();
        int n = result.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (comparator.compare(result[i - 1], result[i]) > 0) {
                    String temp = result[i - 1];
                    result[i - 1] = result[i];
                    result[i] = temp;
                    swapped = true;
                }
            }
            n--;
        } while (swapped);
        return result;
    }

    public static void main(String[] args) {
        String[] arrayString = {"Red", "Green", "Blue", "Yellow", "Green", "Yellow"};
        System.out.println(sortArray(arrayString));
    }
}
