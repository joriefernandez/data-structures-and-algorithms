package stacksandqueues;

import org.junit.Test;
import static org.junit.Assert.*;

public class QueueTest {
    //Test insert a value to the queue
    @Test
    public void enqueueOneValue(){
        Queue test = new Queue();
        test.enqueue(2);
        assertEquals("Should enqueue at the back", 2, test.back.value);
        assertEquals("Should enqueue at the back", 2, test.front.value);
    }

    // Test inserting multiple values at the queue.
    @Test
    public void enqueueMultipleValues() {
        Queue test = new Queue();
        test.enqueue(2);
        assertEquals("Front and back of queue should be updated.", 2, test.back.value);
        assertEquals("Front and back of queue should be updated.", 2, test.front.value);
        test.enqueue(1);
        assertEquals("Front and back of queue should be updated.", 1, test.back.value);
        assertEquals("Front and back of queue should be updated.", 2, test.front.value);
        test.enqueue(23);
        assertEquals("Front and back of queue should be updated.", 23, test.back.value);
        assertEquals("Front and back of queue should be updated.", 2, test.front.value);

    }

    //Test when queue has one value

    @Test
    public void dequeueOneValue() {
        Queue test = new Queue();
        test.enqueue(2);
        assertEquals("Should return the only value.", 2, test.dequeue());

    }

    //Test dequeue when empty
    @Test (expected = NullPointerException.class)
    public void dequeueEmpty() {
        Queue test = new Queue();
       test.dequeue();

    }

    //Test when queue has multiple values

    @Test
    public void dequeueValues() {
        Queue test = new Queue();
        test.enqueue(2);
        test.enqueue(1);
        test.enqueue(3);
        assertEquals("Should return the only value.", 2, test.dequeue());
        assertEquals("Front and back of queue should be updated.", 3, test.back.value);
        assertEquals("Front and back of queue should be updated.", 1, test.front.value);
        assertEquals("Should return the only value.", 1, test.dequeue());
        assertEquals("Front and back of queue should be updated.", 3, test.back.value);
        assertEquals("Front and back of queue should be updated.", 3, test.front.value);

    }

    //Test dequeue until empty
    @Test (expected= NullPointerException.class)
    public void dequeueValuesToEmpty() {
        Queue test = new Queue();
        test.enqueue(2);
        test.enqueue(1);

        test.dequeue();
        test.dequeue();
        test.dequeue();
    }

    //Test peek when queue has one value
    @Test
    public void peekOneValue() {
        Queue test = new Queue();
        test.enqueue(2);
        assertEquals("Front and back of queue should be updated.", 2, test.peek());
    }

    //Test peek when queue has several values
    @Test
    public void peekValues() {
        Queue test = new Queue();
        test.enqueue(2);
        test.enqueue(24);
        test.enqueue(200);
        assertEquals("Front and back of queue should be updated.", 2, test.peek());
        test.dequeue();
        assertEquals("Front and back of queue should be updated.", 24, test.peek());

    }


    //Test on empty queue
    @Test (expected = NullPointerException.class)
    public void peekEmpty() {
        Queue test = new Queue();

        assertNull("Front and back of queue should be updated.", test.peek());
    }

    //Test queue instantiation
    @Test
    public void queueTest(){
        Queue test = new Queue();
        assertNull("Should instantiate a null node.", test.front );
        assertNull("Should instantiate a null node.", test.back );
    }
}
