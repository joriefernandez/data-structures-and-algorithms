# Singly Linked List
Implemented a singly linked list data structure.

## Challenge
Create a [LinkedList and Node classes](https://github.com/joriefernandez/data-structures-and-algorithms/blob/master/challenges-401/linkedlist/src/main/java/linkedlist/LinkedList.java) under src folder for singly linked list. [Test class](https://github.com/joriefernandez/data-structures-and-algorithms/blob/master/challenges-401/linkedlist/src/test/java/linkedlist/LinkedListTest.java) is also implemented.

## Approach & Efficiency
Created a Node class with corresponding constructors and a LinkedList class with methods and constructors. Methods:
1. insert - Time and Space complexities: 0(1). The value is inserted at the start of the list.
2. includes - Time complexity: 0(n) and Space Complexity: 0(1). Searching involves looping through the list.
3. print - Time and space complexities: 0(n). Looping through all nodes.
4. append - Time and Space complexities: 0(1). We are just getting the tail to append the new node. 
5. insertBefore - Time complexity: 0(n) and Space Complexity: 0(1). Looping through the list to find and insert the new value.
6. insertBefore - Time complexity: 0(n) and Space Complexity: 0(1). Looping through the list to find and insert the new value.
## API
### Initialization
Creates a null list. Example: LinkedList sample = new LinkedList();
### Methods:
#### 1. insert 
Method to insert value to the list. Parameter is the value to be inserted.
* Example: `sample.insert(1)`
#### 2. includes
Method to find if a value exist. Parameter is the value to be searched.
* Example: `sample.includes(1)`
#### 3. print
Method to print all values in the list. No parameter to pass. Returns list of values.
* Example: `sample.print()`
#### 4. append
Method to insert a value at the end of the list. Parameter is an integer value.
* Example: `sample.append(4)`
#### 5. insertBefore
Method to insert a value before a value in the list. Parameter is an integer value that is in the list and the new value to be inserted.
* Example: `sample.insertBefore(4, 20)`
#### 4. insertAfter
Method to insert a value after a value in the list. Parameter is an integer value that is in the list and the new value to be inserted.
* Example: `sample.insertAfter(4, 10)`