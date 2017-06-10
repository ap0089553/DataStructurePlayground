import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Test class for BubbleSort.java
 * Created by Anirudha on 11-06-2017.
 */
public class BubbleSortTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testSortArray() {
        Integer[] array = {5, 8, 2, 9, 6};
        BubbleSort.sortArray(array);
        assertArrayEquals(new Integer []{2, 5, 6, 8, 9}, array);
    }

    @After
    public void tearDown() throws Exception {
    }

}