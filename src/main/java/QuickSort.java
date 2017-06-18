import lombok.NonNull;

/**
 * Java program for implementation of Quick Sort
 * Created by Anirudha on 18-06-2017.
 */
public class QuickSort {
    private int[] array;
    private int size;

    /**
     * This method receives the unsorted array and submits it for quick sorting
     * @param array Array to be sorted
     */
    public void sort(@NonNull int[] array) {
        this.array = array;
        this.size = array.length;
        System.out.println("Array before sorting: ");;
        print(array);
        quickSort(0, size - 1);
        System.out.println("Array after sorging: ");
        print(array);
    }

    /**
     * This method return the sorted array by implementation divide and conquer paradigm
     * @param low  lower index of sub array
     * @param high higher index of sub array
     */
    private void quickSort(int low, int high) {
        //Get the pivot index from the middle of list
        int pivot = low + (high - low) / 2;
        int i = low;
        int j = high;

        //Divide them in two lists
        while (i <= j) {

            //If current value from left list is smaller than pivot element then get next element from left list
            while (array[i] < array[pivot]) {
                i++;
            }

            //If current value from right list is greater than pivot element then get next element from right list
            while (array[j] > array[pivot]) {
                j--;
            }

            //If we found a value in left list which is larger thant pivot element and if we found value in right list
            //which is smaller then pivot element then swap the values. As we are done increase i and j
            if (i <= j) {
                swap(i, j);
                i++;
                j--;
            }
        }

        //Recursion
        if (low < j) {
            quickSort(low, j);
        }

        if (i < high) {
            quickSort(i, high);
        }
    }

    /**
     * Helper method to swap elements of array at provided index
     * @param i lower index
     * @param j higher index
     */
    private void swap(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    /**
     * Method to print contents of array
     * @param array Array to be printed
     */
    public void print(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
