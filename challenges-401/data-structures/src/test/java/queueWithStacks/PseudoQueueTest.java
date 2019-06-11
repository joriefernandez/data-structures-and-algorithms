package queueWithStacks;

import org.junit.Test;

import static org.junit.Assert.*;

public class PseudoQueueTest {

    @Test
    public void enqueue() {
        PseudoQueue test = new PseudoQueue();
        test.enqueue(3);

        assertEquals("Top value should be the newest value.", 3, test.inputStack.getTop().getValue());
        test.enqueue(1);
        test.enqueue(24);
        assertEquals("Top value should be the newest value.", 24, test.inputStack.getTop().getValue());
    }

    @Test
    public void dequeue() {
        PseudoQueue test = new PseudoQueue();
        test.enqueue(3);
        assertEquals("Should return the oldest value.", 3, test.dequeue());

    }

    @Test (expected = NullPointerException.class)
    public void dequeueEmpty() {
        PseudoQueue test = new PseudoQueue();
        test.dequeue();
    }

    @Test
    public void dequeueMultiple() {
        PseudoQueue test = new PseudoQueue();
        test.enqueue(3);
        test.enqueue(1);
        test.enqueue(24);
        assertEquals("Should return the oldest value.", 3, test.dequeue());
        assertEquals("Should return the oldest value.", 1, test.dequeue());
        assertEquals("Should return the oldest value.", 24, test.dequeue());
    }


}