package ds.problem;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 3, 6};
        for (int i = 0; i < array.length; i++) {
            int originalValue = array[i];
            int newValue = array[array.length - i -1];
            array[i] = newValue;
            array[array.length - i -1] = originalValue;
        }
        System.out.println(Arrays.toString(array));
    }
}
