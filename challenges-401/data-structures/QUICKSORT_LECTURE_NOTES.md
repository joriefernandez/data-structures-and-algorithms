# Lecture Notes: Quick Sort
Quicksort is a sorting algorithm, which is leveraging the divide-and-conquer principle. It has an average O(n log n) complexity and it’s one of the most used sorting algorithms, especially for big data volumes.

Quicksort isn’t a stable algorithm. A stable sorting algorithm is an algorithm where the elements with the same values appear in the same order in the sorted output as they appear in the input list.
## Learning Objective
* Understand what quick sort is and its implementation

## Lecture Flow
In quicksort, the input list is divided into two sub-lists by an element called pivot; one sub-list with elements less than the pivot and another one with elements greater than the pivot. This process repeats for each sub-list. Finally, all sorted sub-lists merge to form the final output.

### Choosing the pivot point
The crucial point in QuickSort is to choose the best pivot. The middle element is the best, as it would divide the list into two equal sub-lists.

But finding the middle element from an unordered list is difficult and time-consuming, that is why we take as pivot the first element, the last element, the median or any other random element.

### Time complexity
In the best case, the algorithm will divide the list into two equal size sub-lists. So, the first iteration of the full n-sized list needs O(n). Sorting the remaining two sub-lists with n/2 elements takes 2*O(n/2) each. As a result, the QuickSort algorithm has the complexity of O(n log n).

In the worst case, the algorithm will select only one element in each iteration, so O(n) + O(n-1) + … + O(1), which is equal to O(n2).

On the average QuickSort has O(n log n) complexity, making it suitable for big data volumes.


## Diagram
![alt quick_sort](../../challenges-401/assets/quicksort.png)

## Algorithm
First, quicksort determines something called a pivot, which is a somewhat arbitrary element in the collection.

Next, using the pivot point, it partitions (or divides) the larger unsorted collection into two, smaller lists. It uses some smart logic to decide how to do the partitioning: it moves all the elements smaller than the pivot to the left (before) the pivot element, and moves all the elements larger than the pivot to the right (after) the pivot element.
## Pseudocode

```
ALGORITHM QuickSort(arr, left, right)
    if left < right
        // Partition the array by setting the position of the pivot value 
        DEFINE position <-- Partition(arr, left, right)
        // Sort the left
        QuickSort(arr, left, position - 1)
        // Sort the right
        QuickSort(arr, position + 1, right)

ALGORITHM Partition(arr, left, right)
    // set a pivot value as a point of reference
    DEFINE pivot <-- arr[right]
    // create a variable to track the largest index of numbers lower than the defined pivot
    DEFINE low <-- left - 1
    for i <- left to right do
        if arr[i] <= pivot
            low++
            Swap(arr, i, low)

     // place the value of the pivot location in the middle.
     // all numbers smaller than the pivot are on the left, larger on the right. 
     Swap(arr, right, low + 1)
    // return the pivot index point
     return low + 1

ALGORITHM Swap(arr, i, low)
    DEFINE temp;
    temp <-- arr[i]
    arr[i] <-- arr[low]
    arr[low] <-- temp
```
### Source Codes
* [Quick Sort](./src/main/java/sortingAlgo/QuickSort.java)
* [Quick Sort Test](./src/test/java/sortingAlgo/QuickSortTest.java)

## Readings and References 
### Watch 
* https://www.youtube.com/watch?v=COk73cpQbFQ&t=96s

### Read
* https://medium.com/basecs/pivoting-to-understand-quicksort-part-1-75178dfb9313
* https://www.geeksforgeeks.org/quick-sort/

### Bookmark
* https://www.baeldung.com/java-quicksort


