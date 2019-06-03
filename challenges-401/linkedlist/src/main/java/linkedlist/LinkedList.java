package linkedlist;

import java.util.ArrayList;
import java.util.List;


public class LinkedList {

    //Head node
    Node head;

    //Node class that contains value and next node
    protected static class Node {
        //value
        int value;
        //pointer to next node
        Node next;

        //Constructors
        public Node(){
            int value = 0;
            next = null;
        }

        public Node(int val, Node theNext){
            this.value = val;
            this.next = theNext;
        }

        public Node(int val){
            this.value = val;
            this.next = null;
        }

    }

    //Constructor
    public LinkedList(Node theNode){
        this.head = theNode;
    }

    public LinkedList(){
        this.head = null;
    }

    //Methods

    /**
     * Method to insert value to the list.
     * @param value number to be inserted
     */
    public void insert(int value){
        Node current = new Node(value, head);
        head = current;
    }

    //Method to check if value is the list

    /**
     * Method to check if value is in the list
     * @param searchValue value to search
     * @return true - if value is in the list
     *         false - if value is not in the list
     */
    public boolean includes(int searchValue) {
        //current node
        Node current = head;

        //Loop through the list and check if the search value is equal to the
        // current node's value
        while (current != null) {

            if (current.value == searchValue) {
                return true;
            }

            current = current.next;
        }

        return false;
    }

    /**
     * Method to print all values
     * @return list of values
     */
    public List<Integer> print(){
        //Current node
        Node current = head;
        //result array
        List<Integer> result = new ArrayList<>();

        //Loop while current node is not null
        while(current != null){
            result.add(current.value);
            current = current.next;
        }

        return result;
    }
}