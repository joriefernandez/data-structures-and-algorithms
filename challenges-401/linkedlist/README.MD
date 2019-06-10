# Stack and Queue
Implemented a stack and queue data structures using Node class.

## Challenge
Create a [Stack](https://github.com/joriefernandez/data-structures-and-algorithms/blob/master/challenges-401/linkedlist/src/main/java/stacksandqueues/Stack.java) and [Queue](https://github.com/joriefernandez/data-structures-and-algorithms/blob/master/challenges-401/linkedlist/src/main/java/stacksandqueues/Queue.java) classes with methods under src folder for the two data structure based from [Node class](https://github.com/joriefernandez/data-structures-and-algorithms/blob/master/challenges-401/linkedlist/src/main/java/stacksandqueues/Node.java). [Test classes](https://github.com/joriefernandez/data-structures-and-algorithms/tree/master/challenges-401/linkedlist/src/test/java/stacksandqueues) are also implemented.
 
## Approach & Efficiency
Created a Node class with corresponding constructors and a Stack and Queue classes with methods and constructors. Methods:
* Stack
1. push - Time and Space complexities: 0(1). The value is inserted at the start of the list.
2. pop - Time complexity: 0(1) and Space Complexity: 0(1). Access top property of the stack.
3. peek - Time and space complexities: 0(1). Access top property of the stack
* Queue
1. enqueue - Time and Space complexities: 0(1). Use the back property to add the value.
2. dequeue - Time complexity: 0(1) and Space Complexity: 0(1). Use the front property to remove and return value.
3. peek - Time complexity: 0(1) and Space Complexity: 0(1). Use front property to return value.

## API
### Stack Initialization
Creates a null Stack.
* Example: Stack sample = new Stack();
Methods:
1. push
* Method to insert value to the stack. Parameter is the integer value to be inserted.

* Example: `sample.push(1)`
2. pop
* Method to remove and return the top value. No parameter.

* Example: `sample.pop()`
3. peek
* Method to return top value without removing. No parameter to pass. 

* Example: `sample.peek()`

### Queue Initialization
Creates a null queue.

* Example: Queue sample = new Queue();
Methods:
1. enqueue
* Method to insert value to the queue. Parameter is the integer value to be inserted.

* Example: `sample.enqueue(1)`
2. dequeue
* Method to remove and return the top value. No parameter.

* Example: `sample.dequeue()`
3. peek
* Method to return top value without removing. No parameter to pass. 

* Example: `sample.peek()`
