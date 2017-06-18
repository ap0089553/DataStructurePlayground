import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.Random;

import static org.junit.Assert.*;

/**
 * Test class for QuickSort.java
 * Created by Anirudha on 18-06-2017.
 */
public class QuickSortTest {

    private int[] array;
    private static int MAX;
    private static int SIZE;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Before
    public void setUp() throws Exception {
        SIZE = 5;
        MAX = 10;
        Random random = new Random();
        array = new int[SIZE];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(MAX);
        }
    }

    @Test
    public void testNull() throws Exception {
        expectedException.expect(NullPointerException.class);
        QuickSort quickSort = new QuickSort();
        quickSort.sort(null);
    }

    @Test
    public void testQuickSort() throws Exception {
        QuickSort quickSort = new QuickSort();
        quickSort.sort(array);
        validate(array);
    }

    /**
     * Validate each element of array is less than next element
     *
     * @param array
     */
    private void validate(int[] array) {
        for (int i = 0; i < array.length -1; i++) {
            if (array[i] > array[i + 1]) {
                assertFalse("Array is not sorted", false);
            }
        }
    }
}