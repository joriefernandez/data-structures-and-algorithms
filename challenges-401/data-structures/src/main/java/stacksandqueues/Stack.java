package stacksandqueues;

public class Stack {
    protected Node top;

    public Stack(){
        top = null;

    }

    //Method to add value to stack
    public void push(int value){
        Node newNode = new Node(value);
        if(top == null) {
            top = newNode;
        }else {
            newNode.next = top;
            top = newNode;
        }
    }

    //Method to remove and return value from stack
    public int pop(){
        if(top == null){
            throw new NullPointerException("Empty stack.");
        }
        int val = -1;
        if(top != null) {
            val = top.value;
            top = top.next;
        }
        return val;
    }

    //Method to return top value
    public int peek(){
        if(top == null){
            throw new NullPointerException("Empty stack.");
        }
        return top.value;
    }

    public boolean isEmpty(){
        return top == null;
    }

    public Node getTop(){
        return top;
    }


}
