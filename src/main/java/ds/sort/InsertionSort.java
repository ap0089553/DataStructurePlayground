package ds.sort;

/**
 * Java program for implementation of Insertion sort
 * Created by Anirudha on 11-06-2017.
 */
public class InsertionSort {
    //Driver method
    public static void main(String[] args) {
        Integer[] unsortedArray = {5, 4, 3, 2, 1};
        sortFacade(unsortedArray);
    }

    /**
     * Facade to sort and print array of size n
     * @param array Array to be sorted
     * @param <E>   Data type of array
     * @return Sorted array
     */
    public static <E extends Comparable<E>> E[] sortFacade(final E[] array) {
        System.out.println("Array before sorting:");
        printArray(array);
        sortArray(array);
        System.out.println("Array after sorting:");
        printArray(array);
        return array;
    }

    /**
     * Utility method to print array of size n
     * @param array Array to be sorted
     * @param <E>   Data type of array
     */
    public static <E extends Comparable<E>> void printArray(final E[] array) {
        for (E e : array) {
            System.out.print(e + " ");
        }
        System.out.println();
    }

    /**
     * Utility method to sort array of size n
     * Worst case time complexity O(n*n)
     * Swapping complexity O(n*n)
     * @param array Array to be sorted
     * @param <E>   Data type of array
     * @return Sorted array
     */
    public static <E extends Comparable<E>> E[] sortArray(final E[] array) {
        int compareCount = 0;
        int swapCount = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                compareCount++;
                if (array[i].compareTo(array[j]) > 0) {
                    swapCount++;
                    E temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("compareCount = " + compareCount);
        System.out.println("swapCount = " + swapCount);
        return array;
    }
}
