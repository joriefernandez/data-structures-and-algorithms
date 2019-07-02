# Lecture Notes: Merge Sort
Merge sort is an example of divide-and-conquer algorithm. This algorithm is interesting to us because:
* better time efficiency but
* uses extra space
* proper implementation may differ depending on the programming language
* often implemented recursively 

## Learning Objective
* Understand what merge sort is and its implementation

## Lecture Flow
* Merge sort was invented by John von Neumann in 1945. 
* The algorithm can be described as the following 2 step process:
  1. Divide: In this step, we divide the input array into 2 halves, the pivot being the midpoint of the array. This step is carried out recursively for all the half arrays until there are no more half arrays to divide.
  2. Conquer: In this step, we sort and merge the divided arrays from bottom to top and get the sorted array.
* Time Complexity:
  The list of size N is divided into a max of log n parts, and the merging of all sublists into a single list takes O(n)  time, the worst case run time of this algorithm is O(nlogn).
* Space Complexity: Since we are creating halved arrays, the complexity is O(n).

## Diagram
![alt merge_sort](../../challenges-401/assets/mergesort.jpg)

## Algorithm
1. Divide the unsorted list into n sublists, each containing 1 element (a list of 1 element is considered sorted).
2. Repeatedly merge sublists to produce new sorted sublists until there is only 1 sublist remaining. This will be the sorted list.

## Pseudocode

```
ALGORITHM Mergesort(arr)
    DECLARE n <-- arr.length
           
    if arr.length > 1
      DECLARE mid <-- n/2
      DECLARE b <-- arr[0...mid]
      DECLARE c <-- arr[mid...n]
      // break down the left side
      Mergesort(b)
      // break down the right side
      Mergesort(c)
      // merge the left and the right side together
      Merge(b, c, arr)

ALGORITHM Merge(b, c, a)
    DECLARE i <-- 0
    DECLARE j <-- 0
    DECLARE k <-- 0

    while i < b && j < c
        if b[i] <= c[j]
            a[k] <-- b[i]
            i <-- i + 1
        else
            a[k] = c[j]
            j <-- j + 1
            
        k <-- k + 1

    if i = b.length
       add remaining items in array c to array a
    else
       add remaining items in array b to array a
       
    return a

```

## Readings and References 
### Watch 
* https://www.youtube.com/watch?v=TzeBrDU-JaY&t=65s

### Read
* https://www.hackerearth.com/practice/algorithms/sorting/merge-sort/tutorial/
* https://www.baeldung.com/java-merge-sort

### Bookmark
* https://algs4.cs.princeton.edu/22mergesort/

### Sources
* [Merge Sort]((./src/main/java/sortingAlgo/MergeSort.java))
* [Merge Sort Test]((./src/test/java/sortingAlgo/MergeSortTest.java))

