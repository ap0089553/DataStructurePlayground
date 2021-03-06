package ds.java;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class BasicQueueTest {

    BasicQueue<Integer> intQueue = new BasicQueue<Integer>();

    @Before
    public void setUp() {
        intQueue.enqueue(1);
        intQueue.enqueue(2);
        intQueue.enqueue(3);
        intQueue.enqueue(4);
    }

    @Test
    public void enqueue() {
        intQueue.enqueue(5);
        assertEquals(5, intQueue.size());
    }

    @Test
    public void dequeue() {
        int element = intQueue.dequeue();
        assertEquals(1, element);
        assertEquals(3, intQueue.size());
    }

    @Test
    public void size() {
        assertEquals(4, intQueue.size());
    }

    @Test
    public void contains() {
        assertTrue(intQueue.contains(2));
    }

    @Test
    public void access() {
        int element = intQueue.access(2);
        assertEquals(3, element);
        assertEquals(1, intQueue.size());
    }
}