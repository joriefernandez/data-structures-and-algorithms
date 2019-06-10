# PseudoQueue
Implemented queue data structure using two stacks.

## Challenge
Create a [Queue](https://github.com/joriefernandez/data-structures-and-algorithms/blob/master/challenges-401/linkedlist/src/main/java/stacksandqueues/Stack.java) and [Queue](https://github.com/joriefernandez/data-structures-and-algorithms/blob/master/challenges-401/linkedlist/src/main/java/stacksandqueues/Queue.java) classes with methods under src folder/stacksandqueus for the two data structure based from [Node class](https://github.com/joriefernandez/data-structures-and-algorithms/blob/master/challenges-401/linkedlist/src/main/java/stacksandqueues/Node.java). [Test classes](https://github.com/joriefernandez/data-structures-and-algorithms/tree/master/challenges-401/linkedlist/src/test/java/stacksandqueues) are also implemented.

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
