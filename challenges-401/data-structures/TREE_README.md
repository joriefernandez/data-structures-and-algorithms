# Binary and Binary Search Trees
Validate brackets ({}, (), []) if balanced or not. Paired with Liz Mahoney.

## Challenge
Created a Binary Tree and Binary Search Tree.
## Approach and Efficiency
### Binary Tree methods
* Traversals are 0(n) for time and space complexities with the use of recursion and arraylists respectively. 
### Binary Search Tree methods
* Adding and searching value takes 0(log n) for time since we keep searching the half part of tree. 0(n) space complexity for the recursion. 
## API
### Tree
* Initialization example: Tree<Integer> sample = new Tree<>()` 
#### Methods
1. preOrder - prerforms pre-order traversal where it prints the root first.. Displays the copy of the tree. 
2. inOrder - performs inorder traveral, where it goes to the left tree first.
3. postOrder - performs post order traversal. Normally used to delete tree.

### Binary Search Tree
* Initialization example: Tree<Integer> sample = new BinarySearchTree<>()` 
#### Methods
1. add - add value to the tree. Parameter can be any data type, i.e Integer, Character, etc.
2. contains - search for a value. Parameter can be any data type, i.e Integer, Character, etc.


## Source Code
* [BinarySearchTree class](./src/main/java/tree/BinarySearchTree.java)
* [BinarySearchTreeTest class](./src/main/test/tree/BinarySearchTreeTest.java)
* [Tree class](./src/main/java/tree/Tree.java)
* [TreeTest class](./src/main/test/tree/TreeTest.java)
* [Node](./src/main/java/tree/Node.java))

