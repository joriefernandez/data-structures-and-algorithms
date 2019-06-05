package linkedlist;

import java.util.ArrayList;
import java.util.List;


public class LinkedList {

    //Starting node
    Node head;

    //List size
    int size;

    //Last node
    Node tail;

    //Node class that contains value and next node
    protected static class Node {
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

    //Constructor
    public LinkedList(Node theNode){

        this.head = theNode;
        this.tail = theNode;
        this.size += 1;
    }

    public LinkedList(){

        this.head = null;
        this.tail = null;
        this.size = 0;


    }

    //Methods

    /**
     * Method to insert value to the list.
     * @param value number to be inserted
     */
    public void insert(int value){

        Node current = new Node(value, head);
        head = current;
        size += 1;
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

    /**
     * Method to insert a value at the end of the list.
     * @param value value to be inserted
     */
    public void append(int value){
        Node newNode = new Node(value);
        Node current = head;

        if(current == null){
            head = newNode;
            tail = newNode;
        } else{
            Node temp = new Node(value);
            tail.next = temp;
            tail = temp;

        }

        size += 1;

    }

    /**
     * Method to insert value before a value in the list.
     * @param value marker where value is to be inserted
     * @param newVal value to be inserted
     */
    public void insertBefore(int value, int newVal) {

        Node current = head;
        boolean found = false;

        //Check if value is in the list. If not, send an error
        if(!includes(value)){
            throw new IllegalArgumentException("Value not in the list");
        }

        //Insert if value is at the beginning
        if (current.value == value) {
            insert(newVal);
            size += 1;
        //Insert between
        } else {
            while (current.next != null && !found) {
                if (current.next.value == value) {
                    Node temp = new Node(newVal);
                    temp.next = current.next;
                    current.next = temp;
                    found = true;
                    size += 1;
                } else{
                    current = current.next;
                }

            }

            if(current.next == null){
                tail = current;
            }
        }

    }

    /**
     * Method to insert new value after the search key
     * @param value searched value
     * @param newVal value to be inserted
     */
    public void insertAfter(int value, int newVal){

        //Check if value is in the list. If not, send an error
        if(!includes(value)){
            throw new IllegalArgumentException("Value not in the list");
        }

        Node current = head;
        Node last = tail;
        boolean found = false;


        if(current.value == value && size == 1){
            append(newVal);

        } else if (last.value == value){
            append(newVal);
        } else{
            while(current != null && !found){
                if(current.value == value){
                    Node temp = new Node(newVal);
                    temp.next = current.next;
                    current.next = temp;
                    size += 1;
                    found =  true;
                } else{
                    current = current.next;
                }
            }
        }
    }

    /**
     * Method to return value based from the kth position from the end
     * @param param kth position
     * @return value 
     */
    public int getKthValue(int param){

        if(param < 0 || param >= size){
            throw new IllegalArgumentException("Invalid kth value.");
        }

        int position = size - param;
        int ctr = 1;
        Node current = head;

        while(ctr < position && current != null){
            current = current.next;
            ctr += 1;
        }

        return current.value;

    }


}