/**
 * Java program for implementation of Selection Sort
 * Created by Anirudha on 11-06-2017.
 */
public class SelectionSort {

    // Driver Method
    public static void main(String[] args) {
        Integer[] unsortedArray = {5, 4, 3, 2, 1};
        sortFacade(unsortedArray);
    }

    /**
     * Generic utility method to print array of size n
     * @param array Array to be sorted
     * @param <E> Data type of array
     */
    public static <E extends Comparable<E>> void printArray(final E[] array) {
        for (E e : array) {
            System.out.print(e + " ");
        }
        System.out.println();
    }

    /**
     * Generic utility method to sort array of size n
     * Worst case time complexity O(n*n)
     * Swapping complexity O(n)
     * @param array Array to be sorted
     * @param <E> Data type of array
     * @return Sorted array
     */
    public static <E extends Comparable<E>> E[] sortArray(final E[] array) {
        int compareCount = 0;
        int swapCount = 0;
        for (int i = 0; i < array.length - 1 ; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                compareCount++;
                if (array[minIndex].compareTo(array[j]) > 0) {
                    minIndex = j;
                }
            }
            swapCount++;
            E temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
        System.out.println("compareCount = " + compareCount);
        System.out.println("swapCount = " + swapCount);
        return array;
    }

    /**
     * Facade to sort and print array of size n
     * @param array Array to be sorted
     * @param <E> Data type of array
     * @return Sorted array
     */
    public static <E extends Comparable<E>> E[] sortFacade(final E[] array) {
        System.out.println("Array before sorting: ");
        printArray(array);
        sortArray(array);
        System.out.println("Array after sorting: ");
        printArray(array);
        return array;
    }
}
