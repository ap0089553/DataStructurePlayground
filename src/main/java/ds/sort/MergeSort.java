package ds.sort;

import java.util.Arrays;

/**
 * Java program for implementation of Merge Sort Algorithm
 * Time Complexity O(nlogn) and Space complexity is O(n).
 * Created by Anirudha on 15-06-2017.
 */
public class MergeSort {
    private int[] array;
    private int[] helper;
    private int size;

    /**
     * This method sort the given array using divide and conquer paradigm
     * @param array Array to be sorted
     */
    public void mergeSort(int[] array) {
        this.array = array;
        size = array.length;
        helper = new int[size];
        System.out.println("Array before sorting");
        printArray(array);
        sort(0, size - 1);
        System.out.println("Array after sorting");
        printArray(array);
    }

    //This method prints elements of array
    private void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private void sort(int low, int high) {
        //Check is left is smaller than right. If not then array is sorted
        if (low < high) {
            int middle = low + (high - low) / 2;
            //Sort left side of the array
            sort(low, middle);
            //Sort right side of the array
            sort(middle + 1, high);
            //Combine them both
            merge(low, middle, high);
        }
    }

    private void merge(int low, int middle, int high) {
        //Copy both parts of array in helper array
        helper = Arrays.copyOf(array, array.length);
        int i = low;
        int j = middle + 1;
        int k = low;

        //Copy smallest value from either left or right side array to original array
        while (i <= middle && j <= high) {
            if (helper[i] <= helper[j]) {
                array[k] = helper[i];
                i++;
            } else {
                array[k] = helper[j];
                j++;
            }
            k++;
        }
        //Copy rest of the left array to the target array
        while (i <= middle) {
            array[k] = helper[i];
            i++;
            k++;
        }
    }
}
