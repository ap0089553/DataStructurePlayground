/**
 * Java program for implementation of Bubble Sort
 * Created by Anirudha on 10-06-2017.
 */
public class BubbleSort {

    /*Driver method*/
    public static void main(String[] args) {
        Integer[] unsortedArray = {5, 4, 3, 2, 1};
        Integer[] sortedArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        sortingFacade(unsortedArray);
        sortingFacade(sortedArray);
        sortingFacade(doubleArray);
    }

    /**
     * Facade to sort and print array of size n
     * @param array Array to be operated
     * @param <E> Data type of array
     */
    private static <E extends Comparable<E>> void sortingFacade(final E[] array) {
        System.out.println("Before sorting");
        printArray(array);
        sortArray(array);
        System.out.println("After sorting");
        printArray(array);
    }


    /**
     * Utility method to print array of size n
     * @param array Array to be printed
     */
    private static <E extends Comparable<E>> void printArray(final E[] array) {
        for (E anArray : array) {
            System.out.print(anArray + " ");
        }
        System.out.println();
    }

    /**
     * Utility method to sort array of size n
     * Worst case time complexity O(n*n)
     * Swapping complexity O(n)
     *
     * @param array Array to be sorted
     */

    private static <E extends Comparable<E>> void sortArray(final E[] array) {
        int size = array.length;
        int compareCount = 0;
        int swapCount = 0;
        for (int j = 0; j < array.length; j++, size--) {
            for (int i = 0; i < size - 1; i++) {
                compareCount++;

                if (array[i].compareTo(array[i + 1]) > 0) {
                    swapCount++;
                    E temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
        System.out.println("compareCount = " + compareCount);
        System.out.println("swapCount = " + swapCount);
    }

}
