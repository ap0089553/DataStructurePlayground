package ds.java;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BasicListTest {

    BasicList<Integer> list = new BasicList<>();

    @Before
    public void setUp() throws Exception {
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
    }

    @Test
    public void add() {
        list.add(5);
        assertEquals(5, list.size());
    }

    @Test
    public void insert() {
        list.insert(6, 2);
        assertEquals(5, list.size());
        assertTrue(list.find(6));
    }

    @Test
    public void remove() {
        list.remove();
        assertEquals(3, list.size());
    }

    @Test
    public void removeAt() {
        list.removeAt(2);
        assertEquals(3, list.size());
    }

    @Test
    public void get() {
        assertEquals(new Integer(4), list.get(3));
    }

    @Test
    public void find() {
        assertTrue(list.find(1));
    }
}