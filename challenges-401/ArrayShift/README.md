# Challenge 2 Summary
Insert a value into the middle index of the given array using Java. Source and test codes are found in src folder.

## Challenge Description
The task is to write a function called insertShiftArray which takes in an array and the value to be added. Without utilizing any of the built-in methods available to Java, return an array with the new value added at the middle index.

## Approach & Efficiency
The approach is to create a new array, which will contain the original and the passed values. By looping through it while checking if the traversed index is equivalent to the middle index, the passed value is inserted to the new array. Since we are creating a new array that will hold N values, space complexity is 0(n). The time complexity for the function is 0(n), since we are looping through the array.


## Solution
[Code](https://github.com/joriefernandez/data-structures-and-algorithms/blob/master/challenges-401/ArrayShift/src/main/java/ArrayShift/ArrayShift.java)
![alt array_shift](https://raw.githubusercontent.com/joriefernandez/data-structures-and-algorithms/master/challenges-401/assets/array_shift.jpg)
