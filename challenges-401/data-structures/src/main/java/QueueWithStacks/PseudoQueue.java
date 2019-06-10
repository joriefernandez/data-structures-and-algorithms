package QueueWithStacks;

import stacksandqueues.Stack;

public class PseudoQueue {

    //first stack
    protected Stack inputStack;

    //second stack
    protected Stack outputStack;

    //Constructor
    public PseudoQueue(){
        inputStack = new Stack();
        outputStack = new Stack();
    }

    public void enqueue(int value){
        //add to the input stack
        inputStack.push(value);
    }

    public int dequeue(){
        int result = -1;
        if(inputStack != null) {
            copyStack(inputStack, outputStack);

            result = outputStack.pop();

            copyStack(outputStack, inputStack);
        }
        return result;
    }

    //Helper method to copy stack
    private void copyStack(Stack from, Stack to){

        while(from.getTop() != null){
            int value = from.pop();
            to.push(value);
        }
    }


}
