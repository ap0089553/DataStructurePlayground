import ds.sort.BubbleSort;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Test class for ds.sort.BubbleSort.java
 * Created by Anirudha on 11-06-2017.
 */
public class BubbleSortTest {

    @Test
    public void testSortArray() {
        Integer[] array = {5, 8, 2, 9, 6};
        BubbleSort.sortingFacade(array);
        assertArrayEquals(new Integer[]{2, 5, 6, 8, 9}, array);
        Character[] charArray = {'e', 'd', 'c', 'b', 'a'};
        BubbleSort.sortingFacade(charArray);
        assertArrayEquals(new Character[] {'a', 'b', 'c', 'd', 'e'}, charArray);
    }
}