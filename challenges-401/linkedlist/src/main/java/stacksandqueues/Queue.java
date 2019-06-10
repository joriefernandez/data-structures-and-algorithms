package stacksandqueues;


public class Queue {
    //front node
    protected Node front;
    //back node;
    protected Node back;

    //Constructor
    public Queue(){
        front = null;
        back = null;
    }

    //Method to insert a value to the queue
    public void enqueue(int value){
        Node newNode = new Node(value);
        if(back == null){
            front = newNode;
            back = newNode;
        } else{
            back.next = newNode;
            back = newNode;
        }
    }

    //Method to remove value from queue
    public int dequeue(){
        if(front == null){
            throw new NullPointerException("Empty queue!");
        }
        int val = front.value;
        front = front.next;

        return val;
    }

    //Return value of first node
    public int peek(){
        if(front == null){
            throw new NullPointerException("Empty queue!");
        }

        return front.value;
    }
}
