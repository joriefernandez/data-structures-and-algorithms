package stacksandqueues;

import org.junit.Test;
import static org.junit.Assert.*;

public class StackTest {

    @Test
    public void push() {
        Stack test = new Stack();
        test.push(1);
        assertEquals("Stack should return top value.", 1, test.top.value);

        test.push(34);
        test.push(23);
        assertEquals("Stack should return top value.", 23, test.top.value);
    }


    @Test
    public void popOneValue() {
        Stack test = new Stack();
        test.push(1);
        assertEquals("Stack should return top value.", 1, test.pop());

    }

    @Test
    public void popOneValues() {
        Stack test = new Stack();
        test.push(1);
        test.push(2);
        test.push(3);
        assertEquals("Stack should return top value.", 3, test.pop());
        assertEquals("Stack should return top value.", 2, test.top.value);
        assertEquals("Stack should return top value.", 2, test.pop());
        assertEquals("Stack should return top value.", 1, test.top.value);
        assertEquals("Stack should return top value.", 1, test.pop());


    }

    //Test until stack is empty
    @Test (expected = NullPointerException.class)
    public void popToEmpty() {
        Stack test = new Stack();
        test.push(1);
        test.push(2);
        test.push(3);
        //pop values
        test.pop();
        test.pop();
        test.pop();
        test.pop();

    }

    //Test peek to return top value
    @Test
    public void peek() {
        Stack test = new Stack();
        test.push(1);

        assertEquals("Peek should return top value.", 1, test.peek());
        assertEquals("Peek should not remove return top value.", 1, test.top.value);
    }

    //Test peek to return top value
    @Test
    public void peekWithMultipleValues() {
        Stack test = new Stack();
        test.push(1);
        test.push(2);
        test.push(41);

        assertEquals("Peek should return top value.", 41, test.peek());
        assertEquals("Peek should not remove return top value.", 41, test.top.value);

    }

    //Test peek with empty stack
    @Test (expected=NullPointerException.class)
    public void peekWithEmptyStack() {
        Stack test = new Stack();
        test.peek();

    }

    //Test stack instantiation
    @Test
    public void stackTest(){
        Stack test = new Stack();
        assertNull("Should instantiate a null node.", test.top );
    }
}
