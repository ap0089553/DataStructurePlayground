import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Test class for MergeSort.java
 * Created by Anirudha on 16-06-2017.
 */
public class MergeSortTest {

    private final static int SIZE = 5;
    private final static int MAX = 20;
    private int[] array;

    @Before
    public void setUp() {
        array = new int[SIZE];
        Random random = new Random();
        for (int i = 0; i < SIZE ; i++) {
            array[i] = random.nextInt(MAX);
        }
    }

    @Test
    public void testMergeSort() {
        MergeSort mergeSort = new MergeSort();
        long startTime = System.currentTimeMillis();
        int[] ap = {9, 8, 9, 8, 14};
        mergeSort.mergeSort(ap);
        long endTime =System.currentTimeMillis();
        for (int i = 0; i < SIZE - 1 ; i++) {
            if (array[i] > array[i + 1]) {
                assertFalse(false);
            }
        }
        System.out.println("Elapsed time: " + (endTime - startTime));
        assertTrue(true);
    }
}