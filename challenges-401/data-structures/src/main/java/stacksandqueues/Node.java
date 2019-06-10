package stacksandqueues;

public class Node {
    //value
    int value;
    //pointer to next node
    Node next;

    //Constructors
    public Node(int val, Node theNext){
        this.value = val;
        this.next = theNext;
    }

    public Node(int val){
        this.value = val;
        this.next = null;
    }
}
