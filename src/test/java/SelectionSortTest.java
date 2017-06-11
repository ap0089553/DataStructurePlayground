import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Test class for SelectionSort.java
 * Created by Anirudha on 11-06-2017.
 */
public class SelectionSortTest {

    @Test
    public void sortArray() throws Exception {
        Integer[] array = {3, 1, 5, 4, 7};
        SelectionSort.sortFacade(array);
        assertArrayEquals(new Integer[]{1, 3, 4, 5, 7}, array);
        Character[] charArray = {'b', 'a', 'd','c','e'};
        SelectionSort.sortFacade(charArray);
        assertArrayEquals(new Character [] {'a', 'b', 'c', 'd', 'e'}, charArray);
    }
}