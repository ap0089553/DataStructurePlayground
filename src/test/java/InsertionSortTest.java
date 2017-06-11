import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Test class for InsertionSort.java
 * Created by Anirudha on 12-06-2017.
 */
public class InsertionSortTest {

    @Test
    public void sortFacade() throws Exception {
        Integer[] array = {3, 5, 2, 1, 0};
        InsertionSort.sortFacade(array);
        assertArrayEquals(new Integer []{0, 1, 2, 3, 5}, array);
    }
}