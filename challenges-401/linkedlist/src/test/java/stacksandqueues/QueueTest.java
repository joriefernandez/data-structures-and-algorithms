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

    @Test
    public void dequeue() {
    }

    @Test
    public void peek() {
    }
}
