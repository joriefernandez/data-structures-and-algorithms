# Challenge 3 Summary
Use binary search to search a one-dimensional array in Java. Source and test codes are found in src folder.

## Challenge Description
The task is to write a function called BinarySearch which takes in 2 parameters: a sorted array and the search key. Without utilizing any of the built-in methods available to Java, return the array index where the search key is found. If not, return -1.

## Approach & Efficiency
The approach uses a dive and conquer algorithm since the only half part is searched. I used while loop to iterate through the array, each time dividing the search range based from the middle value and target value. Time complexity of the algorithm is 0(log n) since every iteration we divide the search range by 2 and space complexity is 0(1) from declaring the index variables.

## Solution
* [Code](https://github.com/joriefernandez/data-structures-and-algorithms/blob/master/challenges-401/binarySearch/src/main/java/binarySearch/BinarySearch.java)
* [Unit Tests](https://github.com/joriefernandez/data-structures-and-algorithms/blob/master/challenges-401/binarySearch/src/test/java/binarySearch/BinarySearchTest.java)
* Whiteboard
![alt array_binary_search](https://raw.githubusercontent.com/joriefernandez/data-structures-and-algorithms/master/challenges-401/assets/array_binary_search.jpg)
