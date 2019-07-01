package sortingAlgo;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class InsertionSortTest {

    @Test (expected = IllegalArgumentException.class)
    public void insertionSort() {
        InsertionSort.insertionSort(null);
    }

    @Test
    public void insertionSortOneValue(){
        int[] test = new int[]{2};
        assertTrue("One value should be the same.", Arrays.equals(new int[]{2}, InsertionSort.insertionSort(test)));
    }

    @Test
    public void insertionSortSorted(){
        int[] test = new int[]{2,5,6,8,20};
        assertTrue("Values should be the same.", Arrays.equals(test, InsertionSort.insertionSort(test)));
    }

    @Test
    public void insertionSortReverseSorted(){
        int[] test = new int[]{20,8,6,5,2};
        int[] expected = new int[]{2,5,6,8,20};
        assertTrue("Values should be the same.", Arrays.equals(expected, InsertionSort.insertionSort(test)));
    }

    @Test
    public void insertionSortUnsorted(){
        int[] test = new int[]{20,2,8,6,5};
        int[] expected = new int[]{2,5,6,8,20};
        assertTrue("Values should be the same.", Arrays.equals(expected, InsertionSort.insertionSort(test)));
    }
}